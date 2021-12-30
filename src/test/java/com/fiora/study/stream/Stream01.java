package com.fiora.study.stream;

import com.fiora.study.entity.User;
import org.assertj.core.util.Lists;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-05-30 14:31
 */
public class Stream01 {
    public static void main(String[] args) {
        List<User> userList = Lists.newArrayList();
        Map<Integer, String> map1 = userList.stream().collect(Collectors.toMap(
                User::getId, User::getName));
        Map<Integer, String> map2 = userList.stream().collect(Collectors.toMap(
                User::getId, user -> user.getName() + "<>"));

    }
}
