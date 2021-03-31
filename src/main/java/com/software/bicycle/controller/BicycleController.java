package com.software.bicycle.controller;

import com.software.bicycle.dao.model.BicycleModel;
import com.software.bicycle.service.BicycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    /**
     * 添加自行车信息
     *
     * @param bicycle
     * @return
     */
    @RequestMapping(value = {"/addBicycle"}, method = {RequestMethod.POST})
    public ResponseEntity<BicycleModel> addBicycle(@RequestBody BicycleModel bicycle) {
        BicycleModel result = bicycleService.addBicycle(bicycle);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    /**
     * 获取自行车分页信息
     *
     * @param pageSize
     * @param pageCount
     * @return List<BicycleModel>
     */
    @RequestMapping(value = {"/getAllWithPaging"}, method = RequestMethod.GET)
    public ResponseEntity<List<BicycleModel>> getAllWithPaging(int pageSize, int pageCount) {
        int pageIndex = (pageCount - 1) * pageSize;
        List<BicycleModel> result = bicycleService.getAllWithPaging(pageSize, pageIndex);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    /**
     * 获取维修中自行车分页信息
     *
     * @return List<BicycleModel>
     */
    @RequestMapping(value = {"/getAllWithCondition"}, method = RequestMethod.GET)
    public ResponseEntity<List<BicycleModel>> getAllWithCondition() {
        List<BicycleModel> result = bicycleService.getAllWithCondition();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    /**
     * 根据条件查询自行车信息
     *
     * @param biName
     * @return List<BicycleModel>
     */
    @RequestMapping(value = {"/searchBicycleByName"}, method = RequestMethod.GET)
    public ResponseEntity<List<BicycleModel>> searchBicycleByName(String biName) {
        List<BicycleModel> result = bicycleService.searchBicycleByName(biName);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    /**
     * 根据biId维修自行车
     *
     * @param biId
     * @return int
     */
    @RequestMapping(value = {"/repairBicycle"}, method = RequestMethod.GET)
    public ResponseEntity<Integer> repairBicycle(int biId) {
        int result = bicycleService.repairBicycle(biId);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    /**
     * 根据biId删除自行车
     *
     * @param biId
     * @return int
     */
    @RequestMapping(value = {"/deleteBicycleById"}, method = RequestMethod.GET)
    public ResponseEntity<Integer> deleteBicycleById(int biId) {
        int result = bicycleService.deleteBicycleById(biId);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
