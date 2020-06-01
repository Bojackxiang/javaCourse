package com.alex.Components;

 public abstract class AbstractAnimal {
     String bread;
     String name;
     int age;

     public AbstractAnimal(String bread, String name, int age) {
         this.bread = bread;
         this.name = name;
         this.age = age;
     }

     // 首相发放
     public abstract void eat();

     public abstract void sleep();


 }


