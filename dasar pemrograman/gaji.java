import java.util.Scanner;
public class gaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tarif, gaji, pajak;
        int jam;
        String nama;

        System.out.println("masukkan nama anda : ");
        nama = input.nextLine();

        System.out.println("masukkan jumlah jam kerja anda : ");
        jam = input.nextInt();

        tarif = 10000;
        
        pajak = 0.1 * (tarif * jam);

        gaji = (tarif*jam)- pajak;
        System.out.println("gaji anda selama "+jam+" jam adalah "+gaji);

        
    }
}
