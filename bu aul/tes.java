import java.util.Scanner;

public class tes {
    public static void main(String[] args) {
        String kelas, kelakuan, nama;
        int rataRata;

        Scanner input = new Scanner(System.in);
        System.out.println("masukkan nama : ");
        nama = input.nextLine();

        System.out.println("masukkan kelas : ");
        kelas = input.nextLine();


        if (kelas.equalsIgnoreCase("X") || kelas.equalsIgnoreCase("XI")) {
            System.out.println("masukkan perilaku : ");
            kelakuan = input.nextLine();

            if (kelakuan.equalsIgnoreCase("baik")) {
                System.out.println("masukkan rata-rata : ");
                rataRata = input.nextInt();

                if (rataRata >= 90) {
                    System.out.println("anda diterima jadi duta wikusama ");
                }else {
                    System.out.println("anda tidak memenuhi kriteria nilai ");
                }

            }else {
                System.out.println("anda tidak memenuhi kriteria perilaku");
            }
        }else{
            System.out.println("kamu tidak memenuhi requirement kelas");
        }
    }
}
