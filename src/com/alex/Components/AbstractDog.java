package com.alex.Components;

public class AbstractDog extends AbstractAnimal{
    String masterName;

    public AbstractDog(String bread, String name, int age, String masterName) {
        super(bread, name, age);
        this.masterName = masterName;
    }

    @Override
    public void eat() {
        System.out.println("dog is eating ...");
    }

    @Override
    public void sleep() {
        System.out.println("dog is sleeping ...");
    }
}
