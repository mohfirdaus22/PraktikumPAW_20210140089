package com.pertemuan_3;

public class ElseIf_Statement {

    public static void main(String[] args) {
        var nilai = 80;
        var absen = 90;

        if (nilai >= 80 && absen >= 80) {
            System.out.println("Nilai Anda A");
            // block of code to be executed if the condition1 is false and condition2 is true
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("Nilai Anda B");
            // block of code to be executed if the condition1 is false and condition2 is true
        } else if (nilai >= 60 && absen >= 60) {
            System.out.println("Nilai Anda C");
            // block of code to be executed if the condition1 is false and condition2 is true
        } else if (nilai >= 50 && absen >= 50) {
            System.out.println("Nilai Anda D");
            // block of code to be executed if the condition1 is false and condition2 is true
        } else {
            System.out.println("Nilai Anda E");
            // block of code to be executed if the condition1 is false and condition2 is false
        }
    }
}
