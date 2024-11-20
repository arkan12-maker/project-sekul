package latihanukl;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] golongan = {1, 2, 3, 4};
        String[] nama = {"Galuh", "Indro", "Jedi", "Kanu"};
        String[] alamat = {"sawojajar", "Blimbing", "lowokwaru", "klojen"};
        Double[] harga = {1000.0, 1500.0, 2000.0};

        System.out.println("mau input berapa id :");
        int jumlahid = input.nextInt();

        for (int i = 1; i <= jumlahid; i++) {
        System.out.println("masukkan id ke - " + i + " : ");
        int id = input.nextInt();
        System.out.println("masukkan jumlah kwh id ke - " + i + " : ");
        int jumlahkwh = input.nextInt();
        
        if (id == 1) {
            System.out.println();
            System.out.println("---------------------");
            System.out.println("nama : " + nama[0]);
            System.out.println("golongan : " + golongan[0]);
            System.out.println("alamat : " + alamat[0]);
            System.out.println("jumlah kwh : " + jumlahkwh);
            System.out.println("harga per kwh : " + harga[0]);
            System.out.println("total : " + harga[0] * jumlahkwh);
            System.out.println("---------------------");    
            System.out.println();
        }
        if (id == 2) {
            System.out.println();
            System.out.println("---------------------");
            System.out.println("nama : " + nama[1]);
            System.out.println("golongan : " + golongan[2]);
            System.out.println("alamat : " + alamat[1]);
            System.out.println("jumlah kwh : " + jumlahkwh);
            System.out.println("harga per kwh : " + harga[2]);
            System.out.println("total : " + harga[2] * jumlahkwh);
            System.out.println("---------------------");    
            System.out.println();
        }
        if (id == 3) {
            System.out.println();
            System.out.println("---------------------");
            System.out.println("nama : " + nama[2]);
            System.out.println("golongan : " + golongan[1]);
            System.out.println("alamat : " + alamat[2]);
            System.out.println("jumlah kwh : " + jumlahkwh);
            System.out.println("harga per kwh : " + harga[1]);
            System.out.println("total : " + harga[1] * jumlahkwh);
            System.out.println("---------------------");    
            System.out.println();
        }

        if (id == 4) {
            System.out.println();
            System.out.println("---------------------");
            System.out.println("nama : " + nama[4]);
            System.out.println("golongan : " + golongan[2]);
            System.out.println("alamat : " + alamat[3]);
            System.out.println("jumlah kwh : " + jumlahkwh);
            System.out.println("harga per kwh : " + harga[2]);
            System.out.println("total : " + harga[2] * jumlahkwh);
            System.out.println("---------------------");    
            System.out.println();
        }
       
        
        
    }
}
}
