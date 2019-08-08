package com.shengpingj.kuntai.service.impl;

import com.shengpingj.kuntai.mapper.WP_Order_LogMapper;
import com.shengpingj.kuntai.pojo.WP_Order_Log;
import com.shengpingj.kuntai.pojo.vo.OrderLog;
import com.shengpingj.kuntai.service.OrderLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderLogServiceImpl implements OrderLogService {
    @Autowired
    private WP_Order_LogMapper wp_order_logMapper;

    @Override
    public List<OrderLog> selectAllOrderLog() {
        return wp_order_logMapper.selectAllOrderLog();
    }

    @Override
    public List<OrderLog> selectAllOrderLogByIds(List<Integer> ids) {
        return wp_order_logMapper.selectAllOrderLogByIds(ids);
    }
}
