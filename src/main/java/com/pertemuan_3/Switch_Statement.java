package com.pertemuan_3;

public class Switch_Statement {

    public static void main(String[] args) {
        // Mendefinisikan variabel 'nilai' dengan string kosong
        var nilai = "A";
        
        // Melakukan pemilihan kasus berdasarkan nilai variabel 'nilai'
        switch (nilai) {
            case "A":
                // Jika nilai sama dengan "A", cetak "Wow Anda lulus dengan baik"
                System.out.println("Wow Anda lulus dengan baik");
                break;
            case "B":
            case "C":
                // Jika nilai sama dengan "B" atau "C", cetak "Anda lulus"
                System.out.println("Anda lulus");
                break;
            case "D":
                // Jika nilai sama dengan "D", cetak "Anda Tidak lulus"
                System.out.println("Anda Tidak lulus");
                break;
            default:
                // Jika nilai tidak cocok dengan kasus di atas, cetak "Nyari Apa Bang???"
                System.out.println("Nyari Apa Bang???");
        }
    }

}
