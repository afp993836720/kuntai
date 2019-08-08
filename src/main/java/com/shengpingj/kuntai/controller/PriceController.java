package com.shengpingj.kuntai.controller;

import com.shengpingj.kuntai.common.DoubleFormatText;
import com.shengpingj.kuntai.common.IntegerConverDate;
import com.shengpingj.kuntai.common.TodayDate;
import com.shengpingj.kuntai.pojo.WP_Price_Log;
import com.shengpingj.kuntai.pojo.vo.GetData;
import com.shengpingj.kuntai.pojo.vo.MyPriceView;
import com.shengpingj.kuntai.pojo.vo.PriceListView;
import com.shengpingj.kuntai.pojo.vo.PriceLogView;
import com.shengpingj.kuntai.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
public class PriceController {
    @Autowired
    private UserService userService;
    @Autowired
    private BalanceSevice balanceSevice;
    @Autowired
    private PriceLOgService priceLOgService;
    @Autowired
    private OrderService orderService;
    @RequestMapping("admin/price/allot")
    public String allot(GetData getData,HttpSession session, Model model){
        Integer uid = (Integer) session.getAttribute("uid");
        Integer otype = (Integer) session.getAttribute("otype");
        model.addAttribute("getdata",getData);
        List<PriceLogView> list = null;
        if (otype != null && otype == 3){
            list = priceLOgService.selectAllPriceLog(getData,null);
        }else if (otype != null && otype == 101){
            list = priceLOgService.selectAllPriceLog(getData,uid);
        }else {
            list = new ArrayList<PriceLogView>();
        }
        model.addAttribute("list",list);
        return "admin/price/allot";
    }
    @RequestMapping("admin/price/yongjin")
    public String yongjin(GetData getData,HttpSession session, Model model){
        Integer uid = (Integer) session.getAttribute("uid");
        Integer otype = (Integer) session.getAttribute("otype");
        model.addAttribute("getdata",getData);
        List<PriceLogView> list = null;
        if (otype != null && otype == 3){
            list = priceLOgService.selectAllPriceLog(getData,null);

        }else if (otype != null && otype == 101){
            list = priceLOgService.selectAllPriceLog(getData,uid);
        }else {
            list = new ArrayList<PriceLogView>();
        }
        model.addAttribute("list",list);
        return "admin/price/yongjin";
    }
    @RequestMapping("/admin/price/pricelist")
    public String priceList(GetData getData, HttpSession session, Model model){
        GetData get = new GetData();
        get.setUsername(getData.getUsername());

        Integer otype = (Integer) session.getAttribute("otype");
        Integer uid = (Integer) session.getAttribute("uid");
        List<PriceListView> priceListViews = null;
        if (otype != null && otype==3){
            priceListViews = userService.selectAllUserByGetDateAndIds(getData,null);
        }else{
            if (uid !=null){
                List<Integer> integers = userService.selectAllUserIdByOid(uid);
                priceListViews = userService.selectAllUserByGetDateAndIds(getData,integers);
            }
        }
        if (priceListViews!= null){
            for (PriceListView view : priceListViews) {
   //             System.out.println(view.getUid());
                view.setAll_res(balanceSevice.SumBPrice(view.getUid(),1,1,getData));
               // System.out.println(view.getAll_res());
                view.setAll_res_count(balanceSevice.CountBPrice(view.getUid(),1,1,getData));
                view.setAll_cash(balanceSevice.SumBPrice(view.getUid(),0,1,getData));
               // System.out.println(view.getAll_cash());
                view.setAll_cash_count(balanceSevice.CountBPrice(view.getUid(),0,1,getData));
                view.setAll_cash_shenhe(balanceSevice.SumBPrice(view.getUid(),0,0,getData));
                view.setAll_yj(priceLOgService.SumAccount(view.getUid(),"手续费",getData));
                view.setAll_h1(priceLOgService.SumAccount(view.getUid(),"红利",getData));
                if (view.getAll_cash() !=null&&view.getAll_res()!=null) {
                    view.setRes_cash(view.getAll_res() - view.getAll_cash());
                }else{
                    view.setRes_cash(null);
                }

                view.setTody_ploss(orderService.SumPloss(view.getUid(),getData));
                view.setAll_sx_fee(orderService.SumSxFee(view.getUid()));
                view.setAll_ploss(orderService.SumPloss(view.getUid(),getData));
                view.setAll_cash_shoudong(balanceSevice.SumBPrice(view.getUid(),2,1,getData));
                if (view.getAll_cash() !=null&&view.getAll_res()!=null&&view.getAll_cash_shoudong()!=null &&view.getAll_ploss()!=null&&view.getAll_yj()!=null&&view.getAll_h1()!=null&&view.getAll_cash_shenhe()!=null&&view.getAll_sx_fee()!=null) {
                    view.setShiji_money(view.getAll_cash_shoudong() + view.getAll_ploss()+view.getAll_res()+view.getAll_yj()+view.getAll_h1()+view.getAll_cash()+view.getAll_cash_shenhe()+view.getAll_sx_fee());
                }else{
                    view.setShiji_money(null);
                }
            }
        }
        String start = null;
        String end = null;
        model.addAttribute("list",priceListViews);
        if (getData.getStarttime() != null){
            start = IntegerConverDate.IntegerCovDate(Long.valueOf(getData.getStarttime()));
        }

        if (getData.getEndtime() !=null){

           end = IntegerConverDate.IntegerCovDate(Long.valueOf(getData.getEndtime()));
        }
        get.setStarttime(start);
        get.setEndtime(end);
        model.addAttribute("getdata",get);
        return "admin/price/pricelist";
    }
    @RequestMapping("admin/price/pricesta")
    @ResponseBody
    public Map<String,Object> pricesta(HttpSession session,GetData getData) {
        Integer otype = (Integer) session.getAttribute("otype");
        Integer uid = (Integer) session.getAttribute("uid");
        Map<String,Object> map = new HashMap<String,Object>();
        if (otype != null && otype == 3) {
            map.put("all_res", DoubleFormatText.doubleFormat(balanceSevice.SumBPrice(null,1,1,null)));
            //   System.out.println(balanceSevice.SumBPrice(null,1,1,null));
            map.put("all_cash",DoubleFormatText.doubleFormat(balanceSevice.SumBPrice(null,0,1,null)));
           map.put("all_yj",priceLOgService.SumAccount(uid,"手续费",getData));
            map.put("all_hl",priceLOgService.SumAccount(uid,"红利",getData));
            map.put("tody_ploss",orderService.SumPloss(null,getData));
            map.put("all_lis",DoubleFormatText.doubleFormat(orderService.SumPloss(null,null)));
        } else {
            if (uid != null){
                List<Integer> integers = userService.selectAllUserIdByOid(uid);
                if (balanceSevice.SumBPriceByIds(integers,1,1,null) != null){

                    map.put("all_res", DoubleFormatText.doubleFormat(balanceSevice.SumBPriceByIds(integers,1,1,null)));
                }else{
                    map.put("all_res",0);
                }
                if (balanceSevice.SumBPriceByIds(integers,0,1,null) != null){

                    map.put("all_cash", DoubleFormatText.doubleFormat(balanceSevice.SumBPriceByIds(integers,0,1,null)));
                }else{
                    map.put("all_cash",0);
                }
                map.put("all_yj",priceLOgService.SumAccountByIds(integers,"手续费",getData));
                map.put("all_hl",priceLOgService.SumAccountByIds(integers,"红利",getData));
                map.put("tody_ploss",orderService.SumPlossByIds(integers,getData));
                if (orderService.SumPlossByIds(integers,null) !=null){

                    map.put("all_lis",DoubleFormatText.doubleFormat(orderService.SumPlossByIds(integers,null)));
                }else{
                    map.put("all_lis",0);
                }
            }else{
                map.put("all_res",0);
                map.put("all_cash",0);
                map.put("all_yj",0);
                map.put("all_hl",0);
                map.put("tody_ploss",0);
                map.put("all_lis",0);
            }
        }
        return map;
    }
    @RequestMapping("/admin/price/myprice")
    public String myprice(Model model,HttpSession session,GetData getData){
        Integer otype = (Integer) session.getAttribute("otype");
        Integer uid = (Integer) session.getAttribute("uid");
        List<MyPriceView> list = null;
        if (getData.getStarttime() !=null){
            if (getData.getEndtime() == null){
                getData.setEndtime(String.valueOf(TodayDate.endTime()));
            }
        }
        if (otype!=null && otype == 3){
            list = priceLOgService.selectAllMyPriceView(null,getData);
        }else {
            list = priceLOgService.selectAllMyPriceView(uid,getData);
        }
        if (getData.getStarttime() !=null){
            getData.setStarttime(IntegerConverDate.IntegerCovDate(Long.valueOf(getData.getStarttime())));
            if (getData.getEndtime() == null){
                getData.setEndtime(String.valueOf(TodayDate.endTime()));
            }
        }
        if(list!=null){
            for (MyPriceView view : list) {
                view.setTime(IntegerConverDate.IntegerCovDate(Long.valueOf(view.getTime())));
            }
        }
        model.addAttribute("getdata",getData);
        model.addAttribute("list",list);
        return "admin/price/myprice";
    }
}
