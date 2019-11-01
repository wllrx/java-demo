package com.zoe.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author zoe
 **/
public class LambdaTest {

    public LambdaTest() {
    }

    public static void main(String[] args) {
        List<String> str = Arrays.asList("a","b","A","B");
        /**
         * //lambda可简写为方法引用
         * //str.sort((s1,s2)->s1.compareToIgnoreCase(s2));
         */
        //方法引用方式
        str.sort(String::compareToIgnoreCase);
        System.out.println("str的值为: "+str);

    }

    private String name;
    private Integer age;
    /**
     * 构造函数可以利用它的名称和关键字new来创建它的一个引用： ClassName::new。它的功能与指向静态方法的引用类似  此方法为无参构造
     */
    Supplier<LambdaTest> testSupplier = () -> new LambdaTest();
    /**
     * 简化 构造函数引用  无参
     */
    Supplier<LambdaTest> testSupplier1 = LambdaTest::new;

    private Function<String,LambdaTest> testFunction = (s) -> new LambdaTest();
    LambdaTest lambdaTest = testFunction.apply("xff");
    private BiFunction<String,Integer,LambdaTest> biFunction = (name, age) -> new LambdaTest();
    LambdaTest a = biFunction.apply("kk",9);


}

class Color{
    private int num;
    private int age;
    private int size;

    public Color(Integer num, Integer age, Integer size) {
    }
    public interface TriFunction<T, U, V, R>{
        /**
         * ss
         * @param t .
         * @param u .
         * @param v .
         * @return .
         */
        R apply(T t, U u, V v);
    }

    /**
     *
     */
    TriFunction<Integer, Integer, Integer, Color> colorFactory = Color::new;
}