package com.cnos.springboot.io;

import org.apache.commons.lang3.CharSet;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.SortedMap;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-06-05 16:44
 */
public class GetCharacterCharset {
    public static void main(String[] args) {
        System.out.println(Charset.defaultCharset());
        SortedMap<String, Charset> sortedMap = Charset.availableCharsets();
        System.out.println(sortedMap.keySet());

        // static constants
        Charset utf8 = StandardCharsets.UTF_8;
        Charset anotherUtf8 = Charset.forName("UTF-8");

    }
}
