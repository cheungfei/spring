package com.spring.study.advanced;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.*;

public class GuavaStringTest {
    /**
     * 连接器
     */
    private static final Joiner joiner = Joiner.on(",").skipNulls();
    /**
     * 分割器
     */
    private static final Splitter splitter = Splitter.on(",").trimResults().omitEmptyStrings();


    public static void main(String[] args) {
//        String join = joiner.join(Lists.newArrayList("a", null, "b"));
//        System.out.println(join);
//
//        String string = " 111, ,222,, 33 ";
//        for (String s:splitter.split(string)) {
//            System.out.println("<" + s + ">");
//        }


//        System.out.println(Ints.join(",",1, 2, 3));
//        //数组合并
//        int[] newArray = Ints.concat(new int[]{1, 2}, new int[]{3, 4});
//        System.out.println(newArray.length);
//        //选出最大最小
//        System.out.println(Ints.max(newArray) + "," + Ints.min(newArray));
//        System.out.println(Ints.contains(newArray, 3));
//        //集合转成数组
//        List<Integer> list = Ints.asList(1, 2 , 3, 4);
//        int[] intArray = Ints.toArray(list);
//        System.out.println(intArray);

//        //计算元素个数
//        Multiset<Integer> multiset = HashMultiset.create();
//        multiset.add(1);
//        multiset.add(2);
//        multiset.add(3);
//        multiset.add(3);
//        System.out.println(multiset.count(3));//2

//        Multimap<String, String> multiMap = ArrayListMultimap.create();
//        multiMap.put("a","1");
//        multiMap.put("a","2");
//        System.out.println(multiMap.get("a"));

        BiMap<String, Integer> biMap = HashBiMap.create();
        biMap.put("a",1);
        biMap.put("b",2);
        System.out.println(biMap.inverse().get(1));//a
    }
}
