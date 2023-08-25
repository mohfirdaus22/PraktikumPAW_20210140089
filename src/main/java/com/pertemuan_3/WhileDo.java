package com.pertemuan_3;

public class WhileDo {
    public static void main(String[] args) {
        // Mendeklarasikan dan menginisialisasi variabel counter dengan nilai 100
        var counter = 100;

        // Melakukan perulangan dengan do-while loop
        do {
            System.out.println("Perulangan Ke-" + counter); // Mencetak pesan dengan nomor perulangan
            counter++; // Meningkatkan nilai counter untuk perulangan berikutnya
        } while (counter <= 10); // Melakukan perulangan selama counter kurang dari atau sama dengan 10
    }
}
