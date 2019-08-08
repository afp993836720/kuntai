package com.shengpingj.kuntai.mapper;

import com.shengpingj.kuntai.pojo.WP_Config;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WP_ConfigMapper {
    WP_Config selectByName(String name);

    List<WP_Config> selectWebConfigByGroupAndStatus(@Param("group") Integer group,@Param("status") Integer status);

    int updateConfigByList(@Param("config") WP_Config config);

    String selectValueById(Integer id);

    WP_Config selectConfigById(Integer id);


    int insertConfigByConfig(@Param("config") WP_Config wp_config);

    int deleteConf(@Param("id") Integer id);
//    int countByExample(WP_ConfigExample example);
//
//    int deleteByExample(WP_ConfigExample example);
//
//    int deleteByPrimaryKey(Integer id);
//
//    int insert(WP_Config record);
//
//    int insertSelective(WP_Config record);
//
//    List<WP_Config> selectByExampleWithBLOBs(WP_ConfigExample example);
//
//    List<WP_Config> selectByExample(WP_ConfigExample example);
//
//    WP_Config selectByPrimaryKey(Integer id);
//
//    int updateByExampleSelective(@Param("record") WP_Config record, @Param("example") WP_ConfigExample example);
//
//    int updateByExampleWithBLOBs(@Param("record") WP_Config record, @Param("example") WP_ConfigExample example);
//
//    int updateByExample(@Param("record") WP_Config record, @Param("example") WP_ConfigExample example);
//
//    int updateByPrimaryKeySelective(WP_Config record);
//
//    int updateByPrimaryKeyWithBLOBs(WP_Config record);
//
//    int updateByPrimaryKey(WP_Config record);
}