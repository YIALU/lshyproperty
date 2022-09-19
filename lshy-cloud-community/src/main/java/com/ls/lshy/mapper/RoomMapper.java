package com.ls.lshy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ls.lshy.entity.Room;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 刘帅
* @description 针对表【room】的数据库操作Mapper
* @createDate 2022-09-18 17:26:56
* @Entity com.ls.lshy.entity.Room
*/
@Mapper
public interface RoomMapper extends BaseMapper<Room> {


}
