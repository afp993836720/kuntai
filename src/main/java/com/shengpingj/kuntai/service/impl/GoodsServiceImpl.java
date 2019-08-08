package com.shengpingj.kuntai.service.impl;

import com.shengpingj.kuntai.common.DoubleFormatText;
import com.shengpingj.kuntai.common.StringConverArray;
import com.shengpingj.kuntai.mapper.WP_ProductclassMapper;
import com.shengpingj.kuntai.mapper.WP_ProductdataMapper;
import com.shengpingj.kuntai.mapper.WP_ProductinfoMapper;
import com.shengpingj.kuntai.mapper.WP_RiskMapper;
import com.shengpingj.kuntai.pojo.WP_Productclass;
import com.shengpingj.kuntai.pojo.WP_Productinfo;
import com.shengpingj.kuntai.pojo.WP_Risk;
import com.shengpingj.kuntai.pojo.WP_RiskWithBLOBs;
import com.shengpingj.kuntai.pojo.vo.GoodsView;
import com.shengpingj.kuntai.pojo.vo.UserGoodsView;
import com.shengpingj.kuntai.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private WP_ProductinfoMapper wp_productinfoMapper;
    @Autowired
    private WP_ProductdataMapper wp_productdataMapper;
    @Autowired
    private WP_ProductclassMapper wp_productclassMapper;
    @Autowired
    private WP_RiskMapper wp_riskMapper;

    @Override
    public List<GoodsView> selectAllGoods() {
        List<GoodsView> goodsViews = wp_productinfoMapper.selectAllGoods();
        for (GoodsView view : goodsViews) {
            view.setRandsstr(DoubleFormatText.doubleFormat(view.getRands()));
            view.setPoint_lowstr(DoubleFormatText.doubleFormat(view.getPoint_low()));
            view.setPoint_topstr(DoubleFormatText.doubleFormat(view.getPoint_top()));
        }
        return goodsViews;
    }

    @Override
    public boolean updateGoodsById(Integer id) {
        int result = wp_productinfoMapper.updateGoods(id);
        int res =wp_productdataMapper.updateGoodsData(id);
        if (res == 1 && result ==1){
            return true;
        }
        return false;
    }

    @Override
    public GoodsView selectGoodsById(Integer pid) {
        GoodsView goodsView = wp_productinfoMapper.selectGoodsById(pid);
        goodsView.setTimeopen(StringConverArray.stringConverArry(goodsView.getOpentime()));
        goodsView.setMondayopentime(goodsView.getTimeopen()[0]);
        goodsView.setTuesdayopentime(goodsView.getTimeopen()[1]);
        goodsView.setWednesdayopentime(goodsView.getTimeopen()[2]);
        goodsView.setThursdayopentime(goodsView.getTimeopen()[3]);
        goodsView.setFridayopentime(goodsView.getTimeopen()[4]);
        goodsView.setSaturdayopentime(goodsView.getTimeopen()[5]);
        goodsView.setSundayopentime(goodsView.getTimeopen()[6]);
        return goodsView;
    }

    @Override
    public boolean updateGoodsIsOpenById(Integer isopen, Integer pid) {
        int res = wp_productinfoMapper.updateGoodsIsOpenById(isopen,pid);
        if (res == 1){
            return true;
        }
        return false;
    }

    @Override
    public List<WP_Productclass> selectAllProClass() {
        return wp_productclassMapper.selectAllProClass();
    }

    @Override
    public boolean updateProClassByPcid(Integer id) {
        int res = wp_productclassMapper.updateProClassByPcid(id);
        if (res == 1){
            return true;
        }
        return false;
    }

    @Override
    public boolean updateProClassPcnameByPcid(WP_Productclass wp_productclass) {
        int res = wp_productclassMapper.updateProClassPcnameByPcid(wp_productclass);
        if (res == 1){
            return true;
        }
        return false;
    }

    @Override
    public boolean insertProClass(WP_Productclass wp_productclass) {
        int res = wp_productclassMapper.insertProClass(wp_productclass);
        if (res == 1){
            return true;
        }
        return false;
    }

    @Override
    public WP_RiskWithBLOBs selectAllRisk() {
        List<WP_RiskWithBLOBs> wp_risks = wp_riskMapper.selectAllRisk();
        return wp_risks.get(0);
    }

    @Override
    public Integer insertRiskById(WP_RiskWithBLOBs wp_riskWithBLOBs) {
        return wp_riskMapper.insertRiskById(wp_riskWithBLOBs);
    }

    @Override
    public Integer updatetRiskById(WP_RiskWithBLOBs wp_riskWithBLOBs) {
        return wp_riskMapper.updatetRiskById(wp_riskWithBLOBs);
    }

    @Override
    public List<GoodsView> selectGoodsByIsDelete() {
        List<GoodsView> goodsViews = wp_productinfoMapper.selectGoodsByIsDelete();
        for (GoodsView view : goodsViews) {
            view.setRandsstr(DoubleFormatText.doubleFormat(view.getRands()));
            view.setPoint_lowstr(DoubleFormatText.doubleFormat(view.getPoint_low()));
            view.setPoint_topstr(DoubleFormatText.doubleFormat(view.getPoint_top()));
        }
        return goodsViews;
    }

    @Override
    public boolean updateIsDeleteById(Integer id) {
        int result = wp_productinfoMapper.updateGoodsIsDeleteById(id);
        if (result ==1){
            return true;
        }
        return false;
    }

    @Override
    public List<UserGoodsView> selectAllGoodsByAjax() {
        return wp_productinfoMapper.selectAllGoodsByAjax();
    }
}
