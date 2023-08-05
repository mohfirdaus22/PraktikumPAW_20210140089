package com.pertemuan_3;

public class FactorialRecurcive {
    static int factorialRecurcive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecurcive(value - 1);
        }
    }
}
