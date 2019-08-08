package com.shengpingj.kuntai.mapper;

import com.shengpingj.kuntai.pojo.WP_RiskWithBLOBs;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WP_RiskMapper {
    List<WP_RiskWithBLOBs> selectAllRisk();

    Integer insertRiskById(WP_RiskWithBLOBs wp_riskWithBLOBs);

    Integer updatetRiskById(WP_RiskWithBLOBs wp_riskWithBLOBs);
//    int countByExample(WP_RiskExample example);
//
//    int deleteByExample(WP_RiskExample example);
//
//    int deleteByPrimaryKey(Integer id);
//
//    int insert(WP_RiskWithBLOBs record);
//
//    int insertSelective(WP_RiskWithBLOBs record);
//
//    List<WP_RiskWithBLOBs> selectByExampleWithBLOBs(WP_RiskExample example);
//
//    List<WP_Risk> selectByExample(WP_RiskExample example);
//
//    WP_RiskWithBLOBs selectByPrimaryKey(Integer id);
//
//    int updateByExampleSelective(@Param("record") WP_RiskWithBLOBs record, @Param("example") WP_RiskExample example);
//
//    int updateByExampleWithBLOBs(@Param("record") WP_RiskWithBLOBs record, @Param("example") WP_RiskExample example);
//
//    int updateByExample(@Param("record") WP_Risk record, @Param("example") WP_RiskExample example);
//
//    int updateByPrimaryKeySelective(WP_RiskWithBLOBs record);
//
//    int updateByPrimaryKeyWithBLOBs(WP_RiskWithBLOBs record);
//
//    int updateByPrimaryKey(WP_Risk record);
}