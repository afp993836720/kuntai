package com.shengpingj.kuntai.mapper;

import com.shengpingj.kuntai.pojo.WP_Banks;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WP_BanksMapper {
    List<WP_Banks> selectAllBanks();

    boolean insertBanksById(@Param("banks") WP_Banks banks);

    boolean updateBanksById(@Param("banks") WP_Banks banks);

    int deleteBanksById(@Param("id") Integer id);
//    int countByExample(WP_BanksExample example);
//
//    int deleteByExample(WP_BanksExample example);
//
//    int deleteByPrimaryKey(Integer id);
//
//    int insert(WP_Banks record);
//
//    int insertSelective(WP_Banks record);
//
//    List<WP_Banks> selectByExample(WP_BanksExample example);
//
//    WP_Banks selectByPrimaryKey(Integer id);
//
//    int updateByExampleSelective(@Param("record") WP_Banks record, @Param("example") WP_BanksExample example);
//
//    int updateByExample(@Param("record") WP_Banks record, @Param("example") WP_BanksExample example);
//
//    int updateByPrimaryKeySelective(WP_Banks record);
//
//    int updateByPrimaryKey(WP_Banks record);
}