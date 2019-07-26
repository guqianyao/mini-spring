package com.gqy.spring.controllers;

public class LongDivision {
    private static final byte num1= 24;
    private static final byte num2= 60;
    private static final byte num3= 60;
    private static final short num4= 1000;
    private static final int num5= 1000;
    private static final long MILLIS_PER_DAY
            = 24 * 60 * 60 * 1000;
    
    private static final long MICROS_PER_DAY
            = num1 * num2 * num3 * num4  * num5;

    public static void main(String[] args) {
        System.out.println(Long.toBinaryString(MICROS_PER_DAY));
        System.out.println(Long.toBinaryString(24 * 60 * 60 * 1000 * 1000L));
        System.out.println(MICROS_PER_DAY);
        System.out.println(MILLIS_PER_DAY);
        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
    }
}