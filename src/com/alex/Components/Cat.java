package com.alex.Components;

public class Cat extends Animal {
    private String bread;

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void myInfo(){

    }

    public void lu(){
        System.out.println("要被鲁猫啦。。。。。");
    }

    // 方法的重写


    @Override
    public void eat() {
        System.out.println("猫猫开始大口吃东西.....");
    }

    @Override
    public void simpleThing() {
        super.simpleThing();
        System.out.println("已经调用完父类的方法...");
    }
}
