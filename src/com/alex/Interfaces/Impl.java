package com.alex.Interfaces;

public class Impl implements NewInterface {
    @Override
    public void interfaceMethod() {
        System.out.println("this is th interface method ... ");
        System.out.println(username);
    }
}