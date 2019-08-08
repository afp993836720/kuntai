package com.shengpingj.kuntai.controller;

import com.shengpingj.kuntai.pojo.WP_Productclass;
import com.shengpingj.kuntai.pojo.WP_Productinfo;
import com.shengpingj.kuntai.pojo.WP_Risk;
import com.shengpingj.kuntai.pojo.WP_RiskWithBLOBs;
import com.shengpingj.kuntai.pojo.vo.AjaxData;
import com.shengpingj.kuntai.pojo.vo.GoodsView;
import com.shengpingj.kuntai.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class GoodsController {
    @Autowired
    private GoodsService goodsService;
    @RequestMapping("/admin/goods/prolist")
    public String prolist(Model model){
        List<GoodsView> goodsViews =  goodsService.selectAllGoods();
        model.addAttribute("goods",goodsViews);
        return "admin/goods/prolist";
    }
    @RequestMapping("/admin/goods/proadd")
    public String proadd( Integer pid, Model model){
       // System.out.println(pid);
        List<WP_Productclass> wp_productclasses = goodsService.selectAllProClass();
        model.addAttribute("proclasss",wp_productclasses);
        if (pid == null){
            model.addAttribute("goods",new GoodsView());
        }else {
            GoodsView goodsView = goodsService.selectGoodsById(pid);
            //System.out.println(goodsView.getPoint_low());
            model.addAttribute("goods", goodsView);
        }
        return "admin/goods/proadd";
    }
    @RequestMapping("/admin/goods/delpro")
    @ResponseBody
    public AjaxData delpro(Integer id){

     //   System.out.println(11111);
        if (id == null){
           return new AjaxData("参数错误",-1);
        }
        boolean flag = goodsService.updateGoodsById(id);
        if (flag){
            return new AjaxData("删除成功",1);
        }
        return new AjaxData("删除失败",-1);
    }
    @RequestMapping("/admin/goods/proisopen")
    @ResponseBody
    public AjaxData proisopen(Integer isopen, Integer pid, HttpSession session){
        Integer otype = (Integer) session.getAttribute("otype");
       // System.out.println(otype);
        if (otype != 3) {
            return new AjaxData("您权限不够，请提升权限", -1);
        }
        boolean flag = goodsService.updateGoodsIsOpenById(isopen,pid);
        if (flag){
            return new AjaxData("修改成功",1);
        }else{
            return new AjaxData("修改失败",-1);
        }
    }
    @RequestMapping("/admin/goods/proclass")
    public String proclass(Model model){
        model.addAttribute("productclass",goodsService.selectAllProClass());
        return "admin/goods/proclass";
    }
    @RequestMapping("/admin/goods/deleteclass")
    @ResponseBody
    public AjaxData deleteclass(Integer id){

       // System.out.println(11111);
        if (id == null){
            return new AjaxData("参数错误",-1);
        }
        boolean flag = goodsService.updateProClassByPcid(id);
        if (flag){
            return new AjaxData("删除成功",1);
        }
        return new AjaxData("删除失败",-1);
    }
    @RequestMapping("/admin/goods/editclass")
    @ResponseBody
    public AjaxData editclass(WP_Productclass wp_productclass){
        if (wp_productclass != null){
            if (wp_productclass.getPcid() != null){
                boolean b = goodsService.updateProClassPcnameByPcid(wp_productclass);
                if (b){
                    return new AjaxData("修改成功",1);
                }else{
                    return new AjaxData("修改失败",-1);
                }
            }else{
                boolean flag = goodsService.insertProClass(wp_productclass);
                if (flag){
                    return new AjaxData("添加成功",1);
                }else{
                    return new AjaxData("添加失败",-1);
                }
            }
        }
        return new AjaxData("参数错误",-1);
    }
    @RequestMapping("/admin/goods/risk")
    public String risk(Model model){
        WP_RiskWithBLOBs wp_risks = goodsService.selectAllRisk();
       // System.out.println(wp_risks.getMinPrice());
        model.addAttribute("risk",wp_risks);
        return "admin/goods/risk";
    }
    @RequestMapping(value = "/admin/goods/addrisk",method = RequestMethod.POST)
    @ResponseBody
    public AjaxData addRisk(WP_RiskWithBLOBs wp_riskWithBLOBs,HttpSession session){
        Integer otype = (Integer) session.getAttribute("otype");
        Integer ids = null;
        if (otype == 3){
            if (wp_riskWithBLOBs.getId() != null){
                ids = goodsService.updatetRiskById(wp_riskWithBLOBs);
            }else{
                ids = goodsService.insertRiskById(wp_riskWithBLOBs);
            }
            if (ids > 0 ){
                return new AjaxData("操作成功",1);
            }else{
                return new AjaxData("操作失败",-1);
            }
        }else{
            return new AjaxData("您无权修改，请提高权限后再来",-1);
        }
    }
    @RequestMapping("/admin/goods/huishou")
    public String huishou(Model model){
        List<GoodsView> goodsViews = goodsService.selectGoodsByIsDelete();
        model.addAttribute("proinfo",goodsViews);
        return "admin/goods/huishou";
    }
    @RequestMapping("/admin/goods/hypro")
    @ResponseBody
    public AjaxData hypro(Integer id,HttpSession session){
        Integer otype = (Integer) session.getAttribute("otype");
        if (otype !=  null) {
            //boolean flag = goodsService.updateIsDeleteById(id);
            if (otype == 3) {
                if (true) {
                    return new AjaxData("修改成功", 1);
                }
                return new AjaxData("修改失败", -1);
            }
        }
        return new AjaxData("您无权操作，请提升权限",-1);
    }
}
