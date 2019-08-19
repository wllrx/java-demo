package com.zoe.dynamic_proxy;

/**
 * @Author zoe
 **/
public class SellSmoke implements SellWine {
    @Override
    public void wine() {
        System.out.println("卖烟的店铺......");
    }
}
