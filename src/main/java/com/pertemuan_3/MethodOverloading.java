package com.pertemuan_3;

public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("purwanto");
        sayHello("Eko", "Purwanto");
    }

    static void sayHello() {
        System.out.println("Hello");
    }

    static void sayHello(String firstname) {
        System.out.println("Hello " + firstname);
    }

    static void sayHello(String firstname, String lastname) {
        System.out.println("Hello " + firstname + " " + lastname);
    }

}
