package com.pertemuan_3;

public class Continue {
    public static void main(String[] args) {
        // Melakukan perulangan dari 1 hingga 10 dengan menggunakan for loop
        for (int counter = 1; counter <= 10; counter++) {
            // Memeriksa apakah nilai counter adalah bilangan genap
            if (counter % 2 == 0) {
                continue; // Melompati iterasi berikutnya jika counter genap
            }
            System.out.println("Perulangan Ganjil-" + counter); // Mencetak pesan untuk bilangan ganjil
        }

    }
}
