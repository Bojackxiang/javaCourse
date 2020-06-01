package com.alex.Components;

public class Son extends Father {
    String sonName;

    public Son () {
        super(); // 调用父类的构造方法
    }

    public Son(String sonName, String fatherName){
        super(fatherName); // 调用父类的带参构造方法
        this.sonName = sonName;
    }

    public void getFatherValue(){
        System.out.println(super.value);
        this.fatherFunc(); // this也可以调用继承来的func
    }

    public void getFatherFunc(){
        super.fatherFunc();
    }

    @Override
    public void fatherFunc() {
        super.fatherFunc();
        System.out.println("trying to over write ");
    }
}
