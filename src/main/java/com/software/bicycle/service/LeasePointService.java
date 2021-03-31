package com.software.bicycle.service;

import com.software.bicycle.dao.model.LeasePointModel;

import java.util.List;

/**
 * 租赁点接口
 *
 * @author spy
 */
public interface LeasePointService {
    /**
     * 获取全部租赁点信息
     *
     * @return List<LeasePointModel>
     */
    List<LeasePointModel> getAll();

    /**
     * 根据名称搜索租赁点
     *
     * @param lpName
     * @return List<LeasePointModel>
     */
    List<LeasePointModel> searchLeasePointByName(String lpName);
}
