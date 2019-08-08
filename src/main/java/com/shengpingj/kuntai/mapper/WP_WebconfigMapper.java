package com.shengpingj.kuntai.mapper;

import com.shengpingj.kuntai.pojo.WP_Config;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WP_WebconfigMapper {
    List<WP_Config> selectWebConfigByGroupAndStatus(@Param("group") Integer group,@Param("status") Integer status);
//    int countByExample(WP_WebconfigExample example);
//
//    int deleteByExample(WP_WebconfigExample example);
//
//    int deleteByPrimaryKey(Integer id);
//
//    int insert(WP_Webconfig record);
//
//    int insertSelective(WP_Webconfig record);
//
//    List<WP_Webconfig> selectByExample(WP_WebconfigExample example);
//
//    WP_Webconfig selectByPrimaryKey(Integer id);
//
//    int updateByExampleSelective(@Param("record") WP_Webconfig record, @Param("example") WP_WebconfigExample example);
//
//    int updateByExample(@Param("record") WP_Webconfig record, @Param("example") WP_WebconfigExample example);
//
//    int updateByPrimaryKeySelective(WP_Webconfig record);
//
//    int updateByPrimaryKey(WP_Webconfig record);
}