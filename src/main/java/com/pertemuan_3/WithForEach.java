package com.pertemuan_3;

public class WithForEach {
    public static void main(String[] args) {
      
        String[] array= {
            "Moh", "Firdaus", "Maulana",
            "Programmer", "Biasa", "Aja"
        };

        for(var value : array){
            System.out.println(value);
        }

    }
}
