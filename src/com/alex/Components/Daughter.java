package com.alex.Components;

public class Daughter extends Father {
    String daughterName;

    public Daughter(String daughterName) {
        super();
        this.daughterName = daughterName;
    }

    @Override
    public void fatherFunc() {
        System.out.println("daughter over write the father function ...");
    }
}
