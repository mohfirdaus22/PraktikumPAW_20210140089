package com.pertemuan_3;

public class FactorialRecurcive {

    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }

      public static void main(String[] args) {
        int result = factorialRecursive(7);
        System.out.println("Factorial: " + result);
    }
}
