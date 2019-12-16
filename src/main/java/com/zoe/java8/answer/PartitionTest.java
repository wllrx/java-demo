package com.zoe.java8.answer;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author zoe
 **/
public class PartitionTest {
    public static Map<Boolean, List<Artist>> band(Stream<Artist> artistStream){
        return artistStream.collect(Collectors.partitioningBy(Artist::isSolo));
    }
}
