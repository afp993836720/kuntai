package com.shengpingj.kuntai.service.impl;

import com.shengpingj.kuntai.common.IntegerConverDate;
import com.shengpingj.kuntai.common.TodayDate;
import com.shengpingj.kuntai.mapper.WP_UserinfoMapper;
import com.shengpingj.kuntai.pojo.WP_Userinfo;
import com.shengpingj.kuntai.pojo.vo.*;
import com.shengpingj.kuntai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private WP_UserinfoMapper wp_userinfoMapper;
    @Override
    public WP_Userinfo selectUserByUserNameOrUtel(String username) {

        return wp_userinfoMapper.selectByUsernameOrUtelOrNickname(username);
    }

    @Override
    public int selectAllUserCount() {
        return wp_userinfoMapper.selectAllUserCount();
    }

    @Override
    public Double selectAllUserMoneySum() {
        return wp_userinfoMapper.selectAllUserMoneySum();
    }

    @Override
    public List<Integer> selectAllUserIdByOid(Integer uid) {
        return wp_userinfoMapper.selectAllUserIdByOid(uid);
    }

    @Override
    public List<UserView> selectAllUser(UserSearchData userSearchData) {
        return wp_userinfoMapper.selectAllUser(userSearchData);
    }

    @Override
    public List<UserView> selectAllUserByIds( UserSearchData userSearchData) {
 //       System.out.println(userSearchData.getOtype());
        return wp_userinfoMapper.selectAllUserByIds(userSearchData);
    }

    @Override
    public List<AdminView> selectAllUserByOtype() {
        return wp_userinfoMapper.selectAllUserByOtype();
    }

    @Override
    public AdminView selectUserByUid(Integer uid) {
        return wp_userinfoMapper.selectUserByUid(uid);
    }

    @Override
    public boolean InsertAdminByAdminView(AdminView adminView) {
        int res = wp_userinfoMapper.InsertAdminByAdminView(adminView);
        if (res > 0){
            return  true;
        }
        return false;
    }

    @Override
    public boolean updateAdminByAdminView(AdminView adminView) {
        int res = wp_userinfoMapper.updateAdminByAdminView(adminView);
        if (res > 0){
            return  true;
        }
        return false;
    }

    @Override
    public boolean updateUserLoginTime(String valueOf,Integer uid) {

        return wp_userinfoMapper.updateUserLoginTime(valueOf,uid) > 0 ? true :false;
    }

    @Override
    public int updateUserLastlogTime(String value, Integer uid) {
        return wp_userinfoMapper.updateUserLastlogTime(value,uid);
    }

    @Override
    public List<PriceListView> selectAllUserByGetDateAndIds(GetData getData, List<Integer> integers) {
        return wp_userinfoMapper.selectAllUserByGetDateAndIds(getData,integers);
    }

    @Override
    public boolean updateUserUstatusByUid(Integer uid, Integer ustatus) {
        return wp_userinfoMapper.updateUserUstatusByUid(uid,ustatus) > 0 ? true:false;
    }

    @Override
    public boolean updateUserOtypeByUid(Integer uid, Integer otype) {
        return wp_userinfoMapper.updateUserOtypeByUid(uid,otype) > 0 ? true:false;
    }

    @Override
    public boolean deleteUserByUid(Integer uid) {
        return  wp_userinfoMapper.deleteUserByUid(uid) > 0 ? true:false;
    }

    @Override
    public WP_Userinfo selectUsersByUid(Integer uid) {
        return wp_userinfoMapper.selectUsersByUid(uid);
    }

    @Override
    public boolean updateUserByUserinfo(WP_Userinfo wp_userinfo) {
        return wp_userinfoMapper.updateUserByUserinfo(wp_userinfo) > 0 ? true :false;
    }

    @Override
    public boolean insertUser(WP_Userinfo wp_userinfo) {
        return wp_userinfoMapper.insertUser(wp_userinfo) > 0 ? true:false;
    }

    @Override
    public WP_Userinfo selectUserByUtel(String utel) {
        return wp_userinfoMapper.selectUserByUtel(utel);
    }

    @Override
    public int selectAllUserByTime() {
        String startTime = String.valueOf(TodayDate.startTime());
        String endTime = String.valueOf(TodayDate.endTime());
        return wp_userinfoMapper.selectAllUserByTime(startTime,endTime);
    }

    @Override
    public Integer selectMaxUid() {
        return wp_userinfoMapper.selectMaxUid();
    }
}
