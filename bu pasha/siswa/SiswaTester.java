// driver class
/**
 * SiswaTester
 */

package siswa ;
import java.util.Scanner;
public class SiswaTester {

    public static void main(String[] args) {
        // namaClass namaObject = new Constructor
        // Scanner input = new Scanner(System.in);

        // System.out.println("masukkan nama : ");
        // String nama = input.nextLine();

        // System.out.println("masukkan id : ");
        // int id = input.nextInt();
        
        // System.out.println("masukkan ipk : ");
        // double ipk = input.nextDouble();
        
        // System.out.println("-------------------");

        // Siswa gopi = new Siswa(id, nama , ipk);
        // Siswa anto = new Siswa(id, nama, ipk);
        // gopi.print();
        // anto.print();           
        
        
        // input.close();
        
        // Siswa arkan = new Siswa();
        // Siswa rabani = new Siswa();
        // Siswa iqbal = new Siswa();
        // Siswa zaky = new Siswa();
        // Siswa kevin = new Siswa();
        // Siswa surya = new Siswa();
        // Siswa gopi = new Siswa();
        
        // object.method = value
        // arkan.id = 22;
        // arkan.nama = "MUHAMMAD ARKAN MARIADI";
        // arkan.ipk = 4.0;
        // surya.id = 33;
        // surya.nama = "SURYA PUTRAHADI Y.";
        // surya.ipk = 4.0;
        // kevin.ipk = 4.0;
        // zaky.ipk = 4.0;
        // rabani.ipk = 4.0;
        // iqbal.ipk = 4.0;
        // iqbal.id = 16;
        // iqbal.nama = "IQBAL RIZKI RAMADHAN";
        // zaky.id = 3;
        // zaky.nama = "Ananda Valentino Zaky";
        // rabani.id = 23;
        // rabani.nama = "Muhammad Rabbani Aryanta";
        // kevin.id = 20;
        // kevin.nama = "Kevin Arif Rudianto";
        // arkan.print();
        // surya.print();
        // rabani.print();
        // kevin.print();
        // iqbal.print();
        // zaky.print();
        Scanner input = new Scanner(System.in);

        Siswa arkan = new Siswa();
        Siswa surya = new Siswa();

        System.out.println("masukkan id : ");
        arkan.setId(input.nextInt());
        System.out.println("masukkan nama : ");
        arkan.setNama(input.nextLine());
        System.out.println("masukkan ipk : ");
        arkan.setIpk(input.nextDouble());
    
        if ( arkan.getIpk() > surya.getIpk()) {
            System.out.println("ipk arkan lebih besar");
        }else {
            System.out.println("ipk surya lebih ");
        }
    

    

        if (arkan.getIpk()> 70 && arkan.getNama().equalsIgnoreCase("arkan")){
            System.out.println("Lulus");
            
        }else{
            System.out.println("Tidak Lulus");
        }
            

        // if (arkan.getIpk()> 70 && arkan.getNama().equalsIgnoreCase("surya")) {
        //         System.out.println("Salah");
        // }else{
        //    System.out.println("benar");
        // }
       

    
    
   
}
}
    
