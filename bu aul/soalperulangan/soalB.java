package soalperulangan;
import java.util.Scanner;
public class soalB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int barangMasuk, barangKeluar, totalBarang = 0, stok;

        for (int i = 1; i <= 5; i++) {
            System.out.println("masukkan barang yang masuk pada hari ke - " + i);
            barangMasuk = input.nextInt();
            totalBarang += barangMasuk;
            System.out.println();
            System.out.println("masukkan barang yang keluar pada hari ke - " + i);
            barangKeluar = input.nextInt();
            totalBarang -= barangKeluar;
            System.out.println();
        }

        stok = totalBarang;
        System.out.println("total stok akhir setelah 5 hari = " + stok);
    }
}

