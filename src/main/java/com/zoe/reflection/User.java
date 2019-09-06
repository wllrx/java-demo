package com.zoe.reflection;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Zoe
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    private String name;

    private String city;

    @Reflect(name = "11111",max = 99)
    private Integer age;

    @Reflect(name = "2222",min = 11)
    private Integer num;

    @Reflect(name = "33333")
    private Double results;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", num=" + num +
                ", results=" + results +
                '}';
    }

    public static void main(String[] args) {

        //获取user所有的字段
        Field[] fields = User.class.getDeclaredFields();
        System.out.println("User类中所有字段: "+Arrays.toString(fields));
        //获取所有带@Reflect注解的字段
        List<Field> reflections = Arrays.stream(fields)
                .filter(e -> e.isAnnotationPresent(Reflect.class))
                .collect(Collectors.toList());

        System.out.println("User类中带有@Reflect注解字段: "+reflections);

        //获取注解字段及name值
        Map<String, Field> hasAnnotationFieldMap = Arrays.stream(User.class.getDeclaredFields())
                .filter(f -> f.isAnnotationPresent(Reflect.class))
                .collect(Collectors.toMap(field -> field.getAnnotation(Reflect.class).name(), field -> field)
                );

        System.out.println("User类中带有@Reflect注解的字段以及name值"+hasAnnotationFieldMap);

    }
}
