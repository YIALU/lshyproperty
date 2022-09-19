package com.ls.lshy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ls.lshy.entity.Notice;
import com.ls.lshy.service.NoticeService;
import com.ls.lshy.mapper.NoticeMapper;
import org.springframework.stereotype.Service;

/**
* @author 刘帅
* @description 针对表【notice】的数据库操作Service实现
* @createDate 2022-09-18 17:26:56
*/
@Service
public class NoticeServiceImpl extends ServiceImpl<NoticeMapper, Notice>
implements NoticeService{

}
