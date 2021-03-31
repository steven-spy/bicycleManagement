package com.software.bicycle.controller;

import com.software.bicycle.dao.model.UserModel;
import com.software.bicycle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户信息控制类
 *
 * @author spy
 */
@RestController
@RequestMapping(value = "/User")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 获取所有人员
     *
     * @return 所有人员信息
     */
    @RequestMapping(value = {"/getAll"}, method = RequestMethod.GET)
    public ResponseEntity<List<UserModel>> getAll() {
        List<UserModel> result = userService.getAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
