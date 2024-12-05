
import java.util.Scanner;

public class mudah1 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        Double harga = 0.0;
         
        System.out.println("masukkan jarak tempuh kota tujuan : ");
        Double jarak = input.nextDouble();
        
        System.out.println("masukkan berat barang yang akan di kirim : ");
        Double berat = input.nextDouble();

        System.out.println("masukkan panjang barang yang akan di kirim : ");
        int panjang = input.nextInt();

        System.out.println("masukkan lebar barang yang akan di kirim : ");
        int lebar = input.nextInt();

        System.out.println("masukkan tinggi barang yang akan di kirim : ");
        int tinggi = input.nextInt();

        int volume = panjang * lebar * tinggi;

        if (jarak <= 10){
            harga = berat * 4250.0;
        }else if (jarak > 10){
            harga = berat * 6000.0;
        }

        if (volume > 100){
            harga += 50000.0;
        }

        System.out.println("harga yang harus dibayar adalah : " + harga);
}
}

