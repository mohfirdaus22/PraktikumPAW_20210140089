package com.pertemuan_3;

public class FactorialLoop {
    static int factorial(int value) {
        var result = 1;
        for (int i = 1; i<= value; i++){
            result *= i ;
        }
        return result;
    }
}
