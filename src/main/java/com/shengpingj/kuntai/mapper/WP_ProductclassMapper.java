package com.shengpingj.kuntai.mapper;

import com.shengpingj.kuntai.pojo.WP_Productclass;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WP_ProductclassMapper {
    List<WP_Productclass> selectAllProClass();

    int updateProClassByPcid(Integer id);

    int insertProClass(WP_Productclass wp_productclass);

    int updateProClassPcnameByPcid(WP_Productclass wp_productclass);
//    int countByExample(WP_ProductclassExample example);
//
//    int deleteByExample(WP_ProductclassExample example);
//
//    int deleteByPrimaryKey(Integer pcid);
//
//    int insert(WP_Productclass record);
//
//    int insertSelective(WP_Productclass record);
//
//    List<WP_Productclass> selectByExample(WP_ProductclassExample example);
//
//    WP_Productclass selectByPrimaryKey(Integer pcid);
//
//    int updateByExampleSelective(@Param("record") WP_Productclass record, @Param("example") WP_ProductclassExample example);
//
//    int updateByExample(@Param("record") WP_Productclass record, @Param("example") WP_ProductclassExample example);
//
//    int updateByPrimaryKeySelective(WP_Productclass record);
//
//    int updateByPrimaryKey(WP_Productclass record);
}