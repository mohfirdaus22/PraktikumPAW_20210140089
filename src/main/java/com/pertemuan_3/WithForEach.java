package com.pertemuan_3;

public class WithForEach {
    public static void main(String[] args) {
      
        // Array yang berisi beberapa elemen string
        String[] array = {
            "Moh", "Firdaus", "Maulana",
            "Programmer", "Biasa", "Aja"
        };

        // Perulangan for-each untuk mengiterasi setiap elemen dalam array
        for (var value : array) {
            System.out.println(value);
        }

    }
}
