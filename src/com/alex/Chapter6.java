package com.alex;

public class Chapter6 {
    public static void main(String[] args) {
        test1();
        test2("xiang");
        test3(10);
        test4();
        int result = test5(5);
        System.out.println(""+result);
        
    }

    public static void test1() {
        System.out.println("print sth");
    }

    public static void test2(String name) {
        System.out.println(name);
    }

    public static void test3(int counter) {
        for (int i = 0; i < counter; i++) {
            System.out.print('-');
        }
    }

    public static void test4() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("return ..." + i);
                return;
            }

            else {
                System.out.println("continue..." + i);
                continue;
            }

        }
    }

    public static int test5(int inputNum){
        if( inputNum == 1) {
            return 1;
        }

        return inputNum * (inputNum - 1);
    }

    public static void test6(String[] args){
        for(String item: args){
            System.out.println(item);
        }
    }

}