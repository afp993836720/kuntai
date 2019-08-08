package com.shengpingj.kuntai.mapper;

import com.shengpingj.kuntai.pojo.WP_Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WP_PaymentMapper {
    List<WP_Payment> selectAllPaymentByIsUse();

    WP_Payment selectPaymentById(@Param("id") Integer id);

    int deletePaymentById(@Param("id") Integer id);

    int updatePaymentByWP_Payment(@Param("payment") WP_Payment payment);

    int insertPayment(@Param("payment") WP_Payment payment);
//    int countByExample(WP_PaymentExample example);
//
//    int deleteByExample(WP_PaymentExample example);
//
//    int deleteByPrimaryKey(Integer id);
//
//    int insert(WP_Payment record);
//
//    int insertSelective(WP_Payment record);
//
//    List<WP_Payment> selectByExampleWithBLOBs(WP_PaymentExample example);
//
//    List<WP_Payment> selectByExample(WP_PaymentExample example);
//
//    WP_Payment selectByPrimaryKey(Integer id);
//
//    int updateByExampleSelective(@Param("record") WP_Payment record, @Param("example") WP_PaymentExample example);
//
//    int updateByExampleWithBLOBs(@Param("record") WP_Payment record, @Param("example") WP_PaymentExample example);
//
//    int updateByExample(@Param("record") WP_Payment record, @Param("example") WP_PaymentExample example);
//
//    int updateByPrimaryKeySelective(WP_Payment record);
//
//    int updateByPrimaryKeyWithBLOBs(WP_Payment record);
//
//    int updateByPrimaryKey(WP_Payment record);
}