package com.zoe.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author Zoe
 **/
public class ReflectTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Field[] fields = User.class.getDeclaredFields();

        Arrays.stream(fields).map(Field::getName).forEach(System.out::println);

        Arrays.stream(fields).map(Field::getType).forEach(System.out::println);

        Method[] methods = UserTest.class.getMethods();

        Arrays.stream(methods).map(Method::getName).filter(e-> e.equals("methods")).forEach(System.out::println);

        Method send = UserTest.class.getMethod("send");

        send.invoke(UserTest.class.newInstance());

    }
}
