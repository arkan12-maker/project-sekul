import java.util.Scanner;

public class perulanganDowhile {
    public static void main(String[] args) {

        int jumlah = 0, total = 0, temptotal = 0, harga = 0, pilihan;
        String lanjut ;
        boolean status  ;


        do{
            Scanner in = new Scanner(System.in);
            System.out.println("1. buah Rp.5000\n2. sayur Rp.3000\n3. buah dan sayur Rp.7000");
            System.out.println("masukkan pilihan : ");
            pilihan = in.nextInt();

            switch (pilihan) {
                case 1:
                    harga = 5000;
                    break;

                case 2:
                    harga = 3000;
                    break;

                case 3:
                    harga = 7000;
                    break;
                default:
                    break;
            }
            total = jumlah*harga;   
            temptotal += total;

            System.out.println("mau beli lagi ");
            lanjut = in.next();

            if (lanjut.equalsIgnoreCase("ya")) {
             status = true;
            }else{
              status = false;
            }
        }while (status= true);
}
}
