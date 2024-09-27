package htmljs.soalperulangan;
import java.util.Scanner;
public class soalC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gaji = 0 , totalGaji = 0, gajiTertinggi = 0, gajiTerendah = 100000,indexgaji = 5;

        for (int i = 1; i <= indexgaji; i++) {
            System.out.println("masukkan gaji karyawan ke - " + i);
            gaji = input.nextInt();

            totalGaji += gaji;             
        }
        System.out.println("total gaji  = " + totalGaji);

    }
    }

        
    
  


