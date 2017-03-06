package com.loon.mybatis.core.service.impl;

import com.loon.mybatis.core.dao.ClassesMapper;
import com.loon.mybatis.core.pojo.Classes;
import com.loon.mybatis.core.service.ClassesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * User:李辉
 * date:2017-03-03 16:00
 */
@Service("classesService")
public class ClassesServiceImpl implements ClassesService {
    @Resource
    ClassesMapper classesMapper;

    @Override
    public Classes getAllClasses() {
        return null;
    }
}
