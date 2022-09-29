package com.ls.lshy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ls.lshy.entity.Admin;
import com.ls.lshy.mapper.AdminMapper;
import com.ls.lshy.service.AdminService;
import com.ls.lshy.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author 刘帅
* @description 针对表【admin】的数据库操作Service实现
* @createDate 2022-09-19 19:04:18
*/
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService{

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public R login(String username, String password) {

        String pwd = adminMapper.selectOneByUsername(username);
        if (pwd == null)
            return R.error("账号密码错误");
        else if (pwd.equals(password))
            return R.ok("登录成功");
        else
        return R.error("登录失败,未知错误");
    }
}
