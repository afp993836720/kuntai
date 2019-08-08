package com.shengpingj.kuntai.mapper;

import com.shengpingj.kuntai.pojo.WP_Wechat;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WP_WechatMapper {
    WP_Wechat selectWechat();

    int updateWechatByWechat(@Param("wechat") WP_Wechat wechat);
//    int countByExample(WP_WechatExample example);
//
//    int deleteByExample(WP_WechatExample example);
//
//    int deleteByPrimaryKey(Integer wcid);
//
//    int insert(WP_Wechat record);
//
//    int insertSelective(WP_Wechat record);
//
//    List<WP_Wechat> selectByExample(WP_WechatExample example);
//
//    WP_Wechat selectByPrimaryKey(Integer wcid);
//
//    int updateByExampleSelective(@Param("record") WP_Wechat record, @Param("example") WP_WechatExample example);
//
//    int updateByExample(@Param("record") WP_Wechat record, @Param("example") WP_WechatExample example);
//
//    int updateByPrimaryKeySelective(WP_Wechat record);
//
//    int updateByPrimaryKey(WP_Wechat record);
}