package com.shengpingj.kuntai.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WP_AreaMapper {
    String selectNameById(@Param("id") Integer id);
//    int countByExample(WP_AreaExample example);
//
//    int deleteByExample(WP_AreaExample example);
//
//    int deleteByPrimaryKey(Short id);
//
//    int insert(WP_Area record);
//
//    int insertSelective(WP_Area record);
//
//    List<WP_Area> selectByExample(WP_AreaExample example);
//
//    WP_Area selectByPrimaryKey(Short id);
//
//    int updateByExampleSelective(@Param("record") WP_Area record, @Param("example") WP_AreaExample example);
//
//    int updateByExample(@Param("record") WP_Area record, @Param("example") WP_AreaExample example);
//
//    int updateByPrimaryKeySelective(WP_Area record);
//
//    int updateByPrimaryKey(WP_Area record);
}