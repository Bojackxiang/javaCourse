package com.alex.Components;

public class Master {

    String name;

    public Master(String name) {
        this.name = name;
    }

    public void feed(Animal animal) {
        System.out.println("master has feed the " + animal.name);
        animal.eat();
    }

    public Animal buy(int petNum) { // 输入的是animal类型，返回的确实animal的子类
        Animal newAnimal = null;

        if (petNum != 1) {
            newAnimal = new Cat();
        } else {
            newAnimal = new Dog();
        }

        return newAnimal;
    }
}
