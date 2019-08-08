package com.shengpingj.kuntai.mapper;

import com.shengpingj.kuntai.pojo.WP_Productinfo;
import com.shengpingj.kuntai.pojo.vo.GoodsView;
import com.shengpingj.kuntai.pojo.vo.UserGoodsView;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WP_ProductinfoMapper {
    List<GoodsView> selectAllGoods();

    GoodsView selectGoodsById(Integer id);

    int updateGoods(Integer id);

    int updateGoodsIsOpenById(@Param("isopen") Integer isopen, @Param("pid") Integer pid);

    List<GoodsView> selectGoodsByIsDelete();

    int updateGoodsIsDeleteById(Integer id);

    List<UserGoodsView> selectAllGoodsByAjax();
//    int countByExample(WP_ProductinfoExample example);
//
//    int deleteByExample(WP_ProductinfoExample example);
//
//    int deleteByPrimaryKey(Integer pid);
//
//    int insert(WP_Productinfo record);
//
//    int insertSelective(WP_Productinfo record);
//
//    List<WP_Productinfo> selectByExampleWithBLOBs(WP_ProductinfoExample example);
//
//    List<WP_Productinfo> selectByExample(WP_ProductinfoExample example);
//
//    WP_Productinfo selectByPrimaryKey(Integer pid);
//
//    int updateByExampleSelective(@Param("record") WP_Productinfo record, @Param("example") WP_ProductinfoExample example);
//
//    int updateByExampleWithBLOBs(@Param("record") WP_Productinfo record, @Param("example") WP_ProductinfoExample example);
//
//    int updateByExample(@Param("record") WP_Productinfo record, @Param("example") WP_ProductinfoExample example);
//
//    int updateByPrimaryKeySelective(WP_Productinfo record);
//
//    int updateByPrimaryKeyWithBLOBs(WP_Productinfo record);
//
//    int updateByPrimaryKey(WP_Productinfo record);
}