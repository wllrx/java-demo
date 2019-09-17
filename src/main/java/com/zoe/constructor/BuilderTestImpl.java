package com.zoe.constructor;

/**
 * @author zoe
 **/
public class BuilderTestImpl implements BuilderTest {
    @Override
    public BuilderTest text1() {
        return this;
    }

    @Override
    public BuilderTest test22() {
        return this;
    }

    @Override
    public BuilderTest text3() {
        return this;
    }
}
