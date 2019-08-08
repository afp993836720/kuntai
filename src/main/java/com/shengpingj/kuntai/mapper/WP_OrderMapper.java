package com.shengpingj.kuntai.mapper;

import com.shengpingj.kuntai.pojo.WP_Order;
import com.shengpingj.kuntai.pojo.vo.GetData;
import com.shengpingj.kuntai.pojo.vo.UserOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WP_OrderMapper {
    List<UserOrder> selectOrderLimit();

    List<UserOrder> selectAllOrder();

    UserOrder selectOrderByOid(Integer oid);

    List<UserOrder> selectOrderLimitByUids(@Param("ids") List<Integer> ids);

    List<UserOrder> selectAllOrderByUids(@Param("ids") List<Integer> ids);

    Double SumSxFee(Integer uid);

    Double SumPloss(@Param("uid") Integer uid,@Param("getdata") GetData getData);

    Double SumPlossByIds(@Param("ids") List<Integer> integers,@Param("getdata") GetData getData);

    Integer selectCountByUid(@Param("uid") Integer uid);

    Integer selectAllOrderByTime(@Param("startTime") String startTime,@Param("endTime") String endTime);

    Double sumPlossByTime(@Param("startTime") String startTime,@Param("endTime") String endTime);

    Double sumFeeByTime(@Param("startTime") String startTime,@Param("endTime") String endTime);

    Double sumSxFeeByTime(@Param("startTime") String startTime,@Param("endTime") String endTime);

//    int countByExample(WP_OrderExample example);
//
//    int deleteByExample(WP_OrderExample example);
//
//    int deleteByPrimaryKey(Integer oid);
//
//    int insert(WP_Order record);
//
//    int insertSelective(WP_Order record);
//
//    List<WP_Order> selectByExample(WP_OrderExample example);
//
//    WP_Order selectByPrimaryKey(Integer oid);
//
//    int updateByExampleSelective(@Param("record") WP_Order record, @Param("example") WP_OrderExample example);
//
//    int updateByExample(@Param("record") WP_Order record, @Param("example") WP_OrderExample example);
//
//    int updateByPrimaryKeySelective(WP_Order record);
//
//    int updateByPrimaryKey(WP_Order record);
}