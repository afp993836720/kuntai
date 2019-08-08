package com.shengpingj.kuntai.mapper;

import com.shengpingj.kuntai.pojo.WP_Order_Log;
import com.shengpingj.kuntai.pojo.vo.OrderLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WP_Order_LogMapper {
    List<OrderLog> selectAllOrderLog();

    List<OrderLog> selectAllOrderLogByIds(@Param("ids") List<Integer> ids);
//    int countByExample(WP_Order_LogExample example);
//
//    int deleteByExample(WP_Order_LogExample example);
//
//    int deleteByPrimaryKey(Integer id);
//
//    int insert(WP_Order_Log record);
//
//    int insertSelective(WP_Order_Log record);
//
//    List<WP_Order_Log> selectByExample(WP_Order_LogExample example);
//
//    WP_Order_Log selectByPrimaryKey(Integer id);
//
//    int updateByExampleSelective(@Param("record") WP_Order_Log record, @Param("example") WP_Order_LogExample example);
//
//    int updateByExample(@Param("record") WP_Order_Log record, @Param("example") WP_Order_LogExample example);
//
//    int updateByPrimaryKeySelective(WP_Order_Log record);
//
//    int updateByPrimaryKey(WP_Order_Log record);
}