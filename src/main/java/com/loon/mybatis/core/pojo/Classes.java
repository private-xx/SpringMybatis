package com.loon.mybatis.core.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * User:李辉
 * date:2017-02-28 17:12
 */

public class Classes {
    private Integer id;
    private String name;

    private Teacher teacher;

    public Integer getId() {
        return id;
    }

    @JsonFormat(pattern = "yyyy-mm-dd HH:mm:ss")
    public Date createtime;


    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher=" + teacher +
                ", createtime=" + createtime +
                '}';
    }
}
