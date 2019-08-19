package com.zoe.dynamic_proxy;

/**
 * @Author zoe
 **/
public class MaoTaiWine implements SellWine {

    @Override
    public void wine() {
        System.out.println("卖茅台酒的店铺.....");
    }
}
