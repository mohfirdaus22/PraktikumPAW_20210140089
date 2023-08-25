package com.pertemuan_3;
import java.io.*;

public class TernaryOperation {
    public static void main(String[] args) {
 
        // Mendeklarasikan variabel n1 dan n2 dengan nilai 5 dan 10
        int n1 = 5, n2 = 10, res;
 
        // Menampilkan nilai n1 dan n2
        System.out.println("First num: " + n1);
        System.out.println("Second num: " + n2);
 
        // Melakukan operasi ternary (kondisi ? nilai_jika_true : nilai_jika_false)
        res = (n1 > n2) ? (n1 + n2) : (n1 - n2);
 
        // Menampilkan hasil dari operasi ternary
        System.out.println("Result = " + res);
    }
}
