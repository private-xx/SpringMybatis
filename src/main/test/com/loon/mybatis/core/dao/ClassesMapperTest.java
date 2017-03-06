package com.loon.mybatis.core.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.loon.mybatis.core.pojo.Classes;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * User:李辉
 * date:2017-02-28 18:03
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring.xml")
public class ClassesMapperTest {
    private final transient Logger logger = LoggerFactory.getLogger(getClass());
    @Resource
    ClassesMapper classesMapper;
    @Test
    public void getClasses() throws Exception {
        Classes classes = classesMapper.getClasses(1);
        logger.info("test data    "+classes);
    }

    @Test
    public void getAllClasses()throws Exception{
        List<Classes> classes = (List<Classes>) classesMapper.getAllClasses();
        ObjectMapper mapper = new ObjectMapper();
        logger.info("test data    "+ mapper.writeValueAsString(classes));
    }

}