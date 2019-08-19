package com.zoe.replace;

/**
 * @author zoe
 **/
public class Soldier {

    private AbstractGun abstractGun;

    public void setAbstractGun(AbstractGun abstractGun) {
        this.abstractGun = abstractGun;
    }

    public void killEnemy(){
        System.out.println("士兵开始作战........");
        abstractGun.shoot();
    }
}
