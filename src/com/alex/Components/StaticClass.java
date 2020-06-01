package com.alex.Components;

public class StaticClass {
    public static String roleName = "student"; // 静态属性前面也要有public才能够被调用

    private String name;
    private int age;

    static {
        System.out.println("金泰代码块开始被执行了...");
        System.out.println(StaticClass.roleName);
    }

    public StaticClass() {
        System.out.println("StaticClass 构造函数开始被执行...");
        System.out.println("开始调用 static 的方法");
        showMe();
        roleName = "Not a student any more";

    }

    public StaticClass(String name, int age) {
        System.out.println("带参构造七开始运行 ......");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void showMe(){
        System.out.println("I am a " + StaticClass.roleName);
    }

    public static void showMyName(String name){
        System.out.println("static method -" + name );
    }

}
