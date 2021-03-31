package com.software.bicycle.controller;

import com.software.bicycle.dao.model.LeasePointModel;
import com.software.bicycle.service.LeasePointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 租赁点信息
 *
 * @author spy
 */
@RestController
@RequestMapping(value = "/LeasePoint")
public class LeasePointController {

    @Autowired
    LeasePointService leasePointService;

    /**
     * 获取全部租赁点信息
     *
     * @return List<LeasePointModel>
     */
    @RequestMapping(value = {"/getAll"}, method = RequestMethod.GET)
    public ResponseEntity<List<LeasePointModel>> getAll() {
        List<LeasePointModel> result = leasePointService.getAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    /**
     * 根据名称搜索租赁点
     *
     * @param lpName
     * @return List<LeasePointModel>
     */
    @RequestMapping(value = {"/searchLeasePointByName"}, method = RequestMethod.GET)
    public ResponseEntity<List<LeasePointModel>> searchLeasePointByName(String lpName) {
        List<LeasePointModel> result = leasePointService.searchLeasePointByName(lpName);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
