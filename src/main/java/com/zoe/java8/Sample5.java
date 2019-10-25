package com.zoe.java8;

import java.util.function.Function;

/**
 * @author zoe
 **/
class Sample5 {
    private static String addHeader(String text) {
        return "From Raoul, Mario and Alan: " + text;
    }

    private static String addFooter(String text) {
        return text + " Kind regards";
    }

    private static String checkSpelling(String text) {
        return text.replaceAll("labda", "lambda");
    }

    private Function<String, String> addHeader = Sample5::addHeader;
    Function<String, String> transformationPipeline = addHeader.andThen(Sample5::checkSpelling).andThen(Sample5::addFooter);

    Function<String, String> addHeader1 = Sample5::addHeader;
    Function<String, String> transformationPipeline1 = addHeader.andThen(Sample5::addFooter);

    public static void main(String[] args) {
        Function<String, String> addHeader = Sample5::addHeader;
        System.out.println(addHeader);
    }
}
