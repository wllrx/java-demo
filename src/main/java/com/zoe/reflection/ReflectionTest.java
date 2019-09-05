package com.zoe.reflection;

import java.lang.reflect.Field;

/**
 * @author Zoe
 **/
public class ReflectionTest {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        User user = new User();
        Field field1 = user.getClass().getDeclaredField("name");
        Field field2 = user.getClass().getDeclaredField("city");
        Field field3 = user.getClass().getDeclaredField("age");
        Field field4 = user.getClass().getDeclaredField("num");
        Field field5 = user.getClass().getDeclaredField("results");

        field1.setAccessible(true);
        field2.setAccessible(true);
        field3.setAccessible(true);
        field4.setAccessible(true);
        field5.setAccessible(true);

        field1.set(user,"JFK收到");
        field2.set(user,"厦门");
        field3.set(user,44);
        field4.set(user,55);
        field5.set(user,90.4);
       /* BeanUtil.setFieldValue(user, field1, "qqqq");
        BeanUtil.setFieldValue(user, field2, "qqqq");
        BeanUtil.setFieldValue(user, field3, 1);
        BeanUtil.setFieldValue(user, field4, 2);
        BeanUtil.setFieldValue(user, field5, 3.2);*/
        System.out.println(user.toString());
        System.out.println("name    : "+field1.getName());
        System.out.println("city    : "+field2.get(user));
        System.out.println("age     : "+field3.get(user));
        System.out.println("num     : "+field4.get(user));
        System.out.println("results : "+field5.get(user));
    }
}
