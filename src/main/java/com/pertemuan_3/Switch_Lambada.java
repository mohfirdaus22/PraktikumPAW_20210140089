package com.pertemuan_3;

public class Switch_Lambada {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai) {
            case "A" -> System.out.println("Wow anda lulus dengan baik");
            case "B", "C" -> System.out.println("Anda Lulus");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Mungkin anda salah jurusan");
            }
        }
    }
 
}
