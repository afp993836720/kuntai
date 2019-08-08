package com.shengpingj.kuntai.mapper;

import com.shengpingj.kuntai.pojo.vo.BanksView;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WP_BankcardMapper {
    BanksView selectUserBankByUid(@Param("uid") Integer uid);
//    int countByExample(WP_BankcardExample example);
//
//    int deleteByExample(WP_BankcardExample example);
//
//    int deleteByPrimaryKey(Integer id);
//
//    int insert(WP_Bankcard record);
//
//    int insertSelective(WP_Bankcard record);
//
//    List<WP_Bankcard> selectByExample(WP_BankcardExample example);
//
//    WP_Bankcard selectByPrimaryKey(Integer id);
//
//    int updateByExampleSelective(@Param("record") WP_Bankcard record, @Param("example") WP_BankcardExample example);
//
//    int updateByExample(@Param("record") WP_Bankcard record, @Param("example") WP_BankcardExample example);
//
//    int updateByPrimaryKeySelective(WP_Bankcard record);
//
//    int updateByPrimaryKey(WP_Bankcard record);
}