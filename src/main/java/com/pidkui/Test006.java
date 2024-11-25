package com.pidkui;

public class Test006 {
    public static void main(String[] args) {

        Double object = new Double("2.4");
        int a = object.intValue();
        byte b = object.byteValue();
        float d = object.floatValue();
        double c = object.doubleValue();

        System.out.println(a + b + c + d);
    }
}

// output: 8.800000095367432

// Arithmetic conversions are implicitly performed to cast the values to a common type.
// The compiler first performs integer promotion. If the operands still have different types,
// then they are converted to the type that appears highest in the hierarchy.