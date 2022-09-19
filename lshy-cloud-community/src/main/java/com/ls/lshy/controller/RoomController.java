package com.ls.lshy.controller;

import com.ls.lshy.entity.Room;
import com.ls.lshy.service.RoomService;
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
@RestController
@RequestMapping("/room")
public class RoomController {
    @Autowired
    private RoomService roomService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = roomService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		Room room = roomService.getById(id);

        return R.ok().put("room", room);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody Room room){
		roomService.save(room);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody Room room){
		roomService.updateById(room);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		roomService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }



}
