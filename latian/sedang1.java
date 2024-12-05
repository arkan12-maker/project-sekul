
import java.util.Scanner;



public class sedang1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hasil = 1;

        System.out.println("masukkan bilangan yang akan di faktorkan : ");
        int bil = input.nextInt();

        for (int i = 1; i <= bil; i++) {
            hasil *= i;
            if (i == 1) {
                System.out.print(i);
            } else {
                System.out.print(" x " + i);
            }
    }
    System.out.println(" = hasil faktorial dari " + bil + " adalah " + hasil);
}
}
