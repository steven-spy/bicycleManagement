package com.software.bicycle.service.impl;

import com.software.bicycle.dao.mapper.BicycleModelMapper;
import com.software.bicycle.service.BicycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Steven
 * @create 2021/3/31 13:31
 */
@Service
public class BicycleServiceImpl implements BicycleService {
    @Autowired
    BicycleModelMapper bicycleModelMapper;

    /**
     * 获取自行车数量
     *
     * @return int
     */
    @Override
    public int getBicycleCount() {
        return bicycleModelMapper.getBicycleCount();
    }
}
