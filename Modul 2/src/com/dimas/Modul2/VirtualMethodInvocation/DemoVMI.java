package com.dimas.Modul2.VirtualMethodInvocation;

public class DemoVMI {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parentchild = new Child();

        child.getData();
        parentchild.getData();
    }
}
