package com.pertemuan_3;

public class OperasiBoolean {
    public static void main(String[] args) {
        // Mendefinisikan variabel absen dengan nilai 70
        var absen = 80;
        
        // Mendefinisikan variabel nilaiAkhir dengan nilai 88
        var nilaiAkhir = 88;

        // Memeriksa apakah absen lebih besar atau sama dengan 75
        var lulusAbsen = absen >= 75;
        
        // Memeriksa apakah nilaiAkhir lebih besar atau sama dengan 75
        var lulusNilaiAkhir = nilaiAkhir >= 75;

        // Menggabungkan hasil pengecekan absen dan nilaiAkhir dengan operator logika AND (&&)
        var lulus = lulusAbsen && lulusNilaiAkhir;
        
        // Menampilkan hasil akhir apakah seorang siswa lulus atau tidak
        System.out.println(lulus);
    }
}
