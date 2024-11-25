package com.pidkui;

public class Test002 {
    public static void main(String[] args) {

        double a = 1.0;
        double b = 0.10;
        double x = 9 * b;
        a = a - (x);

        // value of a is expected as 0.1
        System.out.println("a = " + a);
    }
}
