package com.alex;


import com.alex.Components.Car;

public class Chapter2 {
    public static void main(String[] args) {
        Car newCar = new Car();
        newCar.setName("benchi");    
        newCar.setOwner("me");
        
        System.out.println(newCar.getName());
        System.out.println(newCar.getOwner());
        
        System.out.println("hello world");


    }
    
}