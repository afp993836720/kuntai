package com.shengpingj.kuntai.mapper;

import com.shengpingj.kuntai.pojo.WP_Balance;
import com.shengpingj.kuntai.pojo.vo.BanlanceView;
import com.shengpingj.kuntai.pojo.vo.CashView;
import com.shengpingj.kuntai.pojo.vo.GetData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WP_BalanceMapper {
    Double SumBPrice(@Param("uid") Integer uid,@Param("bptype") int bptype, @Param("isverified") int isverified,@Param("getdata") GetData getData);

    Integer CountBPrice(@Param("uid") Integer uid,@Param("bptype") int bptype, @Param("isverified") int isverified,@Param("getdata") GetData getData);

    Double SumBPriceByIds(@Param("ids") List<Integer> integers, @Param("bptype") int bptype, @Param("isverified") int isverified,@Param("getdata") GetData getData);

    int insertBalanceByBp(@Param("balance") WP_Balance wp_balance);

    List<BanlanceView> selectBanlanceByIds(@Param("getdata") GetData getData,@Param("ids") List<Integer> ids);

    Double SumBPriceByIdsAndBptypes(@Param("ids") List<Integer> ids,@Param("bptypes") List<Integer> bptypes,@Param("getdata") GetData getData);

    Double SumBPriceByIdsByBptype(@Param("ids") List<Integer> ids,@Param("bptype") int i,@Param("getdata") GetData getData);

    List<CashView> selectBanlanceByIdsByBptype(@Param("ids") List<Integer> ids,@Param("getdata") GetData getData);

    WP_Balance selectBalanceByBpid(@Param("bpid") Integer bpid);

    int updateBalanceByBalance(@Param("wpBalance") WP_Balance wpBalance);

    Double sumBppriceByTimeAndbptype(@Param("startTime") String startTime,@Param("bptype") Integer bptype, @Param("isverified") Integer isverified,@Param("endTime") String endTime);
//    int countByExample(WP_BalanceExample example);
//
//    int deleteByExample(WP_BalanceExample example);
//
//    int deleteByPrimaryKey(Integer bpid);
//
//    int insert(WP_Balance record);
//
//    int insertSelective(WP_Balance record);
//
//    List<WP_Balance> selectByExample(WP_BalanceExample example);
//
//    WP_Balance selectByPrimaryKey(Integer bpid);
//
//    int updateByExampleSelective(@Param("record") WP_Balance record, @Param("example") WP_BalanceExample example);
//
//    int updateByExample(@Param("record") WP_Balance record, @Param("example") WP_BalanceExample example);
//
//    int updateByPrimaryKeySelective(WP_Balance record);
//
//    int updateByPrimaryKey(WP_Balance record);
}