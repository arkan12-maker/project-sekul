/**
 * predikat
 */
import java.util.Scanner;

public class predikat {

    public static void main(String[] args) {
        int nilai;
        String predikat, nama;

        Scanner input = new Scanner (System.in);
        System.out.println("masukkan nama anda : ");
        nama = input.nextLine();
        System.out.println("masukkan nilai :");
        nilai = input.nextInt();
        input.close();

        if (nilai > 90 ) {
            predikat = "A";
        }else if (nilai > 80) {
            predikat = "B";
        }else if  (nilai > 70 ){
            predikat = "C";
        }else{
            predikat = "D";
        }

        if (nama.equalsIgnoreCase("arkan")) {
            System.out.println("rill pemenangggg");
            
        }
        
        System.out.println("predikat "+nama+" adalah : "+predikat);

    }
}