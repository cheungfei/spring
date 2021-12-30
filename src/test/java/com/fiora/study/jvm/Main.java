package com.fiora.study.jvm;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final int _1M = 1024 * 1024;
//    private static final int _1M = 1024;

    public static void main(String[] args) {

        List<byte[]> byteList = new ArrayList<>();
        for(int i=0; i<Integer.MAX_VALUE; i++){
            byte[] test = new byte[_1M];
            byteList.add(test);
        }
    }
}
