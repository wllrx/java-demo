package com.zoe.java8;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

/**
 * @author zoe
 **/
public class Sample9 {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH));
        long howManyDishes = menu.stream().collect(Collectors.counting());
        System.out.println("统计菜单多少菜howManyDishes: " + howManyDishes);
        long howManyDishes1 = menu.stream().count();
        System.out.println("统计菜单多少菜howManyDishes1: " + howManyDishes1);

        Comparator<Dish> dishCaloriesComparator = Comparator.comparingInt(Dish::getCalories);
        System.out.println(dishCaloriesComparator);
        Optional<Dish> mostCalorieDish = menu.stream().collect(Collectors.maxBy(dishCaloriesComparator));
        System.out.println(mostCalorieDish);

        int totalCalories = menu.stream().collect(Collectors.summingInt(Dish::getCalories));
        int totalCalories1 = menu.stream().mapToInt(Dish::getCalories).sum();
        System.out.println("totalCalories: " + totalCalories);


        double avgCalories = menu.stream().collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println("菜品热量的平均值是/: " + avgCalories);

        IntSummaryStatistics menuStatistics = menu.stream().collect(Collectors.summarizingInt(Dish::getCalories));
        System.out.println("数量,总数,最小值,最大值,平均值,最大值" + menuStatistics);

        double goods = 256;
        double actual = goods * 1.12 * 0.8;
        double discount = goods * 0.2 + goods * 0.12;
        double test = goods / 1.12 - goods / 1.12 * 0.2;
        System.out.println("goods /1.12 : " + goods / 1.12);
        System.out.println("goods /1.12*0.2" + goods / 1.12 * 0.2);
        System.out.println("test的值为: " + test);
        System.out.println("应付: " + actual);
        System.out.println("折扣: " + discount);

        double a = 100;
        double b = a / 0.8;
        System.out.println("b的值:" + b);

        //连接字符串,joining内部使用StringBuilder来把生成的字符串逐个追加起来
        String shortMenu = menu.stream().map(Dish::getName).collect(Collectors.joining(", "));
        System.out.println("菜肴名称: " + shortMenu);

        int totalCalories2 = menu.stream().map(Dish::getCalories).reduce(0, (i, j) -> i + j);
        System.out.println(totalCalories2);
        int totalCalories3 = menu.stream().collect(Collectors.reducing(0, Dish::getCalories, Integer::sum));
        System.out.println(totalCalories3);

        //分组
        Map<Dish.Type, List<Dish>> dishesByType = menu
                .stream()
                .collect(groupingBy(Dish::getType));
        System.out.println("根据类型分组: " + dishesByType);


        Map<CaloricLevel, List<Dish>> dishesByCaloricLevel = menu
                .stream()
                .collect(groupingBy(dish -> {
                    if (dish.getCalories() <= 400) {
                        return CaloricLevel.DIET;
                    } else if (dish.getCalories() <= 700) {
                        return CaloricLevel.NORMAL;
                    } else {
                        return CaloricLevel.FAT;
                    }
                }));
        System.out.println("根据热量分组: " + dishesByCaloricLevel);

        //多级分组
        Map<Dish.Type, Map<CaloricLevel, List<Dish>>> dishesByTypeCaloricLevel = menu
                .stream()
                .collect(groupingBy(Dish::getType, groupingBy(dish -> {
            if (dish.getCalories() <= 400) {
                return CaloricLevel.DIET;
            } else if (dish.getCalories() <= 700) {
                return CaloricLevel.NORMAL;
            } else {
                return CaloricLevel.FAT;
            }
        })));
        System.out.println("多级分组,根据类型和热量分组: "+dishesByTypeCaloricLevel);
    }
}

/**
 * 热量分类
 */
enum CaloricLevel {DIET, NORMAL, FAT}