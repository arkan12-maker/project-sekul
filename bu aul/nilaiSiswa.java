import java.util.Scanner;

public class nilaiSiswa {
    public static void main(String[] args) {
        int  i = 1, nilaiSiswa, jumlahSiswa, total = 0;
        double rata2;

        Scanner input = new Scanner(System.in);

        System.out.println("masukkan jumlah siswa : ");
        jumlahSiswa = input.nextInt();

        // System.out.println(jumlahSiswa);
     
        while (i <= jumlahSiswa ) {
            System.out.println("masukkan nilai siswa ke - " + i + " : ");
            nilaiSiswa = input.nextInt();

            total += nilaiSiswa;
            i++;
        }

        rata2 = total / jumlahSiswa;

        System.out.println("total nilai dari " + jumlahSiswa + " siswa adalah " + total);
        System.out.println("rata-rata dari " + jumlahSiswa + " siswa adalah " + rata2);

        
    }
    

       
}

