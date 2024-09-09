import java.util.Scanner;

public class musicTester {
    public static void main(String[] args) {
        
        Dvd music = new Dvd();

        // Scanner input = new Scanner(System.in);
        // System.out.println("Masukkan artis : ");
        // music.setArtist(input.nextLine());

        // System.out.println("masukkan label artis : ");
        // music.setLable(input.nextLine());

        // System.out.println("masukkan judul : ");
        // music.setName(input.nextLine());

        // System.out.println("masukkan total lagu : ");
        // music.setNumSong(input.nextInt());

        // System.out.println("masukkan harga : ");
        // music.setPrice(input.nextInt());
       
        // System.out.println("masukkan rating : ");
        // music.setRating(input.nextLine());

        // System.out.println("masukkan studio :");
        // music.setStudio(input.nextLine());
        

        // System.out.println("masukkan durasi");
        // music.setLength(input.nextInt());

        // System.out.println("masukkan jumlah : ");
        // music.setQuantity(input.nextInt());

        // System.out.println("masukkan nomor : ");
        // music.setNumber(input.nextInt());

        music.setName("Reborn "); 
        music.setArtist("lady gaga "); 
        music.setLable("Sony music "); 
        music.setNumSong(10 ); 
        music.setPrice(2000.00); 
        music.setRating("PG"); 
        music.setStudio("Newline Cinema"); 
        music.setLength(300); 
        music.setQuantity(12); 
        music.setNumber(2); 

        music.print();


    }
}
