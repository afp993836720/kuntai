package com.shengpingj.kuntai.controller;

import com.shengpingj.kuntai.common.DoubleFormatText;
import com.shengpingj.kuntai.common.IntegerConverDate;
import com.shengpingj.kuntai.common.PasswordMD5;
import com.shengpingj.kuntai.common.TodayDate;
import com.shengpingj.kuntai.pojo.WP_Area;
import com.shengpingj.kuntai.pojo.WP_Balance;
import com.shengpingj.kuntai.pojo.WP_Userinfo;
import com.shengpingj.kuntai.pojo.vo.*;
import com.shengpingj.kuntai.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.expression.Ids;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private BalanceSevice balanceSevice;
    @Autowired
    private OrderService orderService;
    @Autowired
    private UserService userService;
    @Autowired
    private BanksService banksService;
    @Autowired
    private WP_AreaService areaService;
    @RequestMapping("/admin/user/userlist")
    public String userList(UserSearchData userSearchData,Model model, HttpSession session){
        Integer otype = (Integer) session.getAttribute("otype");
        Integer uid = (Integer) session.getAttribute("uid");

  //      System.out.println(userSearchData.getUsername());
        if (userSearchData.getToday() != null){
            userSearchData.setStarttime(String.valueOf(TodayDate.startTime()));
            userSearchData.setEndtime(String.valueOf(TodayDate.endTime()));
        }
        List<Integer> ids = null;
        List<UserView> userViews = null;
        if (otype != null && otype == 3){
            userViews = userService.selectAllUser(userSearchData);
        }else{
            ids = userService.selectAllUserIdByOid(uid);
            userSearchData.setIds(ids);
            userViews = userService.selectAllUserByIds(userSearchData);
        }
        if (userViews != null){
            for (UserView view : userViews) {
                view.setOrdernum(orderService.selectCountByUid(view.getUid()));
                String utime = view.getUtime();
                if (utime != null){

                    view.setUtime(IntegerConverDate.IntegerCovDate(Long.valueOf(utime)));
                }
                if (view.getLogintime() != null){
                    String logintime = view.getLogintime();
                    view.setLogintime(IntegerConverDate.IntegerCovDate(Long.valueOf(logintime)));
                }
            }
        }
        model.addAttribute("getdata",userSearchData);
        model.addAttribute("userinfo",userViews);
        return "/admin/user/userlist";
    }
    @RequestMapping("/admin/user/userbank")
    public String userbank(Model model,Integer uid){
        //System.out.println(uid);
        BanksView banksView = banksService.selectUserBankByUid(uid);
        String s = areaService.selectNameById(banksView.getProvinceid());
        String name = areaService.selectNameById(banksView.getCityno());
        banksView.setArea(s+"  "+name);
       // System.out.println(banksView.getArea());
        model.addAttribute("bank",banksView);
        return "admin/user/userbank";
    }

    @RequestMapping("/admin/user/doustatus")
    @ResponseBody
    public AjaxData doustatus(Integer uid,Integer ustatus,HttpSession session){

        Integer otype = (Integer) session.getAttribute("otype");
        if (otype!=null&& otype==3){

            boolean flag = userService.updateUserUstatusByUid(uid,ustatus);
            if (flag){

                return new AjaxData("修改成功",1);
            }
            return new AjaxData("修改失败",-1);
        }else if (otype!=null&&otype==101){
            boolean flag = userService.updateUserUstatusByUid(uid,ustatus);
            if (flag){

                return new AjaxData("修改成功",1);
            }
            return new AjaxData("修改失败",-1);
        }else{
            return new AjaxData("您无权修改",-1);
        }


    }
    @RequestMapping("/admin/user/dootype")
    @ResponseBody
    public AjaxData dootype(Integer uid,Integer otype,HttpSession session){
        Integer otyp = (Integer) session.getAttribute("otype");
        if (otyp!=null&& otyp==3){
            boolean flag = userService.updateUserOtypeByUid(uid,otype);
            if (flag){

                return new AjaxData("修改成功",1);
            }
            return new AjaxData("修改失败",-1);
        }else if (otyp!=null&&otyp==101){
            boolean flag = userService.updateUserOtypeByUid(uid,otype);
            if (flag){

                return new AjaxData("修改成功",1);
            }
            return new AjaxData("修改失败",-1);
        }else{
            return new AjaxData("您无权修改",-1);
        }
        //System.out.println(uid);
        //System.out.println(otype);


    }
    @RequestMapping("/admin/user/deleteuser")
    @ResponseBody
    public AjaxData deleteuser(Integer uid,HttpSession session){
        Integer otype = (Integer) session.getAttribute("otype");
        if (otype!=null&& otype==3){

            boolean flag = userService.deleteUserByUid(uid);
            if (flag){
                return new AjaxData("修改成功",1);
            }
            return new AjaxData("修改失败",-1);
        }else if (otype!=null&&otype==101){
            boolean flag = userService.deleteUserByUid(uid);
            if (flag){
                return new AjaxData("修改成功",1);
            }
            return new AjaxData("修改失败",-1);
        }else{
            return new AjaxData("您无权修改",-1);
        }
        //System.out.println(uid);
        //System.out.println(otype);
    }


    @RequestMapping("admin/user/vipuseradd")
    public String vipUserAdd(Integer uid,HttpSession session,Model model){
        Integer otype = (Integer) session.getAttribute("otype");
        WP_Userinfo wp_userinfo = null;
        Integer isedit = null;
        if (uid != null){
            wp_userinfo = userService.selectUsersByUid(uid);
            isedit = 1;
        }else{
            wp_userinfo = new WP_Userinfo();
            isedit = 0;
        }
        model.addAttribute("user",wp_userinfo);
        model.addAttribute("isedit",isedit);
        return "admin/user/vipuseradd";

    }
    @RequestMapping("/admin/user/useradd")
    public String useradd(Integer uid,Model model,HttpSession session){
        Integer otype = (Integer) session.getAttribute("otype");
        WP_Userinfo wp_userinfo = null;
        Integer isedit = null;
        if (uid != null){
            wp_userinfo = userService.selectUsersByUid(uid);
            isedit = 1;
        }else{
            wp_userinfo = new WP_Userinfo();
            isedit = 0;
        }
        model.addAttribute("user",wp_userinfo);
        model.addAttribute("isedit",isedit);
        return "/admin/user/useradd";
    }
    @RequestMapping("/admin/user/useredit")
    @ResponseBody
    public AjaxData useredit(WP_Userinfo wp_userinfo,HttpSession session){
        //System.out.println(wp_userinfo.getUpwd());
        Integer uid = (Integer) session.getAttribute("uid");
        //System.out.println(wp_userinfo.getUsermoney());
        Integer otype= (Integer) session.getAttribute("otype" );
        wp_userinfo.setUpwd(PasswordMD5.md5(wp_userinfo.getUpwd()));
        if (otype != null && (otype==3||otype==101)){
            if (wp_userinfo.getUid() !=null){
                WP_Userinfo userinfo = userService.selectUsersByUid(wp_userinfo.getUid());
                if (userinfo.getUsermoney() != wp_userinfo.getUsermoney()){
                    WP_Balance wp_balance = new WP_Balance();
                    wp_balance.setCltime(String.valueOf(new Date().getTime()));
                    wp_balance.setBptype(String.valueOf(2));
                    wp_balance.setBpprice(wp_userinfo.getUsermoney() - userinfo.getUsermoney());
                    wp_balance.setRemarks("后台管理员id"+uid+"编辑客户信息改动金额");
                    wp_balance.setUid(wp_userinfo.getUid());
                    wp_balance.setIsverified(1);
                    wp_balance.setBpbalance(String.valueOf(wp_userinfo.getUsermoney()));
                    boolean flag = balanceSevice.insertBalanceByBp(wp_balance);
                    if (!flag){
                        return new AjaxData("增加金额失败，请重试",-1);
                    }
                }

                boolean b = userService.updateUserByUserinfo(wp_userinfo);
                if (b){
                    return new AjaxData("修改成功",1);
                }
                return new AjaxData("修改失败",-1);
            }else{
                wp_userinfo.setUsername("10000"+wp_userinfo.getUtel());
                wp_userinfo.setUtime(String.valueOf(new Date().getTime()));
                wp_userinfo.setOid(String.valueOf(uid));
                wp_userinfo.setManagername((String) session.getAttribute("username"));
                boolean flag = userService.insertUser(wp_userinfo);
                if (flag){
                    return new AjaxData("添加成功",1);
                }
                return new AjaxData("添加失败",-1);
            }
        }
        return new AjaxData("参数错误",-1);
    }
    @RequestMapping("/admin/user/vipuseredit")
    @ResponseBody
    public AjaxData vipuseredit(WP_Userinfo wp_userinfo,HttpSession session){
        System.out.println(11111);
        Integer uid = (Integer) session.getAttribute("uid");
        Integer otype= (Integer) session.getAttribute("otype" );
        wp_userinfo.setUpwd(PasswordMD5.md5(wp_userinfo.getUpwd()));
        if (otype != null && (otype==3||otype==101)){
            if (wp_userinfo.getUid() !=null){
                WP_Userinfo userinfo = userService.selectUsersByUid(wp_userinfo.getUid());
                if (userinfo.getUsermoney() != wp_userinfo.getUsermoney()){
                    WP_Balance wp_balance = new WP_Balance();
                    wp_balance.setCltime(String.valueOf(new Date().getTime()));
                    wp_balance.setBptype(String.valueOf(2));
                    wp_balance.setBpprice(wp_userinfo.getUsermoney() - userinfo.getUsermoney());
                    wp_balance.setRemarks("后台管理员id"+uid+"编辑客户信息改动金额");
                    wp_balance.setUid(wp_userinfo.getUid());
                    wp_balance.setIsverified(1);
                    wp_balance.setBpbalance(String.valueOf(wp_userinfo.getUsermoney()));
                    boolean flag = balanceSevice.insertBalanceByBp(wp_balance);
                    if (!flag){
                        return new AjaxData("增加金额失败，请重试",-1);
                    }
                }

                boolean b = userService.updateUserByUserinfo(wp_userinfo);
                if (b){
                    return new AjaxData("修改成功",1);
                }
                return new AjaxData("修改失败",-1);
            }else{
                wp_userinfo.setUsername("10000"+userService.selectMaxUid());
                wp_userinfo.setUtime(String.valueOf(new Date().getTime()));
                wp_userinfo.setOid(String.valueOf(uid));
                wp_userinfo.setManagername((String) session.getAttribute("username"));
                boolean flag = userService.insertUser(wp_userinfo);
                if (flag){
                    return new AjaxData("添加成功",1);
                }
                return new AjaxData("添加失败",-1);
            }
        }
        return new AjaxData("参数错误",-1);
    }

    @RequestMapping("/admin/user/myteam")
    public String myteam(HttpSession session,Model model){
        Integer uid = (Integer) session.getAttribute("uid");
        WP_Userinfo wp_userinfo = userService.selectUsersByUid(uid);
        model.addAttribute("mysons",wp_userinfo);
        return "admin/user/myteam";
    }
    @RequestMapping("/admin/user/chongzhi")
    public String chongzhi(HttpSession session){
        Integer otype = (Integer) session.getAttribute("otype");
        if ( otype != null && (otype ==3||otype==101)) {
            return "admin/user/chongzhi";
        }
        return "admin/login/login";
    }
    @RequestMapping("/admin/user/addprice")
    @ResponseBody
    public AjaxData addPrice(String utel,String bpprice,HttpSession session){
        Integer otype = (Integer) session.getAttribute("otype");
        Integer uid = (Integer) session.getAttribute("uid");
        if (otype != null && (otype ==3||otype==101)){
            if (("".equals(utel)||utel!=null) && (bpprice != null || "".equals(bpprice))){
                WP_Userinfo wp_userinfo = userService.selectUserByUtel(utel);
                if (wp_userinfo!=null) {
                    wp_userinfo.setUsermoney(wp_userinfo.getUsermoney() + Double.valueOf(bpprice));
                    WP_Balance balance = new WP_Balance();
                    balance.setBpprice(Double.valueOf(bpprice));
                    balance.setBptype(String.valueOf(2));
                    balance.setIsverified(1);
                    balance.setBptime(String.valueOf(new Date().getTime()));
                    balance.setCltime(String.valueOf(new Date().getTime()));
                    balance.setUid(wp_userinfo.getUid());
                    balance.setRemarks("后台管理员id:"+uid+"编辑客户信息金额改动");
                    balance.setBpbalance(String.valueOf(wp_userinfo.getUsermoney()));
                    boolean b = userService.updateUserByUserinfo(wp_userinfo);
                    boolean flag = balanceSevice.insertBalanceByBp(balance);
                    if (flag&&b){
                        return new AjaxData("充值成功",1);
                    }
                    return new AjaxData("充值失败",-1);
                }
            }
            return new AjaxData("参数错误，请重新输入",-1);
        }
        return new AjaxData("您无权访问，请提升权限后再来",-1);
    }
    @RequestMapping("/admin/user/userprice")
    public String userPrice(GetData getData,HttpSession session,Model model){
        Integer uid = (Integer) session.getAttribute("uid");
        Integer otype = (Integer) session.getAttribute("otype");
        List<Integer> bptypes = new ArrayList<>();
        bptypes.add(1);
        bptypes.add(2);
        Double priceByIds= null;
        List<BanlanceView> list = null;
        if (otype != null && otype == 3){
            priceByIds =  balanceSevice.SumBPriceByIdsAndBptypes(null, bptypes,getData);
            list = balanceSevice.selectBanlanceByIds(getData, null);
        }else{
            List<Integer> ids = userService.selectAllUserIdByOid(uid);
            priceByIds = balanceSevice.SumBPriceByIdsAndBptypes(ids, bptypes,getData);
            list = balanceSevice.selectBanlanceByIds(getData, ids);
        }
        for (BanlanceView view : list) {
            if (view.getBptime() != null){

                view.setBptime(IntegerConverDate.IntegerCovDate(Long.valueOf(view.getBptime())));
            }
            if (view.getCltime()!=null){

                view.setCltime(IntegerConverDate.IntegerCovDate(Long.valueOf(view.getCltime())));
            }
        }
        model.addAttribute("getdata",getData);
        model.addAttribute("balance",list);
        if (priceByIds != null)
            model.addAttribute("all_bpprice", DoubleFormatText.doubleFormat(priceByIds));
        else
            model.addAttribute("all_bpprice", 0);
        return "admin/user/userprice";
    }
    @RequestMapping("/admin/user/cash")
    public String cash(GetData getData,HttpSession session,Model model){
        Integer uid = (Integer) session.getAttribute("uid");
        Integer otype = (Integer) session.getAttribute("otype");
        Double priceByIds= null;
        List<CashView> list = null;
        getData.setBptype(0);
        if (otype != null && otype == 3){
              priceByIds =  balanceSevice.SumBPriceByIdsByBptype(null, 0,getData);
              list = balanceSevice.selectBanlanceByIdsByBptype(getData, null);
        }else{
            List<Integer> ids = userService.selectAllUserIdByOid(uid);
            priceByIds = balanceSevice.SumBPriceByIdsByBptype(ids, 0,getData);
            list = balanceSevice.selectBanlanceByIdsByBptype(getData, ids);
        }
        for (CashView view : list) {
            view.setTomoney(view.getBpprice()-(view.getBpprice() * Double.valueOf(view.getReg_par()))/100);
            if (view.getBptime() != null){

                view.setBptime(IntegerConverDate.IntegerCovDate(Long.valueOf(view.getBptime())));
            }
            if (view.getCltime()!=null){

                view.setCltime(IntegerConverDate.IntegerCovDate(Long.valueOf(view.getCltime())));
            }
        }
        model.addAttribute("getdata",getData);
        model.addAttribute("balance",list);
        if (priceByIds != null)
            model.addAttribute("all_cash", DoubleFormatText.doubleFormat(priceByIds));
        else
            model.addAttribute("all_bpprice", 0);
        return "admin/user/cash";
    }
    @RequestMapping("/admin/user/dorecharge")
    @ResponseBody
    public AjaxData dorecharge(Integer uid,Integer bpid,String cash_content,Integer type){
        if (uid != null && bpid != null){
            WP_Balance wpBalance = balanceSevice.selectBalanceByBpid(bpid);
            wpBalance.setRegPar(String.valueOf(2));
            WP_Userinfo wpUserinfo = userService.selectUsersByUid(uid);
            if (wpBalance != null && wpUserinfo != null){
                wpBalance.setIsverified(type);
                wpBalance.setCltime(String.valueOf(new Date().getTime()));
                wpBalance.setRemarks(cash_content.trim());
                boolean flag = balanceSevice.updateBalanceByBalance(wpBalance);
                if (flag){
                    wpUserinfo.setUsermoney(wpUserinfo.getUsermoney()+wpBalance.getBpprice());
                    boolean b = userService.updateUserByUserinfo(wpUserinfo);
                    if (b){
                        return new AjaxData("操作成功",1);
                    }
                }
                return new AjaxData("操作失败",-1);

            }else {
                return new AjaxData("缺少参数",-1);
            }
        }else{
            return new AjaxData("参数错误",-1);
        }

    }











    @RequestMapping("/admin/system/adminlist")
    public String adminList(Model model,HttpSession session){
        Integer otype = (Integer) session.getAttribute("otype");
        if (otype != null && otype == 3){
            List<AdminView> adminViews = userService.selectAllUserByOtype();
            model.addAttribute("adminlist",adminViews);
            return "admin/system/adminlist";
        }else{
            return "admin/login/login";
        }
    }
    @RequestMapping("/admin/system/adminadd")
    public String adminAdd(AdminView adminView,Model model,HttpSession session){
        Integer otype = (Integer) session.getAttribute("otype");
        //System.out.println(222222);
        if (otype != null && otype == 3){
            if (adminView.getUid() != null){
                adminView = userService.selectUserByUid(adminView.getUid());
                adminView.setIsedit(1);
                model.addAttribute("vo",adminView);
            }else{
                adminView.setIsedit(0);
                model.addAttribute("vo",adminView);

            }
        }else{
            return "admin/login/login";
        }
        return "admin/system/adminadd";
    }
    @RequestMapping("/admin/system/admininsert")
    @ResponseBody
    public AjaxData adminInsert(AdminView adminView,HttpSession session){
        Integer otype = (Integer) session.getAttribute("otype");
        //System.out.println(11111);
        String upwd = adminView.getUpwd();
        adminView.setUpwd(PasswordMD5.md5(upwd));
        adminView.setUtime(String.valueOf(new Date().getTime()));
        if (otype != null && otype == 3){
            if (adminView.getIsedit() == 1){

                boolean flag = userService.updateAdminByAdminView(adminView);
                if (flag){
                    return new AjaxData("修改成功",1);
                }else{
                    return new AjaxData("修改失败",-1);
                }
            }else{
                boolean flag = userService.InsertAdminByAdminView(adminView);
                if (flag){
                    return new AjaxData("添加成功",1);
                }else{
                    return new AjaxData("添加失败",-1);
                }
            }
        }else{
            return new AjaxData("您的权限不足，请提升后再来",-1);
        }
    }






}
