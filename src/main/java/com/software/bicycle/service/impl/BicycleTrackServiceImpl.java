package com.software.bicycle.service.impl;

import com.software.bicycle.dao.mapper.BicycleTrackModelMapper;
import com.software.bicycle.dao.model.BicycleTrackModel;
import com.software.bicycle.service.BicycleTrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BicycleTrackServiceImpl implements BicycleTrackService {

    @Autowired
    BicycleTrackModelMapper bicycleTrackModelMapper;

    /**
     * 获取全部自行车轨迹
     *
     * @return 全部自行车轨迹
     */
    @Override
    public List<BicycleTrackModel> getAll() {
        return bicycleTrackModelMapper.getAll();
    }

    /**
     * 获取指定自行车轨迹
     *
     * @param btBicycleName
     * @return 自行车轨迹
     */
    @Override
    public List<BicycleTrackModel> getAppointBicycleTrack(String btBicycleName) {
        return bicycleTrackModelMapper.getAppointBicycleTrack(btBicycleName);
    }
}
