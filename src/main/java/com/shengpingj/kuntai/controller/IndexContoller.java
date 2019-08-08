package com.shengpingj.kuntai.controller;

import com.shengpingj.kuntai.common.DoubleFormatText;
import com.shengpingj.kuntai.common.IntegerConverDate;
import com.shengpingj.kuntai.mapper.WP_BalanceMapper;
import com.shengpingj.kuntai.mapper.WP_ConfigMapper;
import com.shengpingj.kuntai.mapper.WP_OrderMapper;
import com.shengpingj.kuntai.mapper.WP_UserinfoMapper;
import com.shengpingj.kuntai.pojo.WP_Order;
import com.shengpingj.kuntai.pojo.vo.UserOrder;
import com.shengpingj.kuntai.service.BalanceSevice;
import com.shengpingj.kuntai.service.OrderService;
import com.shengpingj.kuntai.service.UserService;
import com.shengpingj.kuntai.service.WP_ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class IndexContoller {
    @Autowired
    private WP_ConfigService wp_configService;
    @Autowired
    private UserService userService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private BalanceSevice balanceSevice;
    @RequestMapping("/admin/index")
    public String indexAdmin(Model model,HttpSession session){
        Integer otype = (Integer) session.getAttribute("session");
        Integer uid = (Integer) session.getAttribute("uid");
        model.addAttribute("xtgg",wp_configService.selectByName("web_gg").getValue());
        model.addAttribute("insert_user",userService.selectAllUserByTime());
        model.addAttribute("all_user",userService.selectAllUserCount());
        model.addAttribute("all_usermoney", DoubleFormatText.doubleFormat(userService.selectAllUserMoneySum()));
        model.addAttribute("tody_order",orderService.selectAllOrderByTime());
        model.addAttribute("tody_profit",orderService.sumPlossByTime() !=null?DoubleFormatText.doubleFormat(orderService.sumPlossByTime()) : 0);
        model.addAttribute("tody_fee",orderService.sumFeeByTime() != null ? DoubleFormatText.doubleFormat(orderService.sumFeeByTime()):0);
        model.addAttribute("tody_recharge",balanceSevice.sumBppriceByTimeAndbptype(1,1) !=null ?DoubleFormatText.doubleFormat(balanceSevice.sumBppriceByTimeAndbptype(1,1)) : 0);
        model.addAttribute("tody_get",balanceSevice.sumBppriceByTimeAndbptype(0,1) !=null ?DoubleFormatText.doubleFormat(balanceSevice.sumBppriceByTimeAndbptype(0,1)):0);
        model.addAttribute("tody_shouxu",orderService.sumSxFeeByTime() != null ? DoubleFormatText.doubleFormat(orderService.sumSxFeeByTime()):0);
        List<UserOrder> userOrders = null;
        if (otype != null && otype == 3) {
             userOrders = orderService.selectOrderLimit();
        }else {
            List<Integer> ids = userService.selectAllUserIdByOid(uid);

            userOrders = orderService.selectOrderLimitByUids(ids);
        }
        for (int i = 0 ; i< userOrders.size(); i++){
            UserOrder userOrder = userOrders.get(i);
            userOrder.setTimebuy(IntegerConverDate.IntegerCovDate(userOrder.getBuytime()));
        }
        model.addAttribute("order",userOrders);
        return "admin/index/index";
    }
}
