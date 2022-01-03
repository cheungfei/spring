package com.spring.study.primary;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2022-01-03 8:20
 * @link https://mp.weixin.qq.com/s/F8iRAlH7WYbaWItAJi1kOQ
 */
public class StringContactTest {

/*    1. 方法1 加号 “+” 拼接 和 方法2 String contact() 方法 适用于小数据量的操作，代码简洁方便，加号“+” 更符合我们的编码和阅读习惯；

    2. 方法3 StringUtils.join() 方法 适用于将ArrayList转换成字符串，就算90万条数据也只需68ms，可以省掉循环读取ArrayList的代码；

    3. 方法4 StringBuffer append() 方法 和 方法5 StringBuilder append() 方法 其实他们的本质是一样的，都是继承自AbstractStringBuilder，效率最高，大批量的数据处理最好选择这两种方法。

    4. 方法1 加号 “+” 拼接 和 方法2 String contact() 方法 的时间和空间成本都很高（分析在本文末尾），不能用来做批量数据的处理。*/

    private static final int max = 100;

    /*
    字符串的加号“+” 方法， 虽然编译器对其做了优化，使用StringBuilder的append方法进行追加，
    但是每循环一次都会创建一个StringBuilder对象，且都会调用toString方法转换成字符串，所以开销很大。
    注：执行一次字符串“+”,相当于 str = new StringBuilder(str).append("a").toString();
     */
    public void testPlus() {
        System.out.println(">>> testPlus() <<<");

        String str = "";

        long start = System.currentTimeMillis();

        for (int i = 0; i < max; i++) {
            str = str + "a";
        }

        long end = System.currentTimeMillis();

        long cost = end - start;

        System.out.println("   {str + \"a\"} cost=" + cost + " ms");
    }

    /*
    其实每次调用contact()方法就是一次数组的拷贝，虽然在内存中是处理都是原子性操作，速度非常快，
    但是，最后的return语句会创建一个新String对象，限制了concat方法的速度。
     */
    public void testConcat() {
        System.out.println(">>> testConcat() <<<");

        String str = "";

        long start = System.currentTimeMillis();

        for (int i = 0; i < max; i++) {
            str = str.concat("a");
        }

        long end = System.currentTimeMillis();

        long cost = end - start;

        System.out.println("   {str.concat(\"a\")} cost=" + cost + " ms");
    }

    public void testJoin() {
        System.out.println(">>> testJoin() <<<");

        long start = System.currentTimeMillis();

        List<String> list = new ArrayList<String>();

        for (int i = 0; i < max; i++) {
            list.add("a");
        }

        long end1 = System.currentTimeMillis();
        long cost1 = end1 - start;

        StringUtils.join(list, "");

        long end = System.currentTimeMillis();
        long cost = end - end1;

        System.out.println("   {list.add(\"a\")} cost1=" + cost1 + " ms");
        System.out.println("   {StringUtils.join(list, \"\")} cost=" + cost
                + " ms");
    }

    /*
    StringBuffer 和 StringBuilder 的append方法都继承自AbstractStringBuilder，整个逻辑都只做字符数组的加长，拷贝，
    到最后也不会创建新的String对象，所以速度很快，完成拼接处理后在程序中用strBuffer.toString()来得到最终的字符串。
     */
    public void testStringBuffer() {
        System.out.println(">>> testStringBuffer() <<<");

        long start = System.currentTimeMillis();

        StringBuffer strBuffer = new StringBuffer();

        for (int i = 0; i < max; i++) {
            strBuffer.append("a");
        }
        strBuffer.toString();

        long end = System.currentTimeMillis();

        long cost = end - start;

        System.out.println("   {strBuffer.append(\"a\")} cost=" + cost + " ms");
    }

    public void testStringBuilder() {
        System.out.println(">>> testStringBuilder() <<<");

        long start = System.currentTimeMillis();

        StringBuilder strBuilder = new StringBuilder();

        for (int i = 0; i < max; i++) {
            strBuilder.append("a");
        }
        strBuilder.toString();

        long end = System.currentTimeMillis();

        long cost = end - start;


        System.out
                .println("   {strBuilder.append(\"a\")} cost=" + cost + " ms");
    }
}
