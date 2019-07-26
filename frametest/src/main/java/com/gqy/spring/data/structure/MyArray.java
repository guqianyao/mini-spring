package com.gqy.spring.data.structure;

import java.util.Arrays;

/**
 *
 */
public class MyArray {
    private int[] data;
    private int size;

    public MyArray(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    public MyArray() {
        this(10);
    }

    public int getSize(){
        return size;
    }

    public int getCapacity(){
        return data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    // 添加元素
    public void addLast(int e){
//        if(size == data.length)
//            throw new IllegalArgumentException("");
//        data[size++] = e;
//        data[size] = e;
//        size ++;
        add(size,e);
    }

    public void addFirst(int e){
        add(0,e);
    }

    public void add(int index,int e){
        if(size == data.length)
            throw new IllegalArgumentException("Add failed. Array is full.");
        if(index <0 || index > size)
            throw new IllegalArgumentException("Add failed . Require index >= 0 and ");
        for (int i = size -1; i >=index ; i--) {
            data[i+1] = data[i];
        }
        data[index] = e;
        size ++;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d ,capacity = %d\n", size, data.length));
        res.append('[');
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1) {
                res.append(", ");
            }
        }
        res.append(']');
        return res.toString();
    }
}
