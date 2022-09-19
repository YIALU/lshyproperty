package com.ls.lshy.controller;

import com.ls.lshy.feign.BuildingFeignService;
import com.ls.lshy.utils.R;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author ls
 * @create 2022-09-18-21:13
 */

@RestController
@Log
public class BuildingController {

    @Autowired
    private BuildingFeignService buildingFeignService;

    @GetMapping(value = "/admin/buildinglist")
    public R list(@RequestParam Map<String, Object> params){
        log.info("feign远程调用/building/list服务");
        return buildingFeignService.list(params);
    }


}
