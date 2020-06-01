package com.alex;

import java.util.Scanner;

public class Chapter4 {
    
    public static void main(String[] args) {
        int x = 100; 
        int y = 100; 

        String isSame = x == y ? "bulabula" : "piajipiaji";

        StringBuffer stringBuffer = new StringBuffer("test");
        stringBuffer.append(" this part ");
        System.out.println(stringBuffer);
        

        double x1 = 1.0;
        float x2 = 1.2f; 
        System.out.println(x1+x2+"现在已经自动提升为string了");


        System.out.println("现在请你输入一个数字");
        // Scanner input = new Scanner(System.in);
        // int i = input.nextInt(); // 数据台获取一个整数；

        // System.out.println("输入的值是"+i);

        // Scanner input2 = new Scanner(System.in);

        // double doubleNum = input2.nextDouble();

        Scanner newStrScanner = new Scanner(System.in);
        String newString = newStrScanner.next();
        System.out.println(newString);

        int xValue = 1; 
        switch(xValue){
            case 1: 
                System.out.println("here, x == 1");
                break;
            default: 
                System.out.println("anything else ...");
                break;
        }



        if(x == 1) System.out.println("2 is larger than 1");
        else System.out.println("2 is larger than 1");
        






    }
}