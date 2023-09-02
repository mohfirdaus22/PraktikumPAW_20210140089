package com.pertemuan_3;

public class MethodOverloading2 {
    // Metode sayHello() dengan satu parameter FirstName, mengembalikan FirstName.
    static String sayHello(String FirstName) {
        return FirstName;
    }

    // Metode sayHello() dengan dua parameter FirstName dan Lastname, mengembalikan FirstName + Lastname.
    static String sayHello(String FirstName, String Lastname) {
        return FirstName + Lastname;
    }

    // Metode tambah() dengan dua parameter int, mengembalikan penjumlahan var1 dan var2.
    static int tambah(int var1, int var2) {
        return var1 + var2;
    }

    // Metode tambah() dengan dua parameter String, mengembalikan string yang menggabungkan var1 dan var2.
    static String tambah(String var1, String var2) {
        return var1 + " tambah " + var2;
    }

    public static void main(String[] args) {
        // Memanggil metode sayHello() dengan satu parameter dan mencetak hasilnya.
        System.out.println(sayHello("Hello"));
        
        // Memanggil metode sayHello() dengan dua parameter dan mencetak hasilnya.
        System.out.println(sayHello("Moh", "Firdaus"));
        
        // Memanggil metode tambah() dengan dua parameter String dan mencetak hasilnya.
        System.out.println(tambah("satu", "dua"));
        
        // Memanggil metode tambah() dengan dua parameter int dan mencetak hasilnya.
        System.out.println(tambah(1, 2));
    }
}
