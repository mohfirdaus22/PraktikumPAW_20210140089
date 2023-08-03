package com.pertemuan_3;

public class Switch_Lambada {
    public static void main(String[] args) {
        int dayOfWeek = 3; // Misalnya, 1 untuk Senin, 2 untuk Selasa, dst.

        switch (dayOfWeek) {
            case 1:
                System.out.println("Hari ini adalah Senin");
                break;
            case 2:
                System.out.println("Hari ini adalah Selasa");
                break;
            case 3:
                System.out.println("Hari ini adalah Rabu");
                break;
            case 4:
                System.out.println("Hari ini adalah Kamis");
                break;
            case 5:
                System.out.println("Hari ini adalah Jumat");
                break;
            case 6:
                System.out.println("Hari ini adalah Sabtu");
                break;
            case 7:
                System.out.println("Hari ini adalah Minggu");
                break;
            default:
                System.out.println("Hari yang dimasukkan tidak valid!");
        }
    }
}
