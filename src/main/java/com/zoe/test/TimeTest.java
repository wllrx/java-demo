package com.zoe.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author zoe
 **/
public class TimeTest {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().plusDays(-2).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    }

}
