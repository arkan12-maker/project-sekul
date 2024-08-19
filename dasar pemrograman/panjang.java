import java.util.Scanner;

/**
 * panjang
 */
public class panjang {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//         int panjang, lebar, luas;
 
//    System.out.println("hitung luas persegi panjang ");
//    System.out.println("masukkan panjang ");
//    panjang = input.nextInt();
//    System.out.println("masukkan lebar ");
//    lebar = input.nextInt();
   
//    luas=panjang*lebar;
//    System.out.println("luas persegi panjang adalah "+luas);

//         int panjang, lebar, luas;
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