package com.zoe.agencymall;

/**
 * @Author zoe
 **/
public class ProducerProxy implements Producer {
    private Producer producer;

    public ProducerProxy(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void sell() {
        System.out.println("小卖部卖货前.....");
        producer.sell();
        System.out.println("小卖部卖货后.....");
    }
}

class Test{
    public static void main(String[] args) {
        Producer producer = new Canteen();
        ProducerProxy producerProxy = new ProducerProxy(producer);
        producerProxy.sell();
    }
}