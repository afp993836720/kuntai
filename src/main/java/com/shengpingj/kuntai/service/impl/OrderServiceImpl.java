package com.shengpingj.kuntai.service.impl;

import com.shengpingj.kuntai.common.TodayDate;
import com.shengpingj.kuntai.mapper.WP_OrderMapper;
import com.shengpingj.kuntai.pojo.vo.GetData;
import com.shengpingj.kuntai.pojo.vo.UserOrder;
import com.shengpingj.kuntai.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private WP_OrderMapper orderMapper;
    @Override
    public List<UserOrder> selectOrderLimit() {
        return orderMapper.selectOrderLimit();
    }

    @Override
    public List<UserOrder> selectAllOrder() {
        return orderMapper.selectAllOrder();
    }

    @Override
    public UserOrder selectOrderByOid(Integer oid) {
        return orderMapper.selectOrderByOid(oid);
    }

    @Override
    public List<UserOrder> selectOrderLimitByUids(List<Integer> ids) {
        return orderMapper.selectOrderLimitByUids(ids);
    }

    @Override
    public List<UserOrder> selectAllOrderByUids(List<Integer> ids) {
        return orderMapper.selectAllOrderByUids(ids);
    }

    @Override
    public Double SumPloss(Integer uid, GetData getData) {
        if (getData != null){
                getData.setStarttime(String.valueOf(TodayDate.startTime()));
                getData.setEndtime(String.valueOf(TodayDate.endTime()));
        }
        return orderMapper.SumPloss(uid,getData);
    }

    @Override
    public Double SumSxFee(Integer uid) {
        return orderMapper.SumSxFee(uid);
    }

    @Override
    public Double SumPlossByIds(List<Integer> integers, GetData getData) {
        if (getData != null){
            getData.setStarttime(String.valueOf(TodayDate.startTime()));
            getData.setEndtime(String.valueOf(TodayDate.endTime()));
        }
        return orderMapper.SumPlossByIds(integers,getData);
    }

    @Override
    public Integer selectCountByUid(Integer uid) {
        return orderMapper.selectCountByUid(uid);
    }

    @Override
    public Integer selectAllOrderByTime() {
        String startTime = String.valueOf(TodayDate.startTime());
        String endTime = String.valueOf(TodayDate.endTime());
        return orderMapper.selectAllOrderByTime(startTime,endTime);
    }

    @Override
    public Double sumPlossByTime() {
        String startTime = String.valueOf(TodayDate.startTime());
        String endTime = String.valueOf(TodayDate.endTime());
        return orderMapper.sumPlossByTime(startTime,endTime);
    }

    @Override
    public Double sumFeeByTime() {
        String startTime = String.valueOf(TodayDate.startTime());
        String endTime = String.valueOf(TodayDate.endTime());
        return orderMapper.sumFeeByTime(startTime,endTime);
    }

    @Override
    public Double sumSxFeeByTime() {
        String startTime = String.valueOf(TodayDate.startTime());
        String endTime = String.valueOf(TodayDate.endTime());
        return orderMapper.sumSxFeeByTime(startTime,endTime);

    }

}
