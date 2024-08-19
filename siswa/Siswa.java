// object class
/**
 * Siswa
 */
import java.util.Scanner;

public class Siswa {
    // variable
    int id;
    String nama;
    double ipk;

    // Constructor ww
    public Siswa () {
        id = 0;
        nama = "Kosong";
        ipk = 0.0;
    }

    // Setter
    // Setter
    // Method
    public void print() {
        System.out.println("ID "+id);
        System.out.println("NAMA "+nama);
        System.out.println("ipk "+ipk);
    }
}