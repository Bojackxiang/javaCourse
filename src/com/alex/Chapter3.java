package com.alex;

public class Chapter3 {

    public static void main(String[] args) {
        int age = 199;

        int a, b, c, d = 11, e = 12;

        a = 12;
        b = 13; 
        c = 14; 

        // 四种int的基本类型
        /**
         * long所有的int类型的字面都是int，即使你在前面写的是long
         * int是正数的默认值
         * 
         */
        byte aa = 12; 
        short bb = 12; 
        int cc = 12; 
        
        long dd = 12L; // -> 所以要在后面添加L， 我要把一个属于long的值，存在dd中


        double xx = 1.0; 
        float floatNum = 12.0f;

        Integer xxx = Integer.MAX_VALUE;


        boolean isOpen = false; 

        char charValue1 = 'x';
        

        String stringValue1 = "这是一个string";

        System.out.println(stringValue1);
        
        short i = 10; 
        int j = i;
        System.out.println(i);

        int ii = 2; 
        double jj = ii;

        System.out.println(jj);

        int test = 12; 
        short storeTest = (short)test;

        System.out.println(storeTest);

        double test1 = 1.1;
        int test2 = (int) test1;

        String test3 = "1234";


        for(int idx = 0; i<10; i++){
            System.out.println(i);
        }
        







    }

}