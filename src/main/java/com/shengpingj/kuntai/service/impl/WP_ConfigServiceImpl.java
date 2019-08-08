package com.shengpingj.kuntai.service.impl;

import com.shengpingj.kuntai.mapper.WP_ConfigMapper;
import com.shengpingj.kuntai.pojo.WP_Config;
import com.shengpingj.kuntai.service.WP_ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WP_ConfigServiceImpl implements WP_ConfigService {
    @Autowired
    public WP_ConfigMapper wp_configMapper;

    @Override
    public WP_Config selectByName(String name) {
        return wp_configMapper.selectByName(name);
    }
    @Override
    public List<WP_Config> selectWebConfigByGroupAndStatus(Integer group, Integer status) {
        return wp_configMapper.selectWebConfigByGroupAndStatus(group,status);
    }

    @Override
    public boolean updateConfigByList(List<WP_Config> configs) {
        int i = 0;
        for (WP_Config config : configs) {
            i += wp_configMapper.updateConfigByList(config);
        }
        return i > 0 ?true:false;
    }

    @Override
    public String selectValueById(Integer id) {
        return wp_configMapper.selectValueById(id);
    }

    @Override
    public WP_Config selectConfigById(Integer id) {
        return wp_configMapper.selectConfigById(id);
    }

    @Override
    public boolean insertConfigByConfig(WP_Config wp_config) {
        return wp_configMapper.insertConfigByConfig(wp_config) > 0 ? true:false;
    }


    @Override
    public boolean updateConfigByConfig(WP_Config wp_config) {
        return wp_configMapper.updateConfigByList(wp_config) > 0 ? true:false;
    }

    @Override
    public boolean deleteConf(Integer id) {
        return wp_configMapper.deleteConf(id) > 0 ? true:false;
    }
}
