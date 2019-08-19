package com.zoe.replace;

/**
 * @author zoe
 **/
public class Client {
    public static void main(String[] args) {
       /* Soldier soldier = new Soldier();
        soldier.setAbstractGun(new Rifle());
        soldier.killEnemy();*/
        Snipper snipper = new Snipper();
        snipper.setAbstractGun(new AUG());
        snipper.killEnemy(new AUG());
    }
}
