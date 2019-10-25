package com.zoe.java8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @author zoe
 **/
public class LocalDateTimeTest {
    public static void main(String[] args) {

        /**
         * FormatStyle :
         * FULL: 全文风格  格式是“1952年4月12日星期二”或“太平洋标准时间下午3:30:42”
         * LONG: 长文本风格   格式是"1952年1月12日”
         * MEDIUM: 中等文本风格   格式是 “1952年1月12日”
         * SHORT: 短文本样式,通常为数字格式     格式是“12.13.52”或“3:30pm”
         */
        String time = LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("第一种: "+time);
        String time1 = LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("第二种: "+time1);
        String time2 = LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("第三种: "+time2);
        String time3 = LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("第四种: "+time3);
        //FormatStyle使用full 报DateTimeException:Unable to extract value: class java.time.LocalDateTime 无法提取值
        String time4 = LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println("第五种: "+time4);
        String time5 = LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        System.out.println("第六种: "+time5);
        String time6 = LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG));
        System.out.println("第七种: "+time6);
        //FormatStyle使用full 报DateTimeException:Unable to extract value: class java.time.LocalDateTime 无法提取值
        String time7 = LocalDateTime.now().format(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG));
        System.out.println("第八种: "+time7);
        String time8 = LocalDateTime.now().format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM));
        System.out.println("第九种: "+time8);
        String time9 = LocalDateTime.now().format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT));
        System.out.println("第十种: "+time9);

    }
}
