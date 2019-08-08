package com.shengpingj.kuntai.service.impl;

import com.shengpingj.kuntai.mapper.WP_PaymentMapper;
import com.shengpingj.kuntai.pojo.WP_Payment;
import com.shengpingj.kuntai.service.RechargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RechargeServiceImpl implements RechargeService {
    @Autowired
    private WP_PaymentMapper paymentMapper;
    @Override
    public List<WP_Payment> selectAllPaymentByIsUse() {
        return paymentMapper.selectAllPaymentByIsUse();
    }

    @Override
    public WP_Payment selectPaymentById(Integer id) {
        return paymentMapper.selectPaymentById(id);
    }

    @Override
    public boolean deletePaymentById(Integer id) {
        return paymentMapper.deletePaymentById(id) > 0 ? true : false;
    }

    @Override
    public boolean insertPayment(WP_Payment payment) {
        return paymentMapper.insertPayment(payment) > 0 ? true : false;
    }

    @Override
    public boolean updatePaymentByWP_Payment(WP_Payment payment) {
        return paymentMapper.updatePaymentByWP_Payment(payment) > 0 ? true : false;
    }
}
