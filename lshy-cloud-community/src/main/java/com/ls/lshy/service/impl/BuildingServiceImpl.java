package com.ls.lshy.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ls.lshy.entity.Building;
import com.ls.lshy.mapper.BuildingMapper;
import com.ls.lshy.service.BuildingService;
import com.ls.lshy.utils.PageUtils;
import com.ls.lshy.utils.Query;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
* @author 刘帅
* @description 针对表【building】的数据库操作Service实现
* @createDate 2022-09-18 17:26:56
*/
@Service
public class BuildingServiceImpl extends ServiceImpl<BuildingMapper, Building>
implements BuildingService{

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Building> page = this.page(
                new Query<Building>().getPage(params),
                new QueryWrapper<Building>()
        );

        return new PageUtils(page);
    }

}
