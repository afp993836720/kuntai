package com.shengpingj.kuntai.service;

import com.shengpingj.kuntai.pojo.vo.GetData;
import com.shengpingj.kuntai.pojo.vo.UserOrder;

import java.util.List;

public interface OrderService {

    List<UserOrder> selectOrderLimit();

    List<UserOrder> selectAllOrder();

    UserOrder selectOrderByOid(Integer oid);

    List<UserOrder> selectOrderLimitByUids(List<Integer> ids);

    List<UserOrder> selectAllOrderByUids(List<Integer> ids);

    Double SumPloss(Integer uid, GetData getData);

    Double SumSxFee(Integer uid);

    Double SumPlossByIds(List<Integer> integers, GetData getData);

    Integer selectCountByUid(Integer uid);

    Integer selectAllOrderByTime();

    Double sumPlossByTime();

    Double sumFeeByTime();

    Double sumSxFeeByTime();
}
