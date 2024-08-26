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

    // Constructor 
    public Siswa () {
        id = 0;
        nama = "Kosong";
        ipk = 0.0;
    }

    // Constructor Parameter
    public Siswa (int i, String n, double k) {
        id = i;
        nama = n;
        ipk = k;
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