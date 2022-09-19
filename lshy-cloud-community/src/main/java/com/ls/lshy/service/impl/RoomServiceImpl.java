package com.ls.lshy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ls.lshy.entity.Room;
import com.ls.lshy.mapper.RoomMapper;
import com.ls.lshy.service.RoomService;
import com.ls.lshy.utils.PageUtils;
import com.ls.lshy.utils.Query;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
* @author 刘帅
* @description 针对表【room】的数据库操作Service实现
* @createDate 2022-09-18 17:26:56
*/
@Service
public class RoomServiceImpl extends ServiceImpl<RoomMapper, Room> implements RoomService{

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Room> page = this.page(
                new Query<Room>().getPage(params),
                new QueryWrapper<Room>()
        );

        return new PageUtils(page);
    }

}
