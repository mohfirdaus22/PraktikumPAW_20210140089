package com.pertemuan_3;

public class Switch_Statement {

    public static void main(String[] args) {
        //tentukan nilai didalam var
        var nilai = "";
        switch (nilai) {
            case "A":
                System.out.println("Wow Anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Anda lulus");
                break;
            case "D":
                System.out.println("Anda Tidak lulus");
                break;
            default:
                System.out.println("Nyari Apa Bang???");

        }
    }

}
