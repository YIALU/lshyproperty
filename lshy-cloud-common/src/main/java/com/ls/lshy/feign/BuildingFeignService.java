package com.ls.lshy.feign;

import com.ls.lshy.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author ls
 * @create 2022-09-18-20:31
 */

@Component
@FeignClient(name = "community",contextId = "Building-server",path = "/building")
public interface BuildingFeignService {

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params);

}
