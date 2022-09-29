package com.ls.lshy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ls.lshy.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 刘帅
* @description 针对表【admin】的数据库操作Mapper
* @createDate 2022-09-19 19:04:18
* @Entity com.ls.lshy.entity.Admin
*/

@Mapper
public interface AdminMapper extends BaseMapper<Admin> {


    String selectOneByUsername(String name);


}
