package com.pertemuan_3;

public class MethodLevelScope {
    public static void main(String[] args) {
        // Memanggil metode myMethod() dengan argumen 5 dan mencetak hasilnya.
        System.out.println(myMethod(5));

        // Memanggil metode myMethod() dengan argumen 17 dan mencetak hasilnya.
        System.out.println(myMethod(17));
    }

    // Deklarasi metode myMethod() dengan parameter 'arg'.
    public static int myMethod(int arg) {
        // Mendefinisikan variabel 'secondArg' dengan nilai 100 (variabel lokal metode).
        int secondArg = 100; // local method variable

        // Mengembalikan hasil penjumlahan 'secondArg' dan 'arg'.
        return secondArg + arg;
    }
}
