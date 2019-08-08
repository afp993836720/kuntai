package com.shengpingj.kuntai.service;

import com.shengpingj.kuntai.pojo.WP_Banks;
import com.shengpingj.kuntai.pojo.vo.BanksView;

import java.util.List;

public interface BanksService {

    List<WP_Banks> selectAllBanks();

    boolean updateBanksById(WP_Banks banks);

    boolean insertBanksById(WP_Banks banks);

    boolean deleteBanksById(Integer id);

    BanksView selectUserBankByUid(Integer uid);
}
