package com.zoe.java8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zoe
 **/
public class Sample1 {
    public static void main(String[] args) {
        List<TeddyBear> bearList = Arrays.asList(
                new TeddyBear("黄色",10),
                new TeddyBear("蓝色",20),
                new TeddyBear("蓝色",30),
                new TeddyBear("红色",50));
        List<TeddyBear> list = bearList.stream().filter(teddyBear -> "蓝色".equals(teddyBear.getColor())).
                collect(Collectors.toList());
        System.out.println("所有蓝色的玩具熊: "+list);
        List<TeddyBear> bearStream = bearList.stream().filter(teddyBear -> teddyBear.getSize() >10)
                .collect(Collectors.toList());
        System.out.println("所有大于10的玩具熊: "+bearStream);
        List<TeddyBear> teddyBearStream = bearList.stream().filter(t -> t.getSize()<100 && "红色".equals(t.getColor()))
                .collect(Collectors.toList());
        System.out.println("颜色是红色大小于100的玩具熊: "+teddyBearStream);
        List<List<TeddyBear>> lists = new ArrayList<>();
        lists.add(list);
        lists.add(bearStream);
        lists.add(teddyBearStream);
        System.out.println("三个条件查询结果: "+lists);

    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class TeddyBear{

        private String color;
        private int size;

        @Override
        public String toString() {
            return "TeddyBear{" +
                    "color='" + color + '\'' +
                    ", size=" + size +
                    '}';
        }
    }
}

