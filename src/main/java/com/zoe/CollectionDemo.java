package com.zoe;

import java.util.*;

/**
 * @Author zoe
 **/
public class CollectionDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        Collection<String> collection = new LinkedList<>();
        collection.add("C");
        collection.add("D");
        list.addAll(collection);
        list.add(2,"F");//在下标为2的元素后面插入一个元素
        List<String> linkList = new LinkedList<>();
        linkList.add("G");
        linkList.add("H");
        list.addAll(3,linkList);//在下标为3的元素后面插入一个集合
        Iterator iterator = list.iterator();
        //删除两个元素 先调用next()方法
        iterator.next();
        iterator.next();
        iterator.remove();
        iterator.forEachRemaining(e -> System.out.println(e.toString()));
    }
}
class ListIteratorDemo{
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        ListIterator<String> listIterator = list.listIterator();
        listIterator.next();
        listIterator.add("JUNIT");
        listIterator.add("kkk");
        listIterator.forEachRemaining(e ->System.out.println(e.toString()));
    }
}