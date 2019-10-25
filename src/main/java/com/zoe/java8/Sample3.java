package com.zoe.java8;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 流
 *
 * @author zoe
 **/
public class Sample3 {
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
        /**
         * stream方法返回一个流
         * filter过滤出热量大于300的食物
         * sorted进行升序排序,加上reversed是降序排序
         * map获取到食物名
         * limit限制数据数量
         * distinct 过滤重复
         * collect将结果存在另一个list中
         * 除collect之外所有方法都返回一个流,形成流水线,最后collect操作开始流水线并返回结果(返回的结果不是流,在这里是list)
         */
        List<String> list = menu.stream()
                .filter(d -> d.getCalories() > 300)
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .limit(3)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("=============list的值为: " + list);

        List<Integer> dishNameLengths = menu
                .stream()
                .map(Dish::getName)
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println("dishNameLengths的值为: " + dishNameLengths);

        //流中是否匹配一个元素  anyMatch方法返回一个boolean，是一个终端操作
        if (menu.stream().anyMatch(Dish::isVegetarian)) {
            System.out.println("/////////The menu is (somewhat) vegetarian friendly!!");
        }
        //是否匹配所有元素
        boolean isHealthy = menu.stream().allMatch(d -> d.getCalories() < 1000);
        System.out.println("isHealthy的值为: " + isHealthy);
        //没有任务元素匹配
        boolean isHealthy1 = menu.stream().noneMatch(d -> d.getCalories() >= 1000);
        System.out.println("isHealthy1的值为: " + isHealthy1);
        //随机返回一个符合条件的元素
        Optional<Dish> dish = menu
                .stream()
                .filter(Dish::isVegetarian)
                .findAny();
        System.out.println("dish的值为: " + dish);
        /**
         * 何时使用findFirst和findAny
         * 为什么会同时有findFirst和findAny呢？
         * 答案是并行。找到第一个元素 在并行上限制更多。
         * 如果你不关心返回的元素是哪个，请使用findAny，因为它在使用并行流 时限制较少。
         */
        //.ifPresent存在值的时候执行代码块d -> System.out.println(d.getName())
        menu.stream()
                .filter(Dish::isVegetarian)
                .findAny()
                .ifPresent(d -> System.out.println(d.getName()));

        //计算流中有多少个元素,使用map和reduce实现,首先把每个元素都映射为1,然后用reduce求和。这相当于按顺序数流中的元素个数
        int count = menu.stream().map(d -> 1).reduce(0, (a, b) -> a + b);
        System.out.println("count的值为: "+count);
        //有些流有一个出现顺序（encounter order）
        //来指定流中项目出现的逻辑顺序（比如由List或 排序好的数据列生成的流）。
        // 对于这种流，你可能想要找到第一个元素。为此有一个findFirst 方法，它的工作方式类似于findany
        List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5);
        //找出第一个能数字的平方能被3整除的数
        Optional<Integer> firstSquareDivisibleByThree = someNumbers
                .stream()
                .map(x -> x * x)
                .filter(x -> x % 3 == 0)
                .findFirst(); // 9
        System.out.println("firstSquareDivisibleByThree的值为: " + firstSquareDivisibleByThree);
        /**
         * //////////////////////////================/////////////////////////////
         */
        List<String> words = Arrays.asList("Java 8", "Lambdas", "In", "Action");
        List<String> uniqueCharacters = words
                .stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("/////////////////=======//////////////////" + uniqueCharacters);


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = numbers
                .stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("squares的值为: " + squares);


        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);
        //返回数对(1,3)(1,4)(2,3)....
        List<int[]> pairs = numbers1
                .stream()
                .flatMap(i -> numbers2.stream().map(j -> new int[]{i, j}))
                .collect(Collectors.toList());
        System.out.println("===================pairs的值为: " + pairs);
        //返回被3整除的数对(2,4)(3,3)
        List<int[]> pairs1 = numbers1
                .stream()
                .flatMap(i -> numbers2.stream().filter(j -> (i + j) % 3 == 0).map(j -> new int[]{i, j}))
                .collect(Collectors.toList());
        System.out.println("===================pairs1的值为: " + pairs1);

        /**
         * /////////////////////////////===================//////////////////////////////
         */
        /**
         * 用for each做外部迭代
         * for-each还隐藏了迭代中的一些复杂性
         * for-each结构是一个语法糖,它背后的东西是用Iterator对象表达出来
         */
        List<String> names = new ArrayList<>();
        for (Dish d : menu) {
            names.add(d.getName());
        }
        System.out.println("names的值为: " + names);

        /**
         * 使用Iterator做外部迭代
         */
        List<String> names1 = new ArrayList<>();
        Iterator<Dish> iterator = menu.iterator();
        while (iterator.hasNext()) {
            Dish d = iterator.next();
            names1.add(d.getName());
        }
        System.out.println("names1的值为: " + names1);

        /**
         * 使用流做内部迭代
         */
        List<String> names2 = menu.stream()
                .map(Dish::getName)
                .collect(Collectors.toList());
        System.out.println("names2的值为: " + names2);
    }
}

@Data
@Builder
@AllArgsConstructor
class Dish {
    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    @Override
    public String toString() {
        return name;
    }

    public enum Type {MEAT, FISH, OTHER}
}