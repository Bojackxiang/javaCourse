package com.alex;


import com.alex.Components.Chapter11Dog;
import com.alex.Interfaces.*;

public class Chapter11 {
    public static void main(String[] args) {
        Impl myImple = new Impl();
        CarImpl carImpl = new CarImpl("BMW", "weijie xiang");
        String carName = carImpl.getCarName();
        String masterName = carImpl.getMasterName();
        System.out.println(carName + " -- " + masterName);

        CarInterface ae86 = new CarImpl("toyota", "takumi");

        CarImpl gtr = new CarImpl("gtr", "weijie xiang");

        Chapter11Dog myDog = new Chapter11Dog("little hasky", "husky", "weijie xiang");
        Speak a = myDog;
        Run b = myDog;
        a.speak("This is a husky");
        b.run(20);
        /*
         * 注意：
         * 多态的时候，就算我们从不同的视角 （interface）来看，这个实例还是使用的实例
         */




    }
}
