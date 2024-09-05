/**
 * kalkulator
 */
import java.util.Scanner;
public class kalkulator {
public static void main(String[] args) {
    int angka1, angka2, hasil;
    int pilih ;
    hasil = 0;

    Scanner input = new Scanner(System.in);

    System.out.println("1. penjumlahan\n2. pengurangan\n3. perkalian\n4. pembagian");
    System.out.println("pilih operasi : ");
    pilih = input.nextInt();

    System.out.println("masukkan angka ke 1 : ");
    angka1 = input.nextInt();
    System.out.println("masukkan angka ke 2 : ");
    angka2 = input.nextInt();
    


    switch (pilih) {
        case 1:
            hasil = angka1 + angka2;

            break;

        case 2:
            hasil = angka1 - angka2;
            break;

        case 3: 
            hasil = angka1 * angka2;
            break;

        case 4:
            hasil = angka1 / angka2;
            break;

        default:
            System.out.println("angka tidak valid");
            break;
            
    }
   
    System.out.println("hasil : "+hasil);    
    
}
    
}
