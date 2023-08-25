package com.pertemuan_3;

public class IfStatement {
    public static void main(String[] args) {
        // Mendefinisikan variabel 'nilai' dengan nilai 68
        var nilai = 80;
        
        // Mendefinisikan variabel 'absen' dengan nilai 90
        var absen = 90;

        // Memeriksa apakah 'nilai' lebih besar atau sama dengan 75 dan 'absen' lebih besar atau sama dengan 75
        if (nilai >= 75 && absen >= 75) {
            // Jika kedua kondisi terpenuhi, cetak "Anda Lulus"
            System.out.println("Anda Lulus");
        } else {
            // Jika salah satu atau kedua kondisi tidak terpenuhi, cetak "Anda Tidak Lulus"
            System.out.println("Anda Tidak Lulus");
        }
    }
}
