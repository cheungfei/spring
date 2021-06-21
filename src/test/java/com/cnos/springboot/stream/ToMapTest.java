package com.cnos.springboot.stream;

import com.cnos.springboot.bean.dto.UserDTO;
import com.google.common.collect.Lists;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToMapTest {
    public static void main(String[] args) {
//        List<UserDTO> userList = Lists.newArrayList(
//                new UserDTO().setId("A").setName("张三"),
//                new UserDTO().setId("B").setName("李四"),
//                new UserDTO().setId("C").setName("王五")
//        );
//        Map<String, String> map = new HashMap<>();
//        for (UserDTO user : userList) {
//            map.put(user.getId(), user.getName());
//        }
//        System.out.println(map);
//
//        userList.stream().collect(Collectors.toMap(UserDTO::getId, UserDTO::getName));
//        userList.stream().collect(Collectors.toMap(UserDTO::getId, t -> t));
//        userList.stream().collect(Collectors.toMap(UserDTO::getId, Function.identity()));

//        toMap(Function<? super T, ? extends K> keyMapper, Function<? super T, ? extends U> valueMapper);
//        toMap(Function<? super T, ? extends K> keyMapper, Function<? super T, ? extends U> valueMapper,
//                BinaryOperator<U> mergeFunction);
//        toMap(Function<? super T, ? extends K> keyMapper, Function<? super T, ? extends U> valueMapper,
//                BinaryOperator<U> mergeFunction, Supplier<M> mapSupplier);

        List<UserDTO> userSameIdList = Lists.newArrayList(
                new UserDTO().setId("A").setName("张三"),
                new UserDTO().setId("A").setName("李四"), // Key 相同
                new UserDTO().setId("C").setName("王五")
        );
//        System.out.println(userSameIdList.stream().collect(Collectors.toMap(UserDTO::getId, UserDTO::getName)));
//        Exception in thread "main" java.lang.IllegalStateException: Duplicate key 张三


        System.out.println(userSameIdList.stream().collect(Collectors.toMap(UserDTO::getId, UserDTO::getName, (n1, n2) -> n1 + n2)));
        userSameIdList.stream().collect(Collectors.toMap(UserDTO::getId, UserDTO::getName, (n1, n2) -> n1, TreeMap::new));
    }
}
