package com.software.bicycle.dao.mapper;

import com.software.bicycle.dao.model.BicycleTrackModel;

import java.util.List;

/**
 * 自行车轨迹xml接口
 *
 * @author spy
 */
public interface BicycleTrackModelMapper {
    /**
     * 获取全部自行车轨迹
     *
     * @return 全部自行车轨迹
     */
    List<BicycleTrackModel> getAll();

    /**
     * 获取指定自行车轨迹
     *
     * @param btBicycleName
     * @return 自行车轨迹
     */
    List<BicycleTrackModel> getAppointBicycleTrack(String btBicycleName);
}
