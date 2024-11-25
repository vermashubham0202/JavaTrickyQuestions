package com.pidkui;

public class Test007 {
    public static void main(String[] args) {
        Base b = new Derived();
        b.show();
    }
}

class Base {
    public void show() {
        System.out.println("Base::show() called");
    }
}

class Derived extends Base {
    public void show() {
        System.out.println("Derived::show() called");
    }
}

// In the above program, b is a reference of Base type and refers to an object of Derived class.
// In Java, functions are virtual by default. So the run time polymorphism happens and derived fun() is called.