package com.shengpingj.kuntai.service.impl;

import com.shengpingj.kuntai.common.TodayDate;
import com.shengpingj.kuntai.mapper.WP_BalanceMapper;
import com.shengpingj.kuntai.pojo.WP_Balance;
import com.shengpingj.kuntai.pojo.vo.BanlanceView;
import com.shengpingj.kuntai.pojo.vo.CashView;
import com.shengpingj.kuntai.pojo.vo.GetData;
import com.shengpingj.kuntai.service.BalanceSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BalanceServiceImpl implements BalanceSevice {
    @Autowired
    private WP_BalanceMapper wp_balanceMapper;
    @Override
    public Double SumBPrice(Integer uid, int bptype, int isverified, GetData getData) {
        if (getData !=null){
            if (getData.getStarttime() == null){
                getData.setStarttime(String.valueOf(TodayDate.startTime()));
            }
            if (getData.getEndtime() == null){
                getData.setEndtime(String.valueOf(TodayDate.endTime()));
            }
        }
        return wp_balanceMapper.SumBPrice(uid,bptype,isverified,getData);
    }

    @Override
    public Integer CountBPrice(Integer uid, int bptype, int isverified, GetData getData) {
        if (getData.getStarttime() == null){
            getData.setStarttime(String.valueOf(TodayDate.startTime()));
        }
        if (getData.getEndtime() == null){
            getData.setEndtime(String.valueOf(TodayDate.endTime()));
        }
        return wp_balanceMapper.CountBPrice(uid,bptype,isverified,getData);
    }

    @Override
    public Double SumBPriceByIds(List<Integer> integers, int bptype, int isverified, GetData getData) {
        if (getData !=null){
            if (getData.getStarttime() == null){
                getData.setStarttime(String.valueOf(TodayDate.startTime()));
            }
            if (getData.getEndtime() == null){
                getData.setEndtime(String.valueOf(TodayDate.endTime()));
            }
        }
        return wp_balanceMapper.SumBPriceByIds(integers,bptype,isverified,getData);
    }

    @Override
    public boolean insertBalanceByBp(WP_Balance wp_balance) {
        return wp_balanceMapper.insertBalanceByBp(wp_balance) > 0 ? true :false;
    }

    @Override
    public List<BanlanceView> selectBanlanceByIds(GetData getData, List<Integer> ids) {
        return wp_balanceMapper.selectBanlanceByIds(getData,ids);
    }

    @Override
    public Double SumBPriceByIdsAndBptypes(List<Integer> ids, List<Integer> bptypes, GetData getData) {
        return wp_balanceMapper.SumBPriceByIdsAndBptypes(ids,bptypes,getData);
    }

    @Override
    public Double SumBPriceByIdsByBptype(List<Integer> ids, int i, GetData getData) {
        return wp_balanceMapper.SumBPriceByIdsByBptype(ids,i,getData);
    }

    @Override
    public List<CashView> selectBanlanceByIdsByBptype(GetData getData, List<Integer> ids) {
        return wp_balanceMapper.selectBanlanceByIdsByBptype(ids,getData);
    }

    @Override
    public WP_Balance selectBalanceByBpid(Integer bpid) {
        return wp_balanceMapper.selectBalanceByBpid(bpid);
    }

    @Override
    public boolean updateBalanceByBalance(WP_Balance wpBalance) {
        return wp_balanceMapper.updateBalanceByBalance(wpBalance) > 0 ? true:false;
    }

    @Override
    public Double sumBppriceByTimeAndbptype(Integer bptype, Integer isverified) {
        String startTime = String.valueOf(TodayDate.startTime());
        String endTime = String.valueOf(TodayDate.endTime());
        return wp_balanceMapper.sumBppriceByTimeAndbptype(startTime,bptype,isverified,endTime);
    }
}
