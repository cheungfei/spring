package com.cnos.springboot.stream;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceOperationTest {
    private static final List<Integer> listInteger = Arrays.asList(1,2,-1,-2,-3,10,11,50,-50);

    /**
     * 1.规约
     *  reduce(T identity, BinaryOperator b)    可以将流中元素反复结合起来，得到一个值。返回T
     *  reduce(BinaryOperator b)            可以将流中元素反复结合起来，得到一个值。返回Optional<T>
     */

    // 1.reduce(T identity, BinaryOperator b)：identity，累计的做b操作
    public static void test1() {

        /*
         * T reduce(T identity,BinaryOperator<T> accumulator)：
         * 使用提供的身份值和associative累积功能对此流的元素执行reduction ，
         * 并返回减小的值。
         * 这是一个terminal operation 。
         * API Note:
         * 总和，最小，最大，平均和字符串连接都是减少的特殊情况。 一个数字流可以表示为：
         *  Integer sum = integers.reduce(0, (a, b) -> a+b);  要么：
         *      Integer sum = integers.reduce(0, Integer::sum);  尽管与简单地将循环
         *      中的总体变量相比，这可能看起来更为迂回的方式进行，但减少操作更平稳地并行化，
         *      而不需要额外的同步，并大大降低了数据竞争的风险。
         * 参数
         *  identity - 累积函数的身份值
         *  accumulator -一个 associative ， non-interfering ， stateless功能组合两个值
         */

        // 计算集合中所有元素的总和（0与第一个元素相加得结果s1，s1再与第二个元素相加得结果s2，……）
        // Integer sum = listInteger.stream().reduce(0,(a,b) -> a+b);
        Integer sum = listInteger.stream().reduce(0, Integer::sum);
        System.out.println("总和1是：" + sum);

        /*
         * 结果：
         *  总和是：18
         */
    }


    // reduce(BinaryOperator b)：可以将流中元素反复结合起来，得到一个值。返回Optional<T>
    public static void test2() {
        /*
         * Optional<T> reduce(BinaryOperator<T> accumulator)：
         * 使用associative累积函数对此流的元素执行reduction ，并返回描述减小值（如果有的话）
         * 这是一个terminal operation 。
         * 参数
         *  accumulator -一个 associative ， non-interfering ， stateless功能组合两个值
         * 结果
         *  一个Optional描述了减少的结果
         */

        // 计算集合中所有元素的总和（第一个元素与第二个元素相加得结果s1，……）
        Optional<Integer> reduce = listInteger.stream().reduce(Integer::sum);
        reduce.ifPresent(integer -> System.out.println("总和2是：" + integer));

        /*
         * 结果：
         *  总和是：18
         */
    }




    public static void main(String[] args) {
//        test1();
//        test2();

        List<Integer> list = Lists.newArrayList(1,2,3,4,5);
        list.stream().reduce(0, (result,item)->{
            System.out.println("result="+result+", item="+item);
            return result+item;
        });

//        result=0, item=1
//        result=1, item=2
//        result=3, item=3
//        result=6, item=4
//        result=10, item=5
    }

}

