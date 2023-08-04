package com.pertemuan_3;

public class WithVariabelArgument {
    public static void main(String[] args) {
        sayCongrats("MOH",80,90,79,48);
    }
    private static void sayCongrats(String string, int i, int j, double d) {
    }
    static void sayCongrats(String name, int... values){
    
        int total = 0 ;
        for(var value : values ){
            total += value;
        }
        int finalvalue = total / values.length;
    
        if(finalvalue >= 75){
            System.out.println("Selamat"+" "+ name + ", Anda Lulus");
        }else{
            System.out.println("Maaf"+" "+ name + ", Anda Gagal");
        }
       } 
    
}
