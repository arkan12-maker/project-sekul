import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        Product p = new Product();

        System.out.println("pilih objek :\n1. Cd\n2. Dvd");
        int pilihan = input.nextInt();

        // System.out.println("input number : ");
        // int number = input.nextInt();

        // System.out.println("input quantity : ");
        // int quantity = input.nextInt();

        // System.out.println("input price : ");
        // double price = input.nextDouble();

        // System.out.println("input nama : ");
        // String name = input.nextLine();

      

        // switch (pilihan) {
        //     case 1:
        //         System.out.println("Artist : ");
        //         String artist = input.nextLine();
        
        //         System.out.println("Lable : ");
        //         String lable = input.nextLine();
        
        //         System.out.println("Total Song : ");
        //         int numSong = input.nextInt();
        
        //         Cd c = new Cd(number, name, price, quantity, artist, lable, numSong);
        //         c.print();
        //         break;
        //     case 2:
        //         System.out.println("input length : ");
        //         int length = input.nextInt();
        
        //         System.out.println("input rating : ");
        //         String rating = input.nextLine();
        
        //         System.out.println("input studio : ");
        //         String studio = input.nextLine();
        
        //         Dvd d = new Dvd(number, name, price, quantity, rating, length, studio);
        //         d.print();
        //     default:
        //         break;
        // }
   

     
 

        input.nextLine();

        switch (pilihan) {
            case 1:
                Cd c = new Cd();

                
                System.out.println("input nama : ");
                c.setName(input.nextLine());

                System.out.println("input number : ");
                c.setNumber(input.nextInt());
       
                System.out.println("input quantity : ");
                c.setQuantity(input.nextInt());

                System.out.println("input price : ");
                c.setPrice(input.nextDouble());

                input.nextLine();

                System.out.println("input artist : ");
                c.setArtist(input.nextLine());

                System.out.println("input lable : ");
                c.setLable(input.nextLine());

                System.out.println("input numSong : ");
                c.setNumSong(input.nextInt());

                c.print();
                break;
                
            case 2:
                Dvd d = new Dvd();

                
                System.out.println("input nama : ");
                d.setName(input.nextLine());

                System.out.println("input number : ");
                d.setNumber(input.nextInt());
       
                System.out.println("input quantity : ");
                d.setQuantity(input.nextInt());

                System.out.println("input price : ");
                d.setPrice(input.nextDouble());

                input.nextLine();

                System.out.println("input rating : ");
                d.setRating(input.nextLine());

                System.out.println("input studio : ");
                d.setStudio(input.nextLine());

                System.out.println("input length : ");
                d.setLength(input.nextInt());

                d.print();
                break;
            default:
                System.out.println("objek tidak ada");
                break;
        }
       input.close();
    }
}

