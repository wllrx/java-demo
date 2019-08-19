package com.zoe.message;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author zoe
 **/
public class MsgTest {
    public static void main(String[] args) {

       /* MsgSender msgSender = new MsgSender();
        msgSender.send();*/

        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.YEAR,1);

        System.out.println(date.toString());
        System.out.println(calendar.getTime());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(simpleDateFormat.format(date));
        System.out.println(simpleDateFormat.format(calendar.getTime()));
    }
}
