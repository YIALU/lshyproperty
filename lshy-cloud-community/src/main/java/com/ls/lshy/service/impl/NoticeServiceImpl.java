package com.ls.lshy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ls.lshy.entity.Notice;
import com.ls.lshy.mapper.NoticeMapper;
import com.ls.lshy.service.NoticeService;
import com.ls.lshy.utils.PageUtils;
import com.ls.lshy.utils.Query;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
* @author 刘帅
* @description 针对表【notice】的数据库操作Service实现
* @createDate 2022-09-18 17:26:56
*/
@Service
public class NoticeServiceImpl extends ServiceImpl<NoticeMapper, Notice>
implements NoticeService{

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Notice> page = this.page(
                new Query<Notice>().getPage(params),
                new QueryWrapper<Notice>()
        );

        return new PageUtils(page);
    }


}
