package com.zoe.java8.answer;

import java.util.stream.Stream;

import static java.util.stream.Stream.concat;

/**
 * @author wm
 */
public interface Performance {

    /**
     * ..
     * @return .
     */
    public String getName();

    /**
     * ...
     * @return .
     */
    public Stream<Artist> getMusicians();

    // TODO: test

    /**
     * ...
     * @return .
     */
    public default Stream<Artist> getAllMusicians() {
        return getMusicians().flatMap(artist -> {
            return concat(Stream.of(artist), artist.getMembers());
        });
    }

}
