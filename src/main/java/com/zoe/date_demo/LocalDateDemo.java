package com.zoe.date_demo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author zoe
 **/
public class LocalDateDemo {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        LocalDateTime time = LocalDateTime.now();
        System.out.println("localDateTime的值为: "+time);
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate的值为: "+localDate);
    }
}
