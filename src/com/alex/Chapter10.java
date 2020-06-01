package com.alex;

import com.alex.Components.StaticClass;
import com.alex.Components.Student;

import java.util.Arrays;

public class Chapter10 {
    public static void main(String[] args) {
        StaticClass student1 = new StaticClass("xiaoming", 12);
        StaticClass student2 = new StaticClass("xiao wng", 13);

//        StaticClass student3 = new StaticClass();
        StaticClass.showMe();

        StaticClass.showMyName("hello world ...");

        final int[] numList = new int[]{1,2,3,4,5};
        final int numSingle = 20;
        System.out.println(numSingle);


        final Chapter9Student newStudent = new Chapter9Student("Alex");
        newStudent.setName("Eric");


        String stringifiedList = Arrays.toString(numList);
        System.out.println(stringifiedList);


    }
}


class Chapter9Student {
    private String name;

    public Chapter9Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
