package com.cnos.springboot.controller;

import com.cnos.springboot.bean.vo.DateVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/date")
public class DateController {

    @RequestMapping("test")
    public DateVo getDate(DateVo vo) {
        System.out.println("date1: " + vo.getDate());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(vo.getDate());
        System.out.println("date2: " + date);

        DateVo vo2 = new DateVo();
        vo2.setDate(new Date());
        return vo2;
    }
}
