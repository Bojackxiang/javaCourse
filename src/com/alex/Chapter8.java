package com.alex;

import com.alex.Components.Dog;

public class Chapter8 {


    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sleep();

        myDog.showAge();

        myDog.eat(1);

        myDog.eat("狗粮");

        Dog dog2 = new Dog(12);
        System.out.println(dog2.getClass());

        Dog dog3 = new Dog();


    }
}
