package com.cnos.springboot.basic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Locale;

public class LocalDatetimeTest {
    public static void main(String[] args) {
        Date date = new Date();
        Instant instant = date.toInstant();
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime localDateTime = instant.atZone(zoneId).toLocalDateTime();
        LocalDateTime localDateTime1 = LocalDateTime.ofInstant(date.toInstant(), zoneId);

        System.out.println("Date = " + date);
        System.out.println("Date To LocalDateTime = " + localDateTime);
        System.out.println("Date To LocalDateTime1 = " + localDateTime1);

        System.out.println();
        ZoneId zoneId1 = ZoneId.systemDefault();
        LocalDateTime localDateTime2 = LocalDateTime.now();
        ZonedDateTime zonedDateTime = localDateTime2.atZone(zoneId1);
        Date from = Date.from(zonedDateTime.toInstant());
        System.out.println("LocalDateTime To Date = " + from);
        System.out.println();


//        @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss" )
        System.out.println();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));
        System.out.println();

        // 获取不同格式化风格和中国环境的日期
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT, Locale.CHINA);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, Locale.CHINA);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.CHINA);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.LONG, Locale.CHINA);
        // 获取不同格式化风格和中国环境的时间
        DateFormat df5 = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.CHINA);
        DateFormat df6 = DateFormat.getTimeInstance(DateFormat.FULL, Locale.CHINA);
        DateFormat df7 = DateFormat.getTimeInstance(DateFormat.MEDIUM, Locale.CHINA);
        DateFormat df8 = DateFormat.getTimeInstance(DateFormat.LONG, Locale.CHINA);
        // 将不同格式化风格的日期格式化为日期字符串
        String date1 = df1.format(new Date());
        String date2 = df2.format(new Date());
        String date3 = df3.format(new Date());
        String date4 = df4.format(new Date());
        // 将不同格式化风格的时间格式化为时间字符串
        String time1 = df5.format(new Date());
        String time2 = df6.format(new Date());
        String time3 = df7.format(new Date());
        String time4 = df8.format(new Date());
        // 输出日期
        System.out.println("SHORT：" + date1 + " " + time1);
        System.out.println("FULL：" + date2 + " " + time2);
        System.out.println("MEDIUM：" + date3 + " " + time3);
        System.out.println("LONG：" + date4 + " " + time4);
    }
}
