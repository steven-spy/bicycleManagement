package com.software.bicycle.dao.mapper;

import com.software.bicycle.dao.model.LeasePointModel;

import java.util.List;

/**
 * 租赁点xml接口
 *
 * @author spy
 */
public interface LeasePointModelMapper {
    /**
     * 根据lpId删除租赁点
     *
     * @param lpId
     * @return int
     */
    int deleteByPrimaryKey(Long lpId);

    /**
     * 添加新的租赁点
     *
     * @param leasePointModel
     * @return int
     */
    int insert(LeasePointModel leasePointModel);

    /**
     * 根据条件更新租赁点
     *
     * @param leasePointModel
     * @return int
     */
    int updateByPrimaryKeySelective(LeasePointModel leasePointModel);

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