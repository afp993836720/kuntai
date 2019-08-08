package com.shengpingj.kuntai.controller;

import com.shengpingj.kuntai.pojo.WP_Banks;
import com.shengpingj.kuntai.pojo.vo.AjaxData;
import com.shengpingj.kuntai.service.BanksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class BanksController {
    @Autowired
    private BanksService banksService;
    @RequestMapping("/admin/system/banks")
    public String banks(Model model, HttpSession session){
        Integer otype = (Integer) session.getAttribute("otype");
        if (otype != null && otype == 3){
            List<WP_Banks> banks = banksService.selectAllBanks();
            model.addAttribute("banks",banks);
            return "admin/system/banks";

        }else{
            return "admin/login/login";
        }
    }
    @RequestMapping("/admin/system/editbanks")
    @ResponseBody
    public AjaxData editBanks(WP_Banks banks, HttpSession session){
        Integer otype = (Integer) session.getAttribute("otype");
        if (otype != null && otype == 3){
            if (banks.getId() != null){
                boolean flag = banksService.updateBanksById(banks);
                if (flag)
                    return new AjaxData("修改成功",1);
                else
                    return new AjaxData("修改失败",-1);
            }else {
                boolean flag = banksService.insertBanksById(banks);
                if (flag)
                    return new AjaxData("添加成功",1);
                else
                    return new AjaxData("添加失败",-1);
            }
        }else{
            return new AjaxData("权限不足,请提升权限后再来",-1);
        }
    }
    @RequestMapping("/admin/system/deletebanks")
    @ResponseBody
    public AjaxData deleteBanks(Integer id, HttpSession session){
        Integer otype = (Integer) session.getAttribute("otype");
        if (otype != null && otype == 3){
            if (banksService.deleteBanksById(id)){
                return new AjaxData("删除成功",1);
            }else{
                return new AjaxData("删除失败",-1);
            }
        }else{
            return new AjaxData("权限不足,请提升权限后再来",-1);
        }
    }
}
