package com.alex.Components;

public abstract class Chapter11Animal {
    String name;
    String bread;

    public Chapter11Animal(String name, String bread) {
        this.name = name;
        this.bread = bread;
    }

    void sayAnimal(){
        System.out.println("I am a animal ... ");
    }
}
