package com.shengpingj.kuntai.service;

import com.shengpingj.kuntai.pojo.WP_Productclass;
import com.shengpingj.kuntai.pojo.WP_RiskWithBLOBs;
import com.shengpingj.kuntai.pojo.vo.GoodsView;
import com.shengpingj.kuntai.pojo.vo.UserGoodsView;

import java.util.List;

public interface GoodsService {

    List<GoodsView> selectAllGoods();

    boolean updateGoodsById(Integer id);

    GoodsView selectGoodsById(Integer pid);

    boolean updateGoodsIsOpenById(Integer isopen, Integer pid);

    List<WP_Productclass> selectAllProClass();

    boolean updateProClassByPcid(Integer id);

    boolean updateProClassPcnameByPcid(WP_Productclass wp_productclass);

    boolean insertProClass(WP_Productclass wp_productclass);

    WP_RiskWithBLOBs selectAllRisk();

    Integer insertRiskById(WP_RiskWithBLOBs wp_riskWithBLOBs);

    Integer updatetRiskById(WP_RiskWithBLOBs wp_riskWithBLOBs);

    List<GoodsView> selectGoodsByIsDelete();

    boolean updateIsDeleteById(Integer id);

    List<UserGoodsView> selectAllGoodsByAjax();

}
