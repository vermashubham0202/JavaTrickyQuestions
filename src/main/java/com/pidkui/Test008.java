package com.pidkui;

public class Test008 {
    public static void main(String[] args) {
        Base2 b = new Derived2();
        b.show();
    }
}

class Base2 {
    public static void show() {
        System.out.println("Base::show() called");
    }
}

class Derived2 extends Base2 {
    public static void show() {
        System.out.println("Derived::show() called");
    }
}

// Like C++, when a function is static, runtime polymorphism doesn't happen.