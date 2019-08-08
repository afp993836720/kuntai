package com.shengpingj.kuntai.service;

import com.shengpingj.kuntai.pojo.WP_Config;

import java.util.List;

public interface WP_ConfigService {
    WP_Config selectByName(String name);
    List<WP_Config> selectWebConfigByGroupAndStatus(Integer group, Integer status);

    boolean updateConfigByList(List<WP_Config> configs);

    String selectValueById(Integer id);

    WP_Config selectConfigById(Integer id);

    boolean insertConfigByConfig(WP_Config wp_config);

    boolean updateConfigByConfig(WP_Config wp_config);

    boolean deleteConf(Integer id);
}
