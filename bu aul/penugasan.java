import java.util.Scanner;

public class penugasan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int jeruk = 50, apel = 80, pisang = 50;
        double hargaJeruk, hargaApel, hargaPisang;
        hargaApel = 5000;
        hargaJeruk = 3000;
        hargaPisang = 2000;
        double total, bayar;

        System.out.println("masukkan jumlah apel yang dibeli : ");
        apel = input.nextInt();
        System.out.println("masukkan jumlah jeruk yang dibeli : ");
        jeruk = input.nextInt();
        System.out.println("masukkan jumlah pisang yang dibeli : ");
        pisang = input.nextInt();

        total= apel + jeruk + pisang;
        bayar= (apel*hargaApel)+(jeruk*hargaJeruk)+(jeruk*hargaPisang);

        System.out.println("jumlah barang yang dibeli = " + pisang + " pisang " + "+ " + jeruk + " jeruk " + "+ " +apel+ " apel = " +total);
        System.out.println("harga yang harus dibayar = "+bayar);
    }
}
