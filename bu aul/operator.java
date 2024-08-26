import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        int nanas= 8, mangga= 9;
        double hargaNanas, hargaMangga;
        hargaNanas = 10000.5;
        hargaMangga = 2000.5;
        double total, bayar;

        nanas -= 4;
        mangga -= 6;

        total=mangga+nanas;

        System.out.println("Jumlah stok tersedia = "+nanas+" + "+mangga+" = "+total);

        bayar = (total*hargaNanas)+(total*hargaMangga);

        System.out.println("total aset dimiliki = Rp. "+bayar);
    }
}
