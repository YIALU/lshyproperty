package com.ls.lshy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ls.lshy.entity.Room;
import com.ls.lshy.utils.PageUtils;

import java.util.Map;

/**
* @author 刘帅
* @description 针对表【room】的数据库操作Service
* @createDate 2022-09-18 17:26:56
*/
public interface RoomService extends IService<Room> {
    PageUtils queryPage(Map<String, Object> params);
}
