package com.gqy.spring.controllers;

public class AnimalFarm {

    public static void main(String[] args) {
        final String pig = "length: 10";
        final String dog = "length: " + pig.length();
        final String dog1 = "length: " + 10;
        final String dog2 = "length: 10";
        System.out.println(pig == dog);
        System.out.println(pig == dog1);
        System.out.println(pig == dog2);
        System.out.println("Animals are equal: " + pig == dog);
    }


//    public static void demo1() {
//        final String a = "abc";
//        final String b = a;
//        final String b2 = "abc";
//        String ab = "ab";
//        String c = "c";
//        String abc = ab+c;
//        System.out.println(a==abc);//false
//        System.out.println(a==b);//true
//        System.out.println(a==b2);//false
//    }
//
//    private void demo2() {
//        final String ab = "ab";
//        final String c = "c";
//        final String abc = "abc";
//        System.out.println(ab+c==abc);//true
//    }
//
//    private void demo3() {
//        final String ab ;
//        ab ="ab";//这跟demo2()方法差别就是后赋值
//        final String c = "c";
//        final String abc = "abc";
//        System.out.println(ab+c==abc);//false
//    }
}