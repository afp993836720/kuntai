package com.shengpingj.kuntai.controller;

import com.shengpingj.kuntai.pojo.WP_Payment;
import com.shengpingj.kuntai.pojo.vo.AjaxData;
import com.shengpingj.kuntai.service.RechargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
public class RechargeController {
    @Autowired
    private RechargeService rechargeService;
    @RequestMapping("/admin/system/recharge")
    public String recharge(HttpSession session, Model model){
        Integer otype = (Integer) session.getAttribute("otype");
        if (otype != null && otype == 3){
            List<WP_Payment> list = rechargeService.selectAllPaymentByIsUse();
            model.addAttribute("list",list);
            return "admin/system/recharge";
        }else{
            return "admin/login/login";
        }

    }
    @RequestMapping("/admin/system/addrech")
    public String addrech(HttpSession session, Model model,Integer id){
        Integer otype = (Integer) session.getAttribute("otype");
        if (otype != null && otype == 3){
            WP_Payment wp_payment = null;
            if (id != null){
                wp_payment = rechargeService.selectPaymentById(id);
                System.out.println(wp_payment.getPayConf());
            }else{
                wp_payment = new WP_Payment();
            }
            model.addAttribute("vo",wp_payment);
            return "admin/system/addrech";
        }else{
            return "admin/login/login";
        }

    }
    @RequestMapping("/admin/system/editrech")
    @ResponseBody
    public AjaxData editRech(HttpSession session,WP_Payment payment){
        Integer otype = (Integer) session.getAttribute("otype");
        payment.setDotime(String.valueOf(new Date().getTime()));
        if (otype != null && otype == 3){
            if (payment.getId() != null){
                boolean flag = rechargeService.updatePaymentByWP_Payment(payment);
                if (flag){
                    return new AjaxData("修改成功",1);
                }else{
                    return new AjaxData("修改失败",-1);
                }
            }else{

                boolean flag = rechargeService.insertPayment(payment);
                if (flag){
                    return new AjaxData("添加成功",1);
                }else{
                    return new AjaxData("添加失败",-1);
                }
            }

        }else{
            return new AjaxData("权限不足，请提升权限后再来",-1);
        }

    }
    @RequestMapping("/admin/system/deletepay")
    @ResponseBody
    public AjaxData deletepay(HttpSession session, Integer id){
        Integer otype = (Integer) session.getAttribute("otype");
        if (otype != null && otype == 3){
            boolean flag = rechargeService.deletePaymentById(id);
            if (flag){
                return new AjaxData("删除成功",1);
            }
            return new AjaxData("删除失败",-1);
        }else{
            return new AjaxData("您的权限不足,请提升后再来",-1);
        }

    }
}
