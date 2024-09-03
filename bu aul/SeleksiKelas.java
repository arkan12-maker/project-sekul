import java.util.Scanner;

public class SeleksiKelas {
    public static void main(String[] args) {
        int pilihan;
        String kelas;

        Scanner input = new Scanner(System.in);
        System.out.println("List Kelas");
        System.out.println("\n1. RPL 1\n2. X RPL 2\n3. RPL 3\n4. RPL 4\n5. RPL 5\n6. RPL 6\n7. RPL 7\n8. RPL 8");
        System.out.println("input angka : ");
        pilihan = input.nextInt();
      
  

        switch (pilihan) {
            case 1:
                kelas = "X RPL 1";
                break;

            case 2:
                kelas = "X RPL 2";
                break;

            case 3:
                kelas = "RPL 3";
                break;

            case 4:
                kelas = "RPL 4";
                break;

            case 5:
                kelas = "RPL 5";
                break;

            case 6:
                kelas = "RPL 6";
                break;

            case 7:
                kelas = "RPL 7";
                break;

            case 8:
                kelas = "RPL 8";
                break;

            default:
                kelas = "tidak terdaftar";
                break;

                
        }

         System.out.println("kelas : " + kelas);

    }
}
