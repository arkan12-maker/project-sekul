
import java.util.Random;
import java.util.Scanner;
public class sedang3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int hasil = 0;
        int jawabanbenar = 0;
        int totaljawaban = 0;
        int skor = 0;

        String [] operator = {"+", "-", "x", "%", "/"};

        int bil1 = random.nextInt(20) + 1;
        int bil2 = random.nextInt(20) + 1;

        int op = random.nextInt(operator.length);
        while (true) { 
            switch (operator[op]) {
                case "+":
                    hasil = bil1 + bil2; 
                    break;
                case "-":
                    hasil = bil1 -bil2; 
                    break;
                case "x":
                    hasil = bil1 * bil2; 
                    break;
                case "%":
                    hasil = bil1 % bil2;  
                    break;
                case "/":
                    hasil = bil1 / bil2; 
                    break;
                default:
                    break;
            }
    
            System.out.println(bil1 + " " + operator[op] + " " + bil2);
    
            System.out.println("masukkan hasil");
            int jawab = input.nextInt();
            totaljawaban++;
    
            if (hasil == jawab) {
             
                jawabanbenar++;       
                System.out.println("benar");
            } else {
                System.out.println("salah");
            }
            System.out.println("hasil yang benar adalah " + hasil);
            System.out.println("lanjutkan ? (y/n)");
            String lanjut = input.next();
            if (lanjut.equals("y")) {
                boolean lanjutkan = true;
                 bil1 = random.nextInt(20) + 1;
                 bil2 = random.nextInt(20) + 1;
                 op = random.nextInt(operator.length);
                
            }else {
                boolean lanjutkan = false;
                break;
            }

            skor = jawabanbenar*10;
        }
        System.out.println("jumlah soal yang dijawab = " + totaljawaban);
        System.out.println("--------------------------------------------");
        System.out.println("jumlah soal yang dijawab benar = " + jawabanbenar);
        System.out.println("--------------------------------------------");
        System.out.println("total skor = " + skor);
        System.out.println("terimakasih sudah menjawab quiz" );

        
    
    }
}



