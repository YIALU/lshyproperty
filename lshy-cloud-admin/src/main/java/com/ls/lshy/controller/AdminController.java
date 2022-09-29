package com.ls.lshy.controller;

import com.ls.lshy.entity.Admin;
import com.ls.lshy.service.AdminService;
import com.ls.lshy.utils.R;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ls
 * @create 2022-09-19-19:27
 */

@RestController
@Log
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;


    @PostMapping("/login")
    public R login(@RequestBody Admin admin){

        String username = admin.getUsername();
        String password = admin.getPassword();
        log.info(username);
        log.info(password);
        return adminService.login(username,password);

    }


}
