package com.zoe.java8;

/**
 * @author zoe
 **/
@FunctionalInterface
public interface Sample4<T> {
    /**
     * 测试方法
     *
     * @param var .
     */
    void notify(T var);
}

class Demo {

    private static void testDemo(Sample4<String> sample4) {
        sample4.notify("11111111");
    }

    public static void main(String[] args) {
        testDemo(System.out::println);
        testDemo(new Sample4<String>() {
            @Override
            public void notify(String var) {
                System.out.println(var);
            }
        });
        testDemo(e -> System.out.println(e));
    }
}