package com.shengpingj.kuntai.service;

import com.shengpingj.kuntai.pojo.WP_Balance;
import com.shengpingj.kuntai.pojo.vo.BanlanceView;
import com.shengpingj.kuntai.pojo.vo.CashView;
import com.shengpingj.kuntai.pojo.vo.GetData;

import java.util.List;

public interface BalanceSevice {

    Double SumBPrice(Integer uid, int bptype, int isverified, GetData getData);

    Integer CountBPrice(Integer uid, int bptype, int isverified, GetData getData);

    Double SumBPriceByIds(List<Integer> integers, int bptype, int isverified, GetData getData);

    boolean insertBalanceByBp(WP_Balance wp_balance);

    List<BanlanceView> selectBanlanceByIds(GetData getData, List<Integer> ids);

    Double SumBPriceByIdsAndBptypes(List<Integer> ids, List<Integer> bptypes, GetData getData);

    Double SumBPriceByIdsByBptype(List<Integer> ids, int i, GetData getData);

    List<CashView> selectBanlanceByIdsByBptype(GetData getData, List<Integer> ids);

    WP_Balance selectBalanceByBpid(Integer bpid);

    boolean updateBalanceByBalance(WP_Balance wpBalance);

    Double sumBppriceByTimeAndbptype(Integer bptype, Integer isverified);
}
