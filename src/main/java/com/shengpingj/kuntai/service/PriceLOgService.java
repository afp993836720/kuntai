package com.shengpingj.kuntai.service;

import com.shengpingj.kuntai.pojo.vo.GetData;
import com.shengpingj.kuntai.pojo.vo.MyPriceView;
import com.shengpingj.kuntai.pojo.vo.PriceLogView;

import java.util.List;

public interface PriceLOgService {
    List<PriceLogView> selectAllPriceLog(GetData getData, Integer uid);

    Double SumAccount(Integer uid, String title, GetData getData);

    Double SumAccountByIds(List<Integer> integers, String title, GetData getData);

    List<MyPriceView> selectAllMyPriceView(Integer uid, GetData getData);
}
