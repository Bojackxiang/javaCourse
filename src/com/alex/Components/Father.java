package com.alex.Components;

public class Father {
    String name;
    int value = 20;

    public Father() {
        super(); // 这边会自动直接调用super()
    }

    public static void fatherStatic() {
        System.out.println("father static function ...");
    }


    public Father(String name) {
        this.name = name;
    }

    public void fatherFunc() {
        System.out.println("this is the father function ...");

    }


}
