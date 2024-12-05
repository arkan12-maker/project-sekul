
import java.util.Scanner;

public class sulit3{
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      int [] angka = new int[12];
      boolean duplikat = false;

      for(int i = 1; i < 11; i++){
        System.out.println("masukkan angka ke - "+i);
        angka[i] = input.nextInt();
      }
      for(int i = 1; i < angka.length; i++){
          int freq = 1;
          boolean hitung = false;

        for(int k = 1; k < i; k++){
            if (angka[i] == angka[k]) {
                hitung = true;
                break;
            }
        }
        if (!hitung) {
            for (int j = i + 1; j < angka.length; j++) {
                if (angka[i] == angka[j]) {
                    freq++;
                }

            }
            if (freq > 1) {
                System.out.println("angka " + angka[i] + " muncul sebanyak " + freq + " kali");
                duplikat = true;
            }
        } 
    }
   

    
    
    
    

    }
}






