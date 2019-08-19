package com.zoe.dynamic_proxy;

/**
 * @Author zoe
 **/
public class WuWine implements SellWine{

    @Override
    public void wine() {
        System.out.println("卖五粮液的店铺.....");
    }
}
