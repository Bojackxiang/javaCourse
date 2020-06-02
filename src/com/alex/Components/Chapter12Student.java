package com.alex.Components;

import com.alex.Chapter12;

import java.util.Objects;

public class Chapter12Student {
    private String name;

    public Chapter12Student() {

    }

    public Chapter12Student(String username) {
        this.name = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Chapter12Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // 自己和自己比较, 两个地址都是一样的

        if (o instanceof Chapter12Student) return true; // 看两个类型是不是相同

        Chapter12Student student = (Chapter12Student) o;
        if (student.name.equals(this.name)) {
            System.out.println("名字一样就行");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
