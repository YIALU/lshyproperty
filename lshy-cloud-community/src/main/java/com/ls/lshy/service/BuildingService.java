package com.ls.lshy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ls.lshy.entity.Building;
import com.ls.lshy.utils.PageUtils;

import java.util.Map;

/**
* @author 刘帅
* @description 针对表【building】的数据库操作Service
* @createDate 2022-09-18 17:26:56
*/
public interface BuildingService extends IService<Building> {

    PageUtils queryPage(Map<String, Object> params);

}
