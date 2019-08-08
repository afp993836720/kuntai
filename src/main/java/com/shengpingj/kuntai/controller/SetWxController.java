package com.shengpingj.kuntai.controller;

import com.shengpingj.kuntai.pojo.WP_Wechat;
import com.shengpingj.kuntai.pojo.vo.AjaxData;
import com.shengpingj.kuntai.service.WechatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class SetWxController {
    @Autowired
    private WechatService wechatService;
    @RequestMapping("/admin/system/setwx")
    public String setWx(HttpSession session, Model model){
        Integer otype = (Integer) session.getAttribute("otype");
        if (otype != null && otype == 3){
            WP_Wechat wp_wechat = wechatService.selectWechat();
            model.addAttribute("wechat",wp_wechat);
            return "admin/system/setwx";
        }else{
            return "admin/login/login";
        }
    }
    @RequestMapping("/admin/system/setwxedit")
    @ResponseBody
    public AjaxData setWx(HttpSession session, Model model, WP_Wechat wechat){
        Integer otype = (Integer) session.getAttribute("otype");
        if (otype != null && otype == 3){
            boolean flag = wechatService.updateWechatByWechat(wechat);
            if (flag){
                return new AjaxData("修改成功",1);
            }else
                return new AjaxData("修改失败",-1);
        }else{
            return new AjaxData("您权限不足，请提升权限后再来",-1);
        }
    }
}
