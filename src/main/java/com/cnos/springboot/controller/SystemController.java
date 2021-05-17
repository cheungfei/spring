package com.cnos.springboot.controller;

import com.cnos.springboot.component.WebSocketServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-04-19 7:20
 */
@Controller("web_socket_system")
@RequestMapping("/api/socket")
public class SystemController {

    //页面请求
    @GetMapping("/index/{userId}")
    public ModelAndView socket(@PathVariable String userId) {
        ModelAndView mav = new ModelAndView("/socket1");
        mav.addObject("userId", userId);
        return mav;
    }

    //推送数据接口
    @ResponseBody
    @RequestMapping("/socket/push/{cid}")
    public Map pushToWeb(@PathVariable String cid, String message) {
        Map<String,Object> result = new HashMap<>();
        try {
            WebSocketServer.sendInfo(message, cid);
            result.put("code", cid);
            result.put("msg", message);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
