package com.zoe.java8.answer;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author zoe
 **/
public class Answer {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        int i = addUp(integerStream);
        System.out.println(i);
    }

    private static int addUp(Stream<Integer> numbers) {
        return numbers.reduce(0, Integer::sum);
    }

    private static List<String> name(List<Artist> artists) {
        return artists.stream()
                .flatMap(artist -> Stream.of(artist.getName(), artist.getNationality()))
                .collect(Collectors.toList());
    }

    private static List<Album> getAlbumsWithAtMostThreeTracks(List<Album> albums) {
        return albums.stream()
                .filter(album -> album.getTrackList().size() <= 3)
                .collect(toList());
    }

}
