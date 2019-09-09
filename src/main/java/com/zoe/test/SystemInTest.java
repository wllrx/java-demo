package com.zoe.test;

import java.util.Scanner;

/**
 * @author Zoe
 **/
public class SystemInTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("who are you");
        String name = scanner.nextLine();
        System.out.println("name : "+name);

    }
}
