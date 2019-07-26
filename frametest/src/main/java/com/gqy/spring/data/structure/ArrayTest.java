package com.gqy.spring.data.structure;

/**
 * <b>功能描述:数组结构</b>
 *
 * @author : guqy
 * <b>创建日期 :</b>
 * @date 2019/7/19 13:14
 * <b>修改历史:</b>(修改人,修改时间,修改原因/内容)
 */
public class ArrayTest {
    public static void main(String[] args) {
//        int [] arr = new int[10];
//        for (int i : arr) {
//            arr[i] = i;
//            System.out.println(arr[i]);
//        }
//
//        int[] scores = new int [] {100,99,88};
//        for (int score : scores) {
//            System.out.println(score);
//        }
        MyArray myArray = new MyArray(20);
        for (int i = 0; i < 10; i++) {
            myArray.addLast(i);
        }
        System.out.println(myArray);
    }
}
