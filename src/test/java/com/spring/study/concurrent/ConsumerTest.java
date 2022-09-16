package com.spring.study.concurrent;

import com.spring.study.advanced.VUtils;
import org.junit.Test;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021/12/14 17:19
 */
public class ConsumerTest {

    @Test
    public void isTrue() {
//        VUtils.isTure(false).throwMessage("俺要抛出异常");
        VUtils.isTure(true).throwMessage("俺要抛出异常");
    }
}
