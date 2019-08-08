package com.shengpingj.kuntai.service.impl;

import com.shengpingj.kuntai.common.IntegerConverDate;
import com.shengpingj.kuntai.common.TodayDate;
import com.shengpingj.kuntai.mapper.WP_Price_LogMapper;
import com.shengpingj.kuntai.pojo.WP_Price_Log;
import com.shengpingj.kuntai.pojo.vo.GetData;
import com.shengpingj.kuntai.pojo.vo.MyPriceView;
import com.shengpingj.kuntai.pojo.vo.PriceLogView;
import com.shengpingj.kuntai.service.PriceLOgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class PriceLogServiceImpl implements PriceLOgService {
    @Autowired
    private WP_Price_LogMapper wp_price_logMapper;
    @Override
    public List<PriceLogView> selectAllPriceLog(GetData getData, Integer uid) {
        if (getData.getStarttime() != null){

            getData.setStarttime(String.valueOf(Timestamp.valueOf(getData.getStarttime()).getTime()));
        }
        if (getData.getEndtime() != null){

            getData.setEndtime(String.valueOf(Timestamp.valueOf(getData.getEndtime()).getTime()));
        }
        List<PriceLogView> logViews = wp_price_logMapper.selectAllPriceLog(getData, uid);
        for (PriceLogView view : logViews) {
            if (view.getTime() != null){

                view.setTime(String.valueOf(IntegerConverDate.IntegerCovDate(Long.valueOf(view.getTime()))));
            }
        }
        return logViews;
    }

    @Override
    public Double SumAccount(Integer uid, String title, GetData getData) {
        if (getData.getStarttime() == null){
            getData.setStarttime(String.valueOf(TodayDate.startTime()));
        }
        if (getData.getEndtime() == null){
            getData.setEndtime(String.valueOf(TodayDate.endTime()));
        }
        return wp_price_logMapper.SumAccount(uid,title,getData);
    }

    @Override
    public Double SumAccountByIds(List<Integer> integers, String title, GetData getData) {
        if (getData.getStarttime() == null){
            getData.setStarttime(String.valueOf(TodayDate.startTime()));
        }
        if (getData.getEndtime() == null){
            getData.setEndtime(String.valueOf(TodayDate.endTime()));
        }
        return wp_price_logMapper.SumAccountByIds(integers,title,getData);
    }

    @Override
    public List<MyPriceView> selectAllMyPriceView(Integer uid, GetData getData) {
        return wp_price_logMapper.selectAllMyPriceView(uid,getData);
    }
}
