package com.zoe.replace;

/**
 * @author zoe
 **/
public class Snipper {

    private  AbstractGun abstractGun;

    public void setAbstractGun(AbstractGun abstractGun) {
        this.abstractGun = abstractGun;
    }

    public void killEnemy(AUG aug){
        aug.zoomOut();
        aug.shoot();
    }
}
