package com.alex;

import com.alex.Components.*;

public class Chapter9 {


    public static void main(String[] args) {

        Student newStudent = new Student("weijie", 22, 100);
        newStudent.setAge(190);
        System.out.println(newStudent.getAge());

        Bank newBank = new Bank();
        User[] userList = newBank.displayAllUsers();

        boolean loginResult = newBank.login("weijie xiang", "91100");

        Cat myCat = new Cat();

        Son mySon = new Son("son name", "father name");

        Father.fatherStatic();

        Father sonComp = new Son();

        Father daughter = new Daughter("daughter name");

        daughter.fatherFunc();

        Master master = new Master("xiaoming");
        Animal pet = master.buy(1);
        if(pet instanceof Dog) {
            Dog newDog = (Dog) pet;
            newDog.eat();
        } else {
            Cat newCat = (Cat) pet;
            newCat.eat();
        }






    }
}
