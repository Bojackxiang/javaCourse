package com.alex.Components;

public class Dog extends Animal {
    String bread;
    String name;
    int age;

    public Dog() {
        System.out.println("default constructor for object ...");
        bread = "哈士奇";
        name = "就是一只哈士奇哇";
    }


    public Dog(int age) {
        this.age = age;
    }

    public Dog(String bread) {
        this(12);
    }


    public void eat() {
        System.out.println("狗狗正在吃东西");
    }

    public void eat(int meal) {
        System.out.println("🐶今天吃了" + meal + "顿");
    }

    public void eat(String thing) {
        System.out.println("狗今天吃了" + thing);
    }

    public void sleep() {
        System.out.println("狗狗睡觉了");
    }

    public void showAge() {
        System.out.println("狗狗的年级是" + age);
    }

}
