package com.pertemuan_3;

public class OperasiBoolean {
    public static void main(String[] args){
var absen = 70;
var nilaiAkhir = 88;

var lulusAbsen = absen >= 75;
var lulusBilaiAkhir = nilaiAkhir>= 75;

var lulus = lulusAbsen && lulusBilaiAkhir;
System.out.println(lulus);

    }
}
