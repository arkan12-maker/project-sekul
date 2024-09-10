package soal;
import java.util.Scanner;
public class soalC {
    public static void main(String[] args) {
        int bukuJava, bukuNode;
        Double hargaJava, hargaNode;
        hargaNode = 7500.0;
        hargaJava = 5000.0;
        Double total, diskon;

        Scanner input = new Scanner(System.in);
        System.out.println("masukkan buku java yang dibeli : ");
        bukuJava = input.nextInt();
        System.out.println("masukkan buku node yang dibeli : ");
        bukuNode = input.nextInt();

        System.out.println("jumlah buku java yang dibeli : "+bukuJava+" jumlah buku node yang dibeli : "+bukuNode);

        total = (hargaJava*bukuJava)+(hargaNode*bukuNode);
        

        if (bukuJava > 3 || bukuNode > 3) {
            System.out.println("anda mendapat diskon 10%");
            diskon = total * 0.1;
            total -= diskon;
            System.out.println("total yang harus dibayar : Rp. "+total);
            
        }else{
            System.out.println("anda tidak mendapat diskon");
            System.out.println("total yang harus dibayar : Rp. "+total);
        }
        input.close();
        
    }
}
