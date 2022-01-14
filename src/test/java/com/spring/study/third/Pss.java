package com.spring.study.third;

import cn.pml.cnos.network.utils.NetUtils;
import org.apache.commons.lang.StringUtils;

import java.util.Arrays;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021/12/1 14:08
 */
public class Pss {
    public static void main(String[] args) {
/*        List< Integer > l1 = new LinkedList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        List < Integer > l2 = new LinkedList<>();
        l2.add(90);
        l1.retainAll(l2);
        System.out.println(l1);*/


//        String str1 = "1.1.1.1/24";
//        String str2 = "1.1.1.0/24";
//        String ipSlashMask = NetUtils.getNetworkSegmentByIpSlashMask(str1);
//        String ipSlashMask2 = NetUtils.getNetworkSegmentByIpSlashMask(str2);
//        System.out.println("ip1: " + ipSlashMask + ", ip2: " + ipSlashMask2 + "，结果：" + StringUtils.equals(ipSlashMask, ipSlashMask2));

        final Long[] j = {10000L};

        for (int i = 0; i < 5; i++) {
            System.out.println(++j[0]);
        }

        System.out.println(Arrays.toString(j));
    }
}
