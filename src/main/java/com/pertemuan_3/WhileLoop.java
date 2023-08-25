package com.pertemuan_3;

public class WhileLoop {
    public static void main(String[] args) {
        // Mendeklarasikan dan menginisialisasi variabel counter dengan nilai 1
        var counter = 1;
        
        // Melakukan perulangan dengan while loop selama counter kurang dari atau sama dengan 10
        while (counter <= 10) {
            System.out.println("Perulangan Ke-" + counter); // Mencetak pesan dengan nomor perulangan
            counter++; // Meningkatkan nilai counter untuk perulangan berikutnya
        }

    }
}
