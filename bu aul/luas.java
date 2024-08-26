import java.util.Scanner;

/**
 * panjang
 */
public class luas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang, lebar, luas;
                
            System.out.println("hitung luas persegi panjang ");
            System.out.println("masukkan panjang ");
            panjang = input.nextInt();
            System.out.println("masukkan lebar ");
            lebar = input.nextInt();
            
            luas=panjang*lebar;
            System.out.println("luas persegi panjang adalah "+luas);
    }
}