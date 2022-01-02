package com.spring.study.primary.generics;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-05-27 21:14
 */
public class GenericsDemo03 {
    private Map<String, Integer> map = new HashMap<String,Integer>();

    public static void main(String[] args) throws Exception {
        Field field = GenericsDemo03.class.getDeclaredField("map");
        field.setAccessible(true);
        Type genericType = field.getGenericType();
        if(genericType instanceof ParameterizedType){
            ParameterizedType parameterizedType = (ParameterizedType)genericType;
            System.out.println(parameterizedType.getActualTypeArguments());
        }

        List<? extends GenericDemo> genericsList = new ArrayList<>();
        GenericDemo generics = genericsList.get(0);
//        genericsList.add(new Generics<String>());
//        genericsList.add(new Generics());

        List<? super GenericDemo> genericsListTmp = new ArrayList<>();
        genericsListTmp.add(new GenericDemo());
//        Generics genericsTmp = genericsListTmp.get(0);

//        List<? extends Generics super Generics> genericsListTmp = new ArrayList<>();
    }
}

class Generics<T> { // 在类名后声明引入泛型类型
    private T field;  // 引入后可以将字段声明为泛型类型

    public T getField() { // 类方法内也可以使用泛型类型
        return field;
    }
}
