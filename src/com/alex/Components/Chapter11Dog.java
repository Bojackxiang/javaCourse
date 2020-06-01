package com.alex.Components;

import com.alex.Interfaces.Run;
import com.alex.Interfaces.Speak;

public class Chapter11Dog extends Chapter11Animal implements Speak, Run {
    String master;

    public Chapter11Dog(String name, String bread, String master) {
        super(name, bread);
        this.master = master;
    }

    @Override
    public void speak(String words) {
        System.out.println("master name is " + this.master);
    }

    @Override
    public void run(int meter) {
        System.out.println("pet has run " + meter + " I cannot find my master " + this.master);
    }
}
