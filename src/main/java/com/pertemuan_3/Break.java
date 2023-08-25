package com.pertemuan_3;

public class Break {
    public static void main(String[] args) {
        // Mendeklarasikan dan menginisialisasi variabel counter dengan nilai 1
        var counter = 1;

        // Melakukan perulangan tanpa henti dengan menggunakan while loop
        while (true) {
            System.out.println("Perulangan Ke-" + counter); // Mencetak pesan dengan nomor perulangan
            counter++; // Meningkatkan nilai counter untuk perulangan berikutnya
            if (counter > 10) {
                break; // Menghentikan perulangan jika counter lebih dari 10
            }
        }
    }
}
