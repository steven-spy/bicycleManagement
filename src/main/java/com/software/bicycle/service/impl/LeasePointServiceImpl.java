package com.software.bicycle.service.impl;

import com.software.bicycle.dao.mapper.LeasePointModelMapper;
import com.software.bicycle.dao.model.LeasePointModel;
import com.software.bicycle.service.LeasePointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 租赁点信息
 *
 * @author spy
 */
@Service
public class LeasePointServiceImpl implements LeasePointService {

    @Autowired
    LeasePointModelMapper leasePointModelMapper;

    /**
     * 获取全部租赁点信息
     *
     * @return List<LeasePointModel>
     */
    @Override
    public List<LeasePointModel> getAll() {
        return leasePointModelMapper.getAll();
    }

    /**
     * 根据名称搜索租赁点
     *
     * @param lpName
     * @return List<LeasePointModel>
     */
    @Override
    public List<LeasePointModel> searchLeasePointByName(String lpName) {
        return leasePointModelMapper.searchLeasePointByName(lpName);
    }
}
