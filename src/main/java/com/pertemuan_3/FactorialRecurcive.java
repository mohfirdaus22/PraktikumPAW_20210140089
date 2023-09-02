package com.pertemuan_3;

public class FactorialRecurcive {
    // Metode factorialRecursive() untuk menghitung faktorial secara rekursif.
    static int factorialRecursive(int value) {
        // Basis kasus: jika nilai adalah 1, kembalikan 1 (faktorial dari 1 adalah 1).
        if (value == 1) {
            return 1;
        } else {
            // Langkah rekursif: Hitung faktorial dari (value - 1) dan kalikan dengan value.
            return value * factorialRecursive(value - 1);
        }
    }

    public static void main(String[] args) {
        // Memanggil metode factorialRecursive() dengan argumen 7 untuk menghitung faktorial 7.
        int result = factorialRecursive(7);

        // Menampilkan hasil faktorial ke konsol.
        System.out.println("Factorial: " + result);
    }
}
