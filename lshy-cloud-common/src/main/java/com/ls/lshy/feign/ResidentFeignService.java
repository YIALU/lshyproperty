package com.ls.lshy.feign;

import com.ls.lshy.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author ls
 * @create 2022-09-18-18:57
 */

@Component
@FeignClient(name = "resident",contextId = "resident-server",path = "/resident")
public interface ResidentFeignService {

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params);

    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id);


}
