package com.ls.lshy.controller;

import com.ls.lshy.entity.Building;
import com.ls.lshy.service.BuildingService;
import com.ls.lshy.utils.PageUtils;
import com.ls.lshy.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 
 *
 * @author stark
 * @email ${email}
 * @date 2022-06-26 12:57:02
 */
@CrossOrigin
@RestController
@RequestMapping("/building")
public class BuildingController {
    @Autowired
    private BuildingService buildingService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = buildingService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		Building building = buildingService.getById(id);

        return R.ok().put("building", building);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody Building building){
		buildingService.save(building);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody Building building){
		buildingService.updateById(building);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        System.out.println(ids);
		buildingService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
