package com.shengpingj.kuntai.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WP_ProductdataMapper {
    int updateGoodsData( Integer id);

//    int countByExample(WP_ProductdataExample example);
//
//    int deleteByExample(WP_ProductdataExample example);
//
//    int deleteByPrimaryKey(Integer id);
//
//    int insert(WP_Productdata record);
//
//    int insertSelective(WP_Productdata record);
//
//    List<WP_Productdata> selectByExample(WP_ProductdataExample example);
//
//    WP_Productdata selectByPrimaryKey(Integer id);
//
//    int updateByExampleSelective(@Param("record") WP_Productdata record, @Param("example") WP_ProductdataExample example);
//
//    int updateByExample(@Param("record") WP_Productdata record, @Param("example") WP_ProductdataExample example);
//
//    int updateByPrimaryKeySelective(WP_Productdata record);
//
//    int updateByPrimaryKey(WP_Productdata record);
}