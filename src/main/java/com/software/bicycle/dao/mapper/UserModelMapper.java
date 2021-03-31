package com.software.bicycle.dao.mapper;

import com.software.bicycle.dao.model.UserModel;

import java.util.List;

/**
 * 用户xml接口
 *
 * @author spy
 */
public interface UserModelMapper {
    /**
     * 获取全部用户
     * @return 用户信息
     */
    List<UserModel> getAll();
}
