package com.spring.study.spring;

import com.spring.study.entity.PersonDest;
import com.spring.study.entity.PersonSource;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-06-12 22:42
 */
public class TestApacheBeanUtils {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        //下面只是用于单独测试
        PersonSource personSource = new PersonSource(1, "pjmike", "12345", 21);
        PersonDest personDest = new PersonDest();
        BeanUtils.copyProperties(personDest, personSource);
        System.out.println("persondest: "+personDest);
    }
}
