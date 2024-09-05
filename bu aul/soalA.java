import java.util.Scanner;

public class soalA {
    public static void main(String[] args) {
            int nilai;
        String predikat, nama;

        Scanner input = new Scanner (System.in);
        System.out.println("masukkan nama anda : ");
        nama = input.nextLine();
        System.out.println("masukkan nilai :");
        nilai = input.nextInt();
       

        if (nilai >= 85 && nilai <= 100) {
            predikat = "A";
            System.out.println("anda lulus dangan predikatnya : "+predikat);
        }else if (nilai >= 70 && nilai <= 84) {
            predikat = "B";
            System.out.println("anda lulus dengan predikatnya : "+predikat);
        }else if  (nilai >=50 && nilai <= 69) {
            predikat = "C";
            System.out.println("anda lulus dengan predikatnya : "+predikat);
        }else if (nilai >=40 && nilai <= 49) {
            predikat = "D";
            System.out.println("anda tidak lulus dengan predikatnya : "+predikat);
        }else{
            predikat = "E";
            System.out.println("anda tidak lulus dengan predikatnya : "+predikat);
        }
        input.close();
        }
    }

