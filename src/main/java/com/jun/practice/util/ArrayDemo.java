package com.jun.practice.util;

import java.util.Arrays;

public class ArrayDemo {
    public int [] fill(int number){
        int [] arr = new int[5];
        Arrays.fill(arr, 7);
        return arr;
    }
    public int[] copy(int[] param, int initVal, int start, int length){
        int [] arr = new int[5];
        System.arraycopy(param, initVal, arr, start, length);
        return arr;
    }
    public int[] createIntegerArray(int start, int end){
        int[] integerArray = new int[end - start];
        int j = 0;
        for(int i = start; i < end; i++){
            integerArray[j] = i;
            j++;
        }
        return integerArray;
    }
}