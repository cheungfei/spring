package com.cnos.springboot.controller;

import com.cnos.springboot.entity.User;
import com.cnos.springboot.service.UserService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-04-18 17:51
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user/list")
    public String list(Model model) {
        List<User> users = userService.getAll();
        model.addAttribute(users);

        return "user/index";
    }

    @RequestMapping("/user/{id}")
    public String view(@PathVariable("id") Integer id, Model model) {
        User user = userService.findById(id);
        model.addAttribute(user);

        return "user/view";
    }
}
