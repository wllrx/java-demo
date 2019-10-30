package com.zoe.java8;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 构建流
 *
 * @author zoe
 **/
public class Sample8 {

    public static void main(String[] args) {

        // 流不仅可以从集合创建，也可从值、数组、文件以及iterate与generate等特定方法 创建。
        // 无限流是没有固定大小的流
        //值创建流
        Stream<String> stream = Stream.of("Java 8 ", "Lambdas ", "In ", "Action");
        stream.map(String::toUpperCase).forEach(System.out::println);
        //空流
        Stream<String> empty = Stream.empty();
        System.out.println(empty);

        //数组创建流
        int[] numbers = {2, 3, 5, 7, 11, 13};
        int sum = Arrays.stream(numbers).sum();
        System.out.println(sum);

        //文件创建流
        long uniqueWords = 0;
        try (Stream<String> lines = Files.lines(Paths.get("data.txt"), Charset.defaultCharset())) {
            uniqueWords = lines.flatMap(line -> Arrays.stream(line.split(" "))).distinct().count();
        } catch (IOException e) {
        }

        //由函数生成流,创建无限流
        //Stream API提供了两个静态方法来从函数生成流：Stream.iterate和Stream.generate。这两个操作可以创建所谓的无限流：不像从固定集合创建的流那样有固定大小的流。
        //由iterate 和generate产生的流会用给定的函数按需创建值，因此可以无穷无尽地计算下去！一般来说，应该使用limit(n) 来对这种流加以限制，以避免打印无穷多个值
        //按需计算,无限流,不限制可以无穷的计算下去
        Stream.iterate(0, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);

        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(20)
                .forEach(t -> System.out.println("(" + t[0] + "," + t[1] + ")"));
        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(20)
                .map(t -> t[0])
                .forEach((System.out::println));

        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);

        IntStream ones = IntStream.generate(() -> 1);
    }
}
