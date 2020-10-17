package com.dimas.Modul2.Inheritance;

public class DemoInheritance {
    public static void main(String[] args) {
        A superclass = new A();
        B subclass = new B();

        System.out.println("Ini SuperClass : ");
        superclass.x = 3;
        superclass.y = 4;
        superclass.printXY();

        //member super class dapat diakses oleh subclass
        System.out.println("Ini SubClass : ");
        subclass.x = 1;
        subclass.y = 2;
        subclass.printXY();

        //member tambahan pada subclass
        subclass.z = 5;
        subclass.sumValue();
    }
}
