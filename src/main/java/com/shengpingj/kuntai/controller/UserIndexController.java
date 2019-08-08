package com.shengpingj.kuntai.controller;

import com.shengpingj.kuntai.pojo.WP_Productinfo;
import com.shengpingj.kuntai.pojo.vo.GoodsView;
import com.shengpingj.kuntai.pojo.vo.UserGoodsView;
import com.shengpingj.kuntai.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserIndexController {
    @Autowired
    private GoodsService goodsService;
    @RequestMapping("index/index")
    public String Index(Model model){
        List<UserGoodsView> goodsViews = goodsService.selectAllGoodsByAjax();
        for (UserGoodsView view : goodsViews) {
            System.out.println(view.getPrice());
        }
        model.addAttribute("pro",goodsViews);
        return "index/view/index/index";
    }
    @RequestMapping("/index/index/ajaxindexpro")
    @ResponseBody
    public List<UserGoodsView> ajaxIndexPro(){
        List<UserGoodsView> goodsViews = goodsService.selectAllGoodsByAjax();

//        System.out.println(goodsViews);
        return goodsViews;
    }
}
