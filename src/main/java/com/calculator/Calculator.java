package com.calculator;

public class Calculator{

    private void addAtoB(int a, int b){
        System.out.println("Add " + a + " to " + b + " equals " + (a+b));
    }

    private void subtractAfromB(int a, int b){
        System.out.println("Subtract " + a + " from " + b + " equals " + (b-a));
    }

    public static void main (String[] args){
        Calculator calc1 = new Calculator();
        calc1.addAtoB(3, 5);
        calc1.subtractAfromB(12, 40);

    }
}
