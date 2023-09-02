package com.pertemuan_3;

public class MethodReturnValue {

    public static void main(String[] args) {
        // Mendeklarasikan variabel 'a' dan 'b' serta menginisialisasi mereka dengan nilai 100 dan 200.
        var a = 100;
        var b = 200;

        // Memanggil metode sum() dengan 'a' dan 'b' sebagai argumen dan menyimpan hasilnya dalam variabel 'c'.
        var c = sum(a, b);

        // Menampilkan hasil penjumlahan 'a' dan 'b' (nilai yang dikembalikan oleh metode sum()) ke konsol.
        System.out.println(c);
    }

    // Deklarasi metode sum() yang mengambil dua parameter 'value1' dan 'value2' dan mengembalikan nilai bertipe int.
    static int sum(int value1, int value2) {
        // Melakukan penjumlahan antara 'value1' dan 'value2' dan menyimpan hasilnya dalam variabel 'total'.
        var total = value1 + value2;

        // Mengembalikan nilai 'total' sebagai hasil dari metode sum().
        return total;
    }
}


