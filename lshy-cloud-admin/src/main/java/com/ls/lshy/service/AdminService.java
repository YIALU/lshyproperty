package com.ls.lshy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ls.lshy.entity.Admin;
import com.ls.lshy.utils.R;

/**
* @author 刘帅
* @description 针对表【admin】的数据库操作Service
* @createDate 2022-09-19 19:04:18
*/
public interface AdminService extends IService<Admin> {

    R login(String username, String password);

}
