package com.shengpingj.kuntai.mapper;

import com.shengpingj.kuntai.pojo.WP_Userinfo;
import com.shengpingj.kuntai.pojo.vo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WP_UserinfoMapper {
//    int countByExample(WP_UserinfoExample example);
//
//    int deleteByExample(WP_UserinfoExample example);
//
//    int deleteByPrimaryKey(Integer uid);
//
//    int insert(WP_Userinfo record);
//
//    int insertSelective(WP_Userinfo record);
//
//    List<WP_Userinfo> selectByExample(WP_UserinfoExample example);
//
//    WP_Userinfo selectByPrimaryKey(Integer uid);
//
//    int updateByExampleSelective(@Param("record") WP_Userinfo record, @Param("example") WP_UserinfoExample example);
//
//    int updateByExample(@Param("record") WP_Userinfo record, @Param("example") WP_UserinfoExample example);
//
//    int updateByPrimaryKeySelective(WP_Userinfo record);
//
//    int updateByPrimaryKey(WP_Userinfo record);
//
    WP_Userinfo selectByUsernameOrUtelOrNickname(String username);

    int selectAllUserCount();

    Double selectAllUserMoneySum();

    List<Integer> selectAllUserIdByOid(Integer uid);

    List<UserView> selectAllUser(@Param("userSearchData") UserSearchData userSearchData);

    List<UserView> selectAllUserByIds(@Param("userSearchData") UserSearchData userSearchData);

    List<AdminView> selectAllUserByOtype();

    AdminView selectUserByUid(Integer uid);

    int updateAdminByAdminView(@Param("adminView") AdminView adminView);

    int InsertAdminByAdminView(@Param("adminView") AdminView adminView);

    int updateUserLoginTime(@Param("logintime") String valueOf, @Param("uid") Integer uid);

    int updateUserLastlogTime(@Param("lostlogtime") String value, @Param("uid") Integer uid);

    List<PriceListView> selectAllUserByGetDateAndIds(@Param("getdata") GetData getData,@Param("ids") List<Integer> integers);

    int updateUserUstatusByUid(@Param("uid") Integer uid,@Param("ustatus") Integer ustatus);

    int updateUserOtypeByUid(@Param("uid") Integer uid,@Param("otype") Integer otype);

    int deleteUserByUid(@Param("uid") Integer uid);

    WP_Userinfo selectUsersByUid(@Param("uid") Integer uid);

    int updateUserByUserinfo(@Param("user") WP_Userinfo wp_userinfo);

    int insertUser(@Param("user") WP_Userinfo wp_userinfo);

    WP_Userinfo selectUserByUtel(@Param("utel") String utel);

    int selectAllUserByTime(@Param("startTime") String startTime, @Param("endTime") String endTime);

    Integer selectMaxUid();

}