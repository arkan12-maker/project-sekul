import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        double total, diskon;
        String nama;

        Scanner in = new Scanner(System.in);
        System.out.println("masukkan nama anda : ");
        nama = in.nextLine();
        System.out.println("masukkan total pembelian : ");
        total = in.nextDouble();
        in.close();

        if (total > 100000) {
            diskon = total * 10/100;
            total -= diskon;
            System.out.println("");
            System.out.println("Anda mendapat diskon 10% ");
        } else if (total > 40000) {
            diskon = total * 0.05;
            total -= diskon;
        }else{
            System.out.println("Anda tidak dapat diskon ");
        }

        if (nama == "arkan") {
            System.out.println("pelanggan terbaik");
        }
        

       
        System.out.println("");
        System.out.println("-----------------");
        System.out.println("total : "+ total);
        System.out.println("-----------------");
        System.out.println("terimakasih :)");
    }
}
