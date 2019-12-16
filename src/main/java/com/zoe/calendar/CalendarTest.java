package com.zoe.calendar;

import cn.gjing.util.TimeUtil;

import java.util.Calendar;
import java.util.Date;

/**
 * @author zoe
 **/
public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.DAY_OF_MONTH,1);
        calendar.add(Calendar.MONTH,0);
        System.out.println(TimeUtil.dateToString(calendar.getTime()));
        calendar.set(Calendar.DAY_OF_MONTH,0);
        calendar.add(Calendar.MONTH,1);
        System.out.println(TimeUtil.dateToString(calendar.getTime()));
        calendar.set(Calendar.DAY_OF_MONTH,1);
        calendar.add(Calendar.MONTH,1);
        System.out.println(TimeUtil.dateToString(calendar.getTime()));
    }
}
