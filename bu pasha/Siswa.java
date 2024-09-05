// object class
/**
 * Siswa
 */


public class Siswa {
    // variable
    private int id;
    private String nama;
    private double ipk;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getIpk() {
        return this.ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

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