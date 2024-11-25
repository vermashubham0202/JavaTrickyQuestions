package com.pidkui;

public class Test003 {
    public static void main(String[] args) {

        double a = 1.0;
        double b = 0.10;
        double x = 9 * b;
        a = a - (x);

    /* We use Math.round() function to round the answer to
         closest long, then we multiply and divide by 1.0 to
         to set the decimal places to 1 place (this can be done
         according to the requirements.*/
        System.out.println("a = " + Math.round(a * 1.0) / 1.0);
        System.out.println("a = " + Math.floor(a));
        System.out.println("a = " + Math.ceil(a));
    }
}
