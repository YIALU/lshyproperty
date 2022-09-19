package com.ls.lshy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ls.lshy.entity.Resident;
import com.ls.lshy.mapper.ResidentMapper;
import com.ls.lshy.service.ResidentService;
import com.ls.lshy.utils.PageUtils;
import com.ls.lshy.utils.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
* @author 刘帅
* @description 针对表【resident】的数据库操作Service实现
* @createDate 2022-09-18 10:12:40
*/
@Service
public class ResidentServiceImpl extends ServiceImpl<ResidentMapper, Resident> implements ResidentService {

    @Autowired
    private ResidentMapper residentMapper;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Resident> page = this.page(
                new Query<Resident>().getPage(params),
                new QueryWrapper<Resident>()
        );

        return new PageUtils(page);
    }

    

}
