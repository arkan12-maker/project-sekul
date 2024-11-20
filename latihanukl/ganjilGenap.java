package latihanukl;

import java.util.Scanner;

public class ganjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukkan angka : ");
        int angka = input.nextInt();
        // ganjilGenap(angka);
        ganjilGenap2(angka);

    }

    // public static void ganjilGenap(int angka) {
    //     if (angka % 2 == 0) {
    //         System.out.println(angka + " adalah bilangan genap");
    //     } else {
    //         System.out.println(angka + " adalah bilangan ganjil");
    //     }
    // }

    public static boolean ganjilGenap2(int angka){
        if (angka % 2 == 0) {
            return true;
        } else {
           return false;
        }
    }
}