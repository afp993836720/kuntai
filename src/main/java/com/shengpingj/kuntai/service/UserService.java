package com.shengpingj.kuntai.service;

import com.shengpingj.kuntai.pojo.WP_Userinfo;
import com.shengpingj.kuntai.pojo.vo.*;

import java.util.List;

public interface UserService {
     WP_Userinfo selectUserByUserNameOrUtel(String username);
     int selectAllUserCount();
     Double selectAllUserMoneySum();

    List<Integer> selectAllUserIdByOid(Integer uid);

    List<UserView> selectAllUser(UserSearchData userSearchData);
    List<UserView> selectAllUserByIds(UserSearchData userSearchData);

    List<AdminView> selectAllUserByOtype();

    AdminView selectUserByUid(Integer uid);

    boolean InsertAdminByAdminView(AdminView adminView);

    boolean updateAdminByAdminView(AdminView adminView);

    boolean updateUserLoginTime(String valueOf,Integer uid);

    int updateUserLastlogTime(String value, Integer uid);


    List<PriceListView> selectAllUserByGetDateAndIds(GetData getData, List<Integer> integers);

    boolean updateUserUstatusByUid(Integer uid, Integer ustatus);

    boolean updateUserOtypeByUid(Integer uid, Integer otype);

    boolean deleteUserByUid(Integer uid);

    WP_Userinfo selectUsersByUid(Integer uid);

    boolean updateUserByUserinfo(WP_Userinfo wp_userinfo);

    boolean insertUser(WP_Userinfo wp_userinfo);

    WP_Userinfo selectUserByUtel(String utel);

    int selectAllUserByTime();

    Integer selectMaxUid();
}
