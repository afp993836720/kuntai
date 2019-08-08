package com.shengpingj.kuntai.service.impl;

import com.shengpingj.kuntai.mapper.WP_AreaMapper;
import com.shengpingj.kuntai.service.WP_AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WP_AreaServiceImpl implements WP_AreaService {
    @Autowired
    private WP_AreaMapper areaMapper;
    @Override
    public String selectNameById(Integer id) {
        return areaMapper.selectNameById(id);
    }
}
