package com.zoe.base;

import java.util.*;

/**
 * @author zoe
 **/
public class VectorTest {
    public static void main(String[] args) {
        List<String> list = Collections.singletonList("a,b,c,d");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Vector<String> vector = new Vector<>();
        vector.add("1");
        vector.add("2");
        vector.add("3");
        vector.forEach(System.out::println);
    }
}
