import java.util.Scanner;
public class soalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan jumlah genre buku : ");
        String jumlah = input.nextLine();
        
        int jumlahreal = Integer.parseInt(jumlah);
        String genre[] = new String[jumlahreal];
        
        String jumlahdummy;
        int jumlahbuku[] = new int[jumlahreal];
        
        
        for (int i = 0; i < genre.length; i++) {
            System.out.println("Genre "+(i+1)+" : ");
            genre[i] = input.nextLine();
            System.out.println("Jumlah "+genre[i]+" : ");
            jumlahdummy = input.nextLine();
            jumlahbuku [i] = Integer.parseInt(jumlahdummy);
        }
        System.out.println();
        System.out.println("==Jumlah buku==");
        System.out.println("");
        for (int i = 0; i < genre.length; i++) {
            System.out.println(genre[i]+" = "+jumlahbuku[i]);
        }  
    }
}
