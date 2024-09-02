import java.util.Scanner;

public class GuruTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("masukkan nama : ");
        String nama = input.nextLine();
        

        System.out.println("masukkan mapel : ");
        String mapel = input.nextLine();

        System.out.println("masukkan status : ");
        String status = input.nextLine();

        System.out.println("masukkan nip : ");
        int nip = input.nextInt();

        
        System.out.println("-------------------");

        input.close();

        if (nama != "bidin"){
            System.out.println("good");
        }else{
            System.out.println("best");
        }

        Guru guru = new Guru(nip, nama, mapel, status);
        guru.print();
        System.out.println("-------");
        
        Guru buPasha = new Guru(3021, "Bu pasha", "Produktif rpl", "tetap");
        Guru pakTulus = new Guru(3022, "Pak tulus", "Ipas", "part time");
        Guru pakFalah = new Guru(3023, "Bu pasha", "Bahasa indonesia", "tetap");
        Guru buAul = new Guru(3024, "Bu pasha", "Produktif rpl", "part-time");
        Guru buJevi = new Guru(3025, "Bu pasha", "Bahasa inggris", "tetap");

        buPasha.print();
        pakTulus.print();
        pakFalah.print();
        buAul.print();
        buJevi.print();


     
        
    }
}
