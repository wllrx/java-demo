package com.zoe.constructor;

/**
 * @author zoe
 **/
public class Construtor {

    public Construtor() {
    }

    public static BuilderTest builder(){
        System.out.println("11111111");
        return new BuilderTestImpl();
    }
}

class Test{
    public static void main(String[] args) {
        Construtor.builder().test22().text1().text3().test22().text3();
    }
}