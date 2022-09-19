package com.ls.lshy.controller;

import com.ls.lshy.feign.ResidentFeignService;
import com.ls.lshy.utils.R;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author ls
 * @create 2022-09-18-11:57
 */
@Log
@RestController
public class ResidentController {

    @Autowired
    private ResidentFeignService residentFeignService;

    @GetMapping(value = "/admin/residentlist")
    public R list(@RequestParam Map<String, Object> params){
        log.info("feign远程调用/resident/list服务");
        return residentFeignService.list(params);
    }


}
