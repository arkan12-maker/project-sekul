package latihanukl;
import java.util.Scanner;
public class rataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahSiswa = 1;
        Double nilaiSiswa,total = 0.0, rata2= 0.0;

        System.out.println("masukkan jumlah siswa : ");
        jumlahSiswa = input.nextInt();

       
        
    }
    public static void rata2(int jumlahSiswa, Double total, Double nilaiSiswa, Double rata2){
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.println("masukkan nilai siswa ke - " + i + " : ");
            nilaiSiswa = input.nextDouble();
            
            total += nilaiSiswa;
            
            rata2 = total / jumlahSiswa;
            
            }
            System.out.println("-----------------------------------------------");
            System.out.println("total nilai dari " + jumlahSiswa + " siswa adalah " + total);
            System.out.println("rata-rata dari " + jumlahSiswa + " siswa adalah " + rata2);
            System.out.println("-----------------------------------------------");
    }
}

