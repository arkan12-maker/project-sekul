import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double berat, tinggi, bmi;   

        System.out.println("menghitung bmi ");
        System.out.println("masukkan berat badan ");
        berat = input.nextDouble();
        System.out.println(+berat+" Kg ");
        System.out.println("masukkan tinggi badan ");
        tinggi = input.nextDouble();
        System.out.println(+tinggi+" m ");
        
        bmi =berat/ (tinggi*tinggi);
        System.out.println("bmi anda adalah "+bmi+" Kg ");
    }
    
}