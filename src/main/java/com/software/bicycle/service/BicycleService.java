package com.software.bicycle.service;

import com.software.bicycle.dao.model.BicycleModel;

import java.util.List;

/**
 * @author Steven
 * @create 2021/3/31 13:31
 */
public interface BicycleService {
    /**
     * 获取自行车数量
     *
     * @return int
     */
    int getBicycleCount();

    /**
     * 添加自行车信息
     *
     * @param bicycle
     * @return BicycleModel
     */
    BicycleModel addBicycle(BicycleModel bicycle);

    /**
     * 获取自行车分页信息
     *
     * @param pageSize
     * @param pageIndex
     * @return List<BicycleModel>
     */
    List<BicycleModel> getAllWithPaging(int pageSize, int pageIndex);

    /**
     * 获取维修中自行车分页信息
     *
     * @return List<BicycleModel>
     */
    List<BicycleModel> getAllWithCondition();

    /**
     * 根据条件查询自行车信息
     *
     * @param biName
     * @return List<BicycleModel>
     */
    List<BicycleModel> searchBicycleByName(String biName);

    /**
     * 根据biId维修自行车
     *
     * @param biId
     * @return int
     */
    int repairBicycle(int biId);

    /**
     * 根据biId删除自行车
     *
     * @param biId
     * @return int
     */
    int deleteBicycleById(int biId);
}
