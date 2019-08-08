package com.shengpingj.kuntai.service;

import com.shengpingj.kuntai.pojo.WP_Payment;

import java.util.List;

public interface RechargeService {
    List<WP_Payment> selectAllPaymentByIsUse();

    WP_Payment selectPaymentById(Integer id);

    boolean deletePaymentById(Integer id);

    boolean insertPayment(WP_Payment payment);

    boolean updatePaymentByWP_Payment(WP_Payment payment);
}
