import java.util.Scanner;

public class nilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double uts, uas, tugas, akhir;
        String nama;
        
        System.out.println("masukkan nama anda : ");
        nama = input.nextLine();
        System.out.println("-----------------------------");
        System.out.println("masukkan nilai uts anda : ");
        uts = input.nextDouble();
        System.out.println("-----------------------------");
        System.out.println("masukkan nilai uas : ");
        uas = input.nextDouble();
        System.out.println("-----------------------------");
        System.out.println("masukkan nilai tugas : ");
        tugas = input.nextDouble();
        System.out.println("-----------------------------");
        
        akhir = (0.3*tugas) + (0.3*uts) + (0.4*uas);
        System.out.println("nilai akhir anda adalah : " +akhir);
    }
}
