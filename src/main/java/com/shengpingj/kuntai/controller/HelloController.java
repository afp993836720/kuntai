package com.shengpingj.kuntai.controller;

import com.shengpingj.kuntai.common.PasswordMD5;
import com.shengpingj.kuntai.pojo.WP_Userinfo;
import com.shengpingj.kuntai.pojo.vo.AjaxData;
import com.shengpingj.kuntai.pojo.vo.LoginUser;
import com.shengpingj.kuntai.service.UserService;
import com.shengpingj.kuntai.service.WP_ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;


@Controller
public class HelloController {
    @Autowired
    private WP_ConfigService wp_configService;
    @Autowired
    private UserService userService;
    @RequestMapping("/")
    public String hello(Model model){

        model.addAttribute("web_name",wp_configService.selectByName("web_name").getValue());
        model.addAttribute("web_logo",wp_configService.selectByName("web_logo").getValue());
        return "index/view/login/login";
    }
    @RequestMapping("/login/login")
    @ResponseBody
    public AjaxData login(LoginUser loginUser,HttpSession session){
        WP_Userinfo user = userService.selectUserByUserNameOrUtel(loginUser.getUsername());
        if (user != null){
            if (user.getUpwd().equals(PasswordMD5.md5(loginUser.getUpwd()))){
                if (user.getOtype() == 0 || user.getOtype() == 101){
                    if (user.getUstatus()==0){
                        boolean flag = userService.updateUserLoginTime(String.valueOf(new Date().getTime()),user.getUid());
                        session.setAttribute("uid",user.getUid());
                        return new AjaxData("登陆成功",1);
                    }else if (user.getUstatus()==1){
                        return new AjaxData("登陆失败，您的账户暂时被冻结",-1);
                    }
                }
                return new AjaxData("您无权登陆",-1);
            }
            return new AjaxData("密码错误",-1);
        }
        return new AjaxData("用户名不存在",-1);
    }
}
