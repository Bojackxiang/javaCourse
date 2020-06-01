package com.alex;

import java.util.Arrays;
import java.util.Collections;

public class Chapter7 {

    public static void main(String[] args) {

        int[] intArray = new int[5];

        intArray[4] = 1;

        int[] intArray2 = intArray;

        intArray[1] = 1;
        intArray[2] = 2;

        System.out.println("" + intArray2[1] + intArray2[2]);
        System.out.println("" + intArray[1] + intArray[2]);

        int testA = 1;
        int testB = testA;

        testA = 2;
        System.out.println(testA + " - " + testB + "");

        System.out.println(intArray.length);

        String[] b = new String[2];

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]); // 引用数据类型
            
        }

        int[] d = new int[]{12, 34, 56, 78, 90};

        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }

        int[] e = {1,2,3,4,5,6,7,};
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }

        int[] f = {1,2,3,4};

        String[] g = {"hello", "world"};

        for (int i = 0; i < g.length; i++) {
            System.out.println(g[i]);
        }

        int[] scores = new int[]{1,2,3,4,5,6};
        double scoreMean = mean(scores);
        System.out.println(scoreMean);

        int[] h = new int[]{5,3,4,5,7,9};

        int[] i = new int[]{1,2,3,4,5,6,7};

        for (int j = 0; j <= i.length/2; j++) {
            int temp; 
            temp = i[j];
            i[j] = i[i.length-j-1];
            i[i.length-j-1] = temp;   
        }

        System.out.println(Arrays.toString(i));
    }

    public void testing(String inputStr) {
        System.out.println(inputStr);
    }

    public static double mean(int[] scores){
        double sum = 0.0; 
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        return sum / scores.length;
    }

}