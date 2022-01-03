package com.spring.study.spring;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2022-01-03 22:18
 */
public class MyDeferredImportSelector implements DeferredImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{Person.class.getName()};
    }
}
