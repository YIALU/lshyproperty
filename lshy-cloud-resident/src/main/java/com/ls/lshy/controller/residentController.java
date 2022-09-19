package com.ls.lshy.controller;

import com.ls.lshy.entity.Resident;
import com.ls.lshy.service.ResidentService;
import com.ls.lshy.utils.PageUtils;
import com.ls.lshy.utils.R;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

/**
 * @author ls
 * @create 2022-09-18-10:44
 */
@Api(tags="住户表")
@RestController
@RequestMapping("/resident")
public class residentController {

        @Autowired
        private ResidentService residentService;

        
        @RequestMapping("/list")
        public R list(@RequestParam Map<String, Object> params){
                PageUtils page = residentService.queryPage(params);
                return R.ok().put("page", page);
        }
        
        
        /**
         * 信息
         */
        @RequestMapping("/info/{id}")
        public R info(@PathVariable("id") Integer id){
                System.out.println("获取用户"+id);
                Resident resident = residentService.getById(id);
                return R.ok().put("resident", resident);
        }

        /**
         * 保存
         */
        @RequestMapping("/save")
        public R save(@RequestBody Resident resident){
                residentService.save(resident);

                return R.ok();
        }

        /**
         * 修改
         */
        @RequestMapping("/update")
        public R update(@RequestBody Resident resident){
                residentService.updateById(resident);

                return R.ok();
        }

        /**
         * 删除
         */
        @RequestMapping("/delete")
        public R delete(@RequestBody Integer[] ids){
                residentService.removeByIds(Arrays.asList(ids));
                return R.ok();
        }
        

}
