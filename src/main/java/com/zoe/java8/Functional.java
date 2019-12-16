package com.zoe.java8;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author zoe
 **/
public class Functional {


    public final static ThreadLocal<DateFormatter> formatter = ThreadLocal.withInitial(() -> new DateFormatter(new SimpleDateFormat("dd-MMM-yyyy")));

    public static void main(String[] args) {
        List<String> aaa = Stream.of("aaa", "0ok", "9kk")
                .filter(e -> Character.isDigit(e.charAt(0)))
                .collect(Collectors.toList());
        System.out.println(aaa);

    }


}
