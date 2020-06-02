package com.alex;

public class Chapter12 {
    private String name = "username ";

    // -> 和成员变量的等级是相同的
    public class Inner {
        public String name = "inner name";

        public void showInner() {
            System.out.println(name);
        }

        public void showOuter() {
            System.out.println(Chapter12.this.name);
        }

    }

    public static void main(String[] args) {
        int age = 12;
        Integer age2 = age;

        int age3 = age2;

        Integer x = 12;
        String integerStr = Integer.toString(x);
        String intInteger2 = Integer.toString(12, 12);
        String myByte = Integer.toBinaryString(x);
        String xx = "12";
        Integer parsedInt = Integer.parseInt(xx);
        System.out.println(parsedInt);
        Integer.valueOf(x);



        Integer int1 = 200;
        Integer int2 = 200;

        System.out.println(int1 == int2); //这个比较的是reference
        System.out.println(int1.equals(int2)); // 这个比较的值的大小







    }
}
