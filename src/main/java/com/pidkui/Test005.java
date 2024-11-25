package com.pidkui;

public class Test005 {
    public static void main(String[] args) {

        // allowed
        for (int i = 0; true; i++) {
            System.out.println("Hello");
            break;
        }

        // not allowed
//        for (int i = 0; false; i++) {
//            System.out.println("Hello");
//            break;
//        }

        // not allowed
//        for (int i = 0; 1; i++) {
//            System.out.println("Hello");
//            break;
//        }

        // not allowed
//        for (int i = 0; 0; i++) {
//            System.out.println("Hello");
//            break;
//        }

        // The error is in for loop where 0 is used in place of boolean value.
        // Unlike C++, use of non-boolean variables in place of bool is not allowed
    }
}
