package com.ls.lshy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ls.lshy.entity.Resident;
import com.ls.lshy.utils.PageUtils;

import java.util.Map;

/**
* @author 刘帅
* @description 针对表【resident】的数据库操作Service
* @createDate 2022-09-18 10:12:40
*/
public interface ResidentService extends IService<Resident> {

    PageUtils queryPage(Map<String, Object> params);

}
