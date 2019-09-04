package com.zoe.jeneric;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Zoe
 **/
@Slf4j
public class PairTest {

    public static void main(String[] args) {

        String[] str = {"444444","11111","22222","66666"};
        Pair<String> pair = ArrayAlg.minMax(str);
        System.out.println("min = " +pair.getFirst());
        System.out.println("max = " +pair.getSecond());
    }
}

class ArrayAlg{

    public static Pair<String> minMax(String[] strings){
        if (strings ==null || strings.length==0){
            return null;
        }
        String min = strings[0];
        String max = strings[0];

        for (int i = 1;i<strings.length;i++){
            if (min.compareTo(strings[i])>0) min = strings[i];
            if (max.compareTo(strings[i])<0) max = strings[i];

        }
        return new Pair<>(min,max);
    }

}