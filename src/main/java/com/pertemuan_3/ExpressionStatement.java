package com.pertemuan_3;

import java.util.Date;

public class ExpressionStatement {
    public static void main(String[] args) {
        // Mendefinisikan variabel 'value'
        int value;
        
        // Memberikan nilai 10 ke variabel 'value'
        value = 10;
        
        // Menampilkan dan memberikan nilai 100 ke variabel 'value', lalu hasilnya ditampilkan
        System.out.println(value = 100);
        
        // Mendefinisikan variabel 'aValue' dan memberikan nilai 8933.234
        double aValue = 8933.234;
        
        // Menaikkan nilai 'aValue' sebesar 1 (increment)
        aValue++;
        
        // Menampilkan nilai 'aValue' setelah diincrement
        System.out.println(aValue);
        
        // Memanggil metode 'println' untuk menampilkan teks "Hello World!"
        System.out.println("Hello World!");
        
        // Membuat objek dari kelas Date dan mengassignnya ke variabel 'date'
        Date date = new Date();
        
        // Menampilkan objek 'date', yang akan mencetak informasi tanggal dan waktu saat ini
        System.out.println(date);
    }
}
