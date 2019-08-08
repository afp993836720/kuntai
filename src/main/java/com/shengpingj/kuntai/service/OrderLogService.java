package com.shengpingj.kuntai.service;

import com.shengpingj.kuntai.pojo.WP_Order_Log;
import com.shengpingj.kuntai.pojo.vo.OrderLog;

import java.util.List;

public interface OrderLogService {
    List<OrderLog> selectAllOrderLog();

    List<OrderLog> selectAllOrderLogByIds(List<Integer> ids);
}
