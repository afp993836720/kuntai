package com.shengpingj.kuntai.mapper;

import com.shengpingj.kuntai.pojo.WP_Price_Log;
import com.shengpingj.kuntai.pojo.vo.GetData;
import com.shengpingj.kuntai.pojo.vo.MyPriceView;
import com.shengpingj.kuntai.pojo.vo.PriceLogView;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WP_Price_LogMapper {
    List<PriceLogView> selectAllPriceLog(@Param("getData") GetData getData, @Param("uid") Integer uid);

    Double SumAccount(@Param("uid") Integer uid,@Param("title") String title,@Param("getdata") GetData getData);

    Double SumAccountByIds(@Param("ids") List<Integer> integers, @Param("title") String title,@Param("getdata") GetData getData);

    List<MyPriceView> selectAllMyPriceView(@Param("uid") Integer uid,@Param("getdata") GetData getData);
//    int countByExample(WP_Price_LogExample example);
//
//    int deleteByExample(WP_Price_LogExample example);
//
//    int deleteByPrimaryKey(Integer id);
//
//    int insert(WP_Price_Log record);
//
//    int insertSelective(WP_Price_Log record);
//
//    List<WP_Price_Log> selectByExample(WP_Price_LogExample example);
//
//    WP_Price_Log selectByPrimaryKey(Integer id);
//
//    int updateByExampleSelective(@Param("record") WP_Price_Log record, @Param("example") WP_Price_LogExample example);
//
//    int updateByExample(@Param("record") WP_Price_Log record, @Param("example") WP_Price_LogExample example);
//
//    int updateByPrimaryKeySelective(WP_Price_Log record);
//
//    int updateByPrimaryKey(WP_Price_Log record);
}