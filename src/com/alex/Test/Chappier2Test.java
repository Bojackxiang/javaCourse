package com.alex.Test;

import com.alex.Chapter12;
import com.alex.Chapter12.Inner;
import com.alex.Components.Chapter12Student;

public class Chappier2Test {
    public static void main(String[] args) {
        Chapter12 chapter12 = new Chapter12();

        // 普通方法
        Inner innerComp = chapter12.new Inner();
        innerComp.showInner();
        // 更加简洁的方法
        Inner innerComp2 = new Chapter12().new Inner();
        innerComp2.showOuter();

        Chapter12Student student1 = new Chapter12Student("alex");
        Chapter12Student student2 = new Chapter12Student("alex");

        Class class1 = student1.getClass();
        Class class2 = student2.getClass();

        if (class1 == class2) {
            System.out.println("s1 s2 have the same class ...");
            System.out.println(class1);
        } else {
            System.out.println("s1 s2 dont have have the same class ...");
        }

        int hasCode1 = student1.hashCode();
        int hasCode2 = student2.hashCode();

        Chapter12Student student3 = student2;
        System.out.println(hasCode1 + "=" + hasCode2 + "="+student3.hashCode());

        System.out.println(student3.toString());

        System.out.println(student1.equals(student2));

        String testString1 = "hello";
        String testString2 = "hello";

        System.out.println(testString1.equals(testString2));

        

    }
}
