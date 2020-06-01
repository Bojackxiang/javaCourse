package com.alex.Components;

public class Student {
    private String name;
    private int age;
    private double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
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
        if(age >= 0 && age < 120){
            this.age = age;
        }else{
            System.out.println("非法数据");
            this.age = 0;
        }

    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    void sayHi() {
        System.out.println(this.name + "-" + this.age + "-" + this.score);
    }


}
