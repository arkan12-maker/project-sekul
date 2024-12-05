
import java.util.Scanner;



public class sedang2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double phi = 3.14;
        Double volume = 0.0;

        System.out.println("masukkan jari-jari : ");
        Double jari = input.nextDouble();

        System.out.println("masukkan tinggi : ");
        Double tinggi = input.nextDouble();
       
        System.out.println("voleme dari tabung adalah " + volume(jari, tinggi, phi, volume));

    }
    public static Double volume(Double jari, Double tinggi, Double phi, Double volume){ {
     volume = phi * jari * jari * tinggi;
     return volume;
   
    }
}
}

