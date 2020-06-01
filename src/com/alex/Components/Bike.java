package com.alex.Components;

public class Bike {
    final String bikeWord = "我是一个自行车...";
    final String masterName; // 加了final之后就一定要进行赋值

    public Bike(String masterName) {
        this.masterName = masterName;
    }

    public final void run(){
        System.out.println("a bike is running ...");

    }






}
