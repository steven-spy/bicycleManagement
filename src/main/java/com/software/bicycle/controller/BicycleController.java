package com.software.bicycle.controller;

import com.software.bicycle.service.BicycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Steven
 * @create 2021/3/31 13:31
 */
@RestController
@RequestMapping(value = "/Bicycle")
public class BicycleController {
    @Autowired
    BicycleService bicycleService;

    /**
     * 获取自行车数量
     *
     * @return int
     */
    @RequestMapping(value = {"/getBicycleCount"}, method = RequestMethod.GET)
    public ResponseEntity<Integer> getBicycleCount() {
        int result = bicycleService.getBicycleCount();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
