package com.zoe.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author zoe
 **/
public class ReflectionUser {
    public static void main(String[] args) throws Exception {
        //获取user中所有的字段
        Field[] fields = User.class.getDeclaredFields();
        System.out.println("user类中所有字段为: "+Arrays.toString(fields));
        //获取user类上Inject的注解中的值
        Inject userClassAnnotation = User.class.getAnnotation(Inject.class);
        System.out.println("name值为: "+userClassAnnotation.name()+"number值为: "+userClassAnnotation.number());
        //获取user类上的注释,RetentionPolicy.RUNTIME是运行时只能获取到一个注解
        Annotation[] annotations = User.class.getAnnotations();
        System.out.println("user类上的所有注解: "+ Arrays.toString(annotations));
        //获取user类上带有tag注解的字段
        List<Field> tags = Arrays
                .stream(fields)
                .filter(e -> e.isAnnotationPresent(Tag.class))
                .collect(Collectors.toList());
        System.out.println("user类上所有带有tags的字段: "+tags);
        //设置和修改指定字段的值
        User user = new User();
        Field field = user.getClass().getDeclaredField("account");
        field.setAccessible(true);
        field.set(user,"admin");
        System.out.println("设置后的用户信息为: "+user.toString());
        field.set(user,"super_admin");
        System.out.println("修改后的用户信息为: "+user.toString());
        //所有字段名
        Arrays.stream(fields).map(Field::getName).forEach(System.out::println);
        //所有字段的数据类型
        Arrays.stream(fields).map(Field::getType).forEach(System.out::println);
        //获取注解字段和limit的值
        Map<Integer, Field> hasAnnotationFieldMap = Arrays.stream(fields)
                .filter(f -> f.isAnnotationPresent(Tag.class))
                .collect(Collectors.toMap(e -> e.getAnnotation(Tag.class).limit(), a -> a)
                );
        System.out.println("user类中带tar注解的字段以及limit的值: "+hasAnnotationFieldMap);
        //获取MethodsTest类中所有的方法
        Method[] methods = MethodsTest.class.getMethods();
        //获取MethodsTest类中所有的方法名
        Arrays.stream(methods).map(Method::getName).forEach(System.out::println);
        Method method = MethodsTest.class.getMethod("send");
        Method method1 = MethodsTest.class.getMethod("test");
        method.invoke(MethodsTest.class.getDeclaredConstructor().newInstance());
        method1.invoke(MethodsTest.class.getDeclaredConstructor().newInstance());
    }
}
