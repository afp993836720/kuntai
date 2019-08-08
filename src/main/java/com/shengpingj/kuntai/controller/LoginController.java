package com.shengpingj.kuntai.controller;

import com.shengpingj.kuntai.common.PasswordMD5;
import com.shengpingj.kuntai.pojo.WP_Userinfo;
import com.shengpingj.kuntai.pojo.vo.AjaxData;
import com.shengpingj.kuntai.pojo.vo.LoginUser;
import com.shengpingj.kuntai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;
    @RequestMapping("/admin")
    public String adminLogin(){
        return "admin/login/login";
    }
    @RequestMapping(value = "admin/login",method = RequestMethod.POST)
    @ResponseBody
    public AjaxData loginAdmin(LoginUser loginUser, HttpSession session){
        //System.out.println(loginUser);
      //  System.out.println(session.getAttribute("userid"));
        if (session.getAttribute("userid") != null ){
            return new AjaxData("您已登录,请不要重复登录",1);
        }
        if (loginUser != null){
            //查询出对应的用户名
            WP_Userinfo wp_userinfo = userService.selectUserByUserNameOrUtel(loginUser.getUsername());
           // System.out.println(wp_userinfo);
            if (wp_userinfo == null){
                //System.out.println(33333);
                return new AjaxData("登陆失败，用户名不存在",-1);
            }else{
              //  System.out.println(2222);
                if (wp_userinfo.getOtype() == 0){
                    return new AjaxData("您无权登陆",-1);

                }
                if (PasswordMD5.passwordChecking(loginUser.getPassword(),wp_userinfo.getUpwd())){
                    if (wp_userinfo.getOtype() != 0 && wp_userinfo.getUstatus() == 0){
                      //  System.out.println(11111);
                        boolean flag = userService.updateUserLoginTime(String.valueOf(new Date().getTime()),wp_userinfo.getUid());
                        session.setAttribute("otype",wp_userinfo.getOtype());
                        session.setAttribute("uid",wp_userinfo.getUid());
                        session.setAttribute("username",wp_userinfo.getUsername());
                        return new AjaxData("登陆成功",1);
                    }else if (wp_userinfo.getUstatus() == 1){
                        return new AjaxData("登陆失败，您的账户暂时被冻结",-1);

                    }else{
                        return new AjaxData("登陆失败，用户名不存在",-1);
                    }
                }else{
                    return new AjaxData("登陆失败，密码错误",-1);
                }

            }

        }
        return null;
    }
    @RequestMapping("admin/logout")
    public String loginOut(HttpSession session){
        Integer uid = (Integer) session.getAttribute("uid");
        int i = userService.updateUserLastlogTime(String.valueOf(new Date().getTime()),uid);
        session.removeAttribute("otype");
        session.removeAttribute("username");
        session.removeAttribute("uid");
        return "admin/login/login";
    }
}
