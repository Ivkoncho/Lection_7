package com.company;

public class Newtask {


    int a;
    int b;

    public void Rectangle(int inputA, int inputB){
        a=inputA;
        b=inputB;
    }

    public int area(){
        return a*b;
    }

    public int perimeter(){
        return 2*a+2*b;
    }
}
