package com.dimas.Modul2.Polimorfisme.Overriding;

public class DemoOverriding {
    public static void main(String[] args) {
        X superclass = new X();
        Y subclass = new Y();

        superclass.getValue("Tidur");
        subclass.getValue("Makan");
    }
}
