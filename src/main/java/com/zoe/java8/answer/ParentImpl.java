package com.zoe.java8.answer;

import cn.gjing.util.TimeUtil;

import java.util.Calendar;
import java.util.Date;

/**
 * @author zoe
 **/
public class ParentImpl implements Parent {

    private String body;

    @Override
    public void message(String body) {
        this.body = body;
    }

    @Override
    public String getLastMessage() {
        return body;
    }
}

class Test {
    public static void main(String[] args) {
        Parent parent = new ParentImpl();
        parent.welcome();
//        System.out.println(parent.getLastMessage());
//        System.out.println(("hello parent".equals(parent.getLastMessage())));
        Calendar calendar = Calendar.getInstance();
        Date date = new Date();
        System.out.println(date);
        calendar.setTime(date);
        String startTimeMonth = TimeUtil.dateToString(calendar.getTime(), "yyyy-MM-dd") + " 00:00:00";
        System.out.println(startTimeMonth);
    }



}