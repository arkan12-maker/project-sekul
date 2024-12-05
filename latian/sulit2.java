
import java.util.Scanner;

public class sulit2{
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      int [] angka = new int[12];
      boolean duplikat = false;
      int duplikats = 0;

      for(int i = 1; i < 11; i++){
        System.out.println("masukkan angka ke - "+i);
        angka[i] = input.nextInt();
      }

    System.out.println();
     if(duplikat == true){
      System.out.println("elemen duplikat :");
    
    }
     
    
     for(int j = 1; j < angka.length; j++){
      for(int k = j + 1; k < angka.length; k++){
        if(angka[j] == angka[k]){
          duplikats += angka[j];
          System.out.print(angka[j]+" ");
          duplikat = true;
      }else{
        duplikat = false;
      }

    }
   
}

  if(!duplikat){
  System.out.println("tidak ada elemen yang duplikat");


}
}
}




