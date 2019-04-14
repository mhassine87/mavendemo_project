package com.example.mavenjavatest.test;

public class Calc {
    public int add (int a , int b) {return a+b;}
    public int substract (int a , int b ) {return a- b;}
    public int mult (int a , int b ) {return a * b;}
    public int div (int a , int b ) {
        if (b == 0) return 0;
    return a / b;
    }
}


