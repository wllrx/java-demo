package com.zoe.replace;

/**
 * @author zoe
 **/
public class AUG extends Rifle {

    public void zoomOut(){
        System.out.println("使用望远镜观察...........");
    }
    @Override
    public void shoot(){
        System.out.println("使用AUG射击..........");
    }
}
