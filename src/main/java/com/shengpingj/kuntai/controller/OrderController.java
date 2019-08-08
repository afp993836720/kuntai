package com.shengpingj.kuntai.controller;

import com.shengpingj.kuntai.common.IntegerConverDate;
import com.shengpingj.kuntai.pojo.WP_Order_Log;
import com.shengpingj.kuntai.pojo.vo.GetData;
import com.shengpingj.kuntai.pojo.vo.GoodsView;
import com.shengpingj.kuntai.pojo.vo.OrderLog;
import com.shengpingj.kuntai.pojo.vo.UserOrder;
import com.shengpingj.kuntai.service.GoodsService;
import com.shengpingj.kuntai.service.OrderLogService;
import com.shengpingj.kuntai.service.OrderService;
import com.shengpingj.kuntai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class OrderController {
//    @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
    @Autowired
    private UserService userService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderLogService orderLogService;
    @Autowired
    private GoodsService goodsService;
    @RequestMapping("/admin/order/orderlist")
    public String orderList(GetData getData, Model model, HttpSession session){
        //System.out.println(getData);
        model.addAttribute("getdata",getData);
        model.addAttribute("type",1);
        Integer otype = (Integer) session.getAttribute("otype");
        Integer uid = (Integer) session.getAttribute("uid");
        List<UserOrder> orders = null;
        if (otype != null && otype == 3) {
            orders = orderService.selectAllOrder();
        }else{
            List<Integer> ids = userService.selectAllUserIdByOid(uid);
            orders = orderService.selectAllOrderByUids(ids);
        }
        for (int i = 0 ; i< orders.size(); i++){
            UserOrder userOrder = orders.get(i);
            userOrder.setTimebuy(IntegerConverDate.IntegerCovDate(userOrder.getBuytime()));
        }
        List<GoodsView> prolist = goodsService.selectAllGoods();
        model.addAttribute("prolist",prolist);
        model.addAttribute("iskong",1);
      ///  System.out.println(orders);
        if (orders.size() == 0){
            model.addAttribute("noorder",1);
        }
        model.addAttribute("order",orders);
        return "admin/order/orderlist";
    }
    @RequestMapping("/admin/order/orderlog")
    public String orderLog(GetData getData, Model model,HttpSession session){
        Integer otype = (Integer) session.getAttribute("otype");
        Integer uid = (Integer) session.getAttribute("uid");
        List<Integer> ids = null;
        List<OrderLog> orderlogs = null;
        if (otype != null && otype == 3){

            orderlogs = orderLogService.selectAllOrderLog();
        }else {
            ids = userService.selectAllUserIdByOid(uid);
            orderlogs = orderLogService.selectAllOrderLogByIds(ids);
        }
        for (int i = 0 ; i < orderlogs.size();i++){
           //  System.out.println(orderlogs.get(i));
            orderlogs.get(i).setStrtime(IntegerConverDate.IntegerCovDate( orderlogs.get(i).getTime()));
        }
        model.addAttribute("getdata",getData);
        model.addAttribute("orderlogs",orderlogs);
        return "admin/order/orderlog";
    }
    @RequestMapping("/admin/order/orderinfo")
    public String orderLog(Integer oid, Model model){
        UserOrder userOrder = orderService.selectOrderByOid(oid);
       // System.out.println(userOrder);
        //System.out.println(oid);

        userOrder.setTimebuy(IntegerConverDate.IntegerCovDate(userOrder.getBuytime()));
        userOrder.setTimesell(IntegerConverDate.IntegerCovDate(userOrder.getSelltime()));
        model.addAttribute("order",userOrder);
        return "admin/order/orderinfo";
    }
}
