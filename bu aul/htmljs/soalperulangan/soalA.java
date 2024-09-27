package htmljs.soalperulangan;
import java.util.Scanner;
public class soalA {
    static int tiket, totalTiket ;
    static double rataRata ;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            for (int i = 1; i <= 7; i++) {
            System.out.println("masukkan jumlah tiket yang terjual pada hari ke - " + i);
            tiket = in.nextInt();

            totalTiket += tiket;

        }
        rataRata = totalTiket / 7;
        System.out.println("total tiket yang terjual pada 7 hari = " + totalTiket);
        System.out.println("rata-rata tiket yang terjual pada 7 hari = " + rataRata);
    }
}

