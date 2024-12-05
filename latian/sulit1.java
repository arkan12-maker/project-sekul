
import java.util.Scanner;

public class sulit1{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int jumlahSiswa;
      Double nilaiSiswa , hasil = 0.0, total = 0.0,rata =0.0;

      System.out.println("masukkan jumlah murid");
      jumlahSiswa = input.nextInt();


      for(int i = 1; i <=jumlahSiswa; i++){
        System.out.println("masukkan nilai siswa ke - "+i);
        nilaiSiswa = input.nextDouble();
        hasil += nilaiSiswa;

      }
      System.out.println("total nilai murid : "+hasil);
      System.out.println("rata rata nilai murid dari "+jumlahSiswa+" siswa adalah "+(hasil/jumlahSiswa));
        
    
    }
}



