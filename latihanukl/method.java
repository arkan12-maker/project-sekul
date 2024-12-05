package latihanukl;

import java.util.Scanner;
public class method {


    public static void main(String[] args) {
        //Methopd  static 
        Double phi = 3.14;
        Double volume = 0.0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("masukkan jari-jari : ");
        Double r = input.nextDouble();

        System.out.println("masukkan tinggi :");
        Double t = input.nextDouble();

        System.out.println("volume = " + volume (volume, phi, r, t));
     
    
     
    }
    public static Double volume (Double volume, Double phi, Double r, Double t) {
        volume = phi * r * r * t; 
        return volume;
        }
}

