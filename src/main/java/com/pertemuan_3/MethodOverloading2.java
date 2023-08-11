package com.pertemuan_3;

public class MethodOverloading2 {
    static String sayHello(String FirstName) {
        // System.out.println("Hello"+ FirstName);
        return FirstName;
    }

    static String sayHello(String FirstName, String Lastname) {
        // System.out.println("Hello" + " "+ FirstName + " " + Lastname);
        return FirstName + Lastname;
    }

    static int tambah(int var1, int var2) {
        return var1 + var2;
    }

    static String tambah(String var1, String var2) {
        return var1 + " " +"tambah"+ " " + var2;
    }

    public static void main(String[] args) {
        System.out.println(sayHello("Hello"));
        System.out.println(sayHello("Moh", "Firdaus"));
        System.out.println(tambah("satu", "dua"));
        System.out.println(tambah(1, 2));

    }
}
