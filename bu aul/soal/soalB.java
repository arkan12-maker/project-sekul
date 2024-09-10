package soal;
import java.util.Scanner;

public class soalB {
    public static void main(String[] args) {
        int jam;
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan jam parkir anda : ");
        jam = input.nextInt();

        if (jam >=0 && jam <=1){ 
            System.out.println("total biaya parkir sebesar : Rp.5000");
        }else if(jam >= 2 ){
            System.out.println("total biaya parkir sebesar : Rp.8000");
        }else if (jam >=2 && jam <=4){
            System.out.println("total biaya parkir sebesar : Rp.12000");
        }else {
            System.out.println("total biaya parkir sebesar : Rp.20000");
        }
        input.close();
        
    }
}
