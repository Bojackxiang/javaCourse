package com.alex;

public class Chapter5 {
    public static void main(String[] args) {
        int x = 1;
        int sum = 0;
        while (x <= 10) {
            
            if (x % 2 == 0){
                x++;
                continue;
            }   

            sum += x;
            x++;
        }

        int y = 0;
        do{
            System.out.println("hello world");
            y++;
        }while ( y < 10);

        System.out.println("" + sum);
    }
}
