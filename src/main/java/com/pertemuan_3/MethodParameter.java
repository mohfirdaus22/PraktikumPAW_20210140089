package com.pertemuan_3;

public class MethodParameter {
    public static void main(String[] args) {
        // Memanggil metode sayHello dengan memberikan dua parameter.
        sayHello("Moh", "Firdaus");
    }

    // Deklarasi metode sayHello dengan dua parameter firstname dan Lastname.
    static void sayHello(String firstname, String Lastname) {
        // Menampilkan pesan "Hello Moh Firdaus" ke konsol dengan menggunakan parameter yang diberikan.
        System.out.println("Hello" + " " + firstname + " " + Lastname);
    }
}
