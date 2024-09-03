import java.util.Scanner;

public class Seleksiduta {
    public static void main(String[] args) {
        String kelas, kriteria, nama;
        int rataRata;

        Scanner input = new Scanner(System.in);
        System.out.println("masukkan nama : ");
        nama = input.nextLine();

        System.out.println("masukkan kelas : ");
        kelas = input.nextLine();
        
        

                if (kelas.equalsIgnoreCase("X") || kelas.equalsIgnoreCase("XI")) {
                System.out.println("masukkan kriteria : ");
                kriteria = input.nextLine();

                if (kriteria.equalsIgnoreCase("baik")) {
                System.out.println("masukkan rata-rata : ");
                rataRata = input.nextInt();

                if (rataRata >= 90) {
                    System.out.println("anda memenuhi requirement kriteria");
                }else{
                    System.out.println("anda tidak memenuhi kriteria nilai ");
                }

                }else{
                System.out.println("anda tidak memenuhi requirement perilaku");
                }
                } else {
                System.out.println("kamu tidak memenuhi requirement kelas");
                }
}
}
