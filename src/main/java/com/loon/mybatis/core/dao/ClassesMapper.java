package com.loon.mybatis.core.dao;

import com.loon.mybatis.core.pojo.Classes;

import java.util.List;

/**
 * User:李辉
 * date:2017-02-28 17:21
 */
public interface ClassesMapper {
    Classes getClasses(Integer id);

    List<Classes> getAllClasses();
}
