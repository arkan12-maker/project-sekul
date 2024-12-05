import java.util.Scanner;
public class mudah2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukkan bilangan : ");
        int bil = input.nextInt();

        if (bil % 2 == 0) {
            System.out.println("bilangan" + bil + " adalah genap");
        } else {
            System.out.println("bilangan" + bil + " adalah ganjil");
        }
    }
}
