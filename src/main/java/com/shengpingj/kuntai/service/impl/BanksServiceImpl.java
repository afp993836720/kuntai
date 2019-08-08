package com.shengpingj.kuntai.service.impl;

import com.shengpingj.kuntai.mapper.WP_BankcardMapper;
import com.shengpingj.kuntai.mapper.WP_BanksMapper;
import com.shengpingj.kuntai.pojo.WP_Banks;
import com.shengpingj.kuntai.pojo.vo.BanksView;
import com.shengpingj.kuntai.service.BanksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BanksServiceImpl implements BanksService {
    @Autowired
    private WP_BanksMapper banksMapper;
    @Autowired
    private WP_BankcardMapper bankcardMapper;

    @Override
    public List<WP_Banks> selectAllBanks() {
        return banksMapper.selectAllBanks();
    }

    @Override
    public boolean updateBanksById(WP_Banks banks) {
        return banksMapper.updateBanksById(banks);
    }

    @Override
    public boolean insertBanksById(WP_Banks banks) {
        return banksMapper.insertBanksById(banks);
    }

    @Override
    public boolean deleteBanksById(Integer id) {
        return banksMapper.deleteBanksById(id) > 0 ? true : false;
    }

    @Override
    public BanksView selectUserBankByUid(Integer uid) {
        return bankcardMapper.selectUserBankByUid(uid);
    }
}
