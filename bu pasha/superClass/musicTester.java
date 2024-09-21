import java.util.Scanner;

public class musicTester {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("berapa jumlah objek yang di input ");
        System.out.println("note : objek yang di input tidak boleh lebih dari 10 dan kurang dari 1 ");
        System.out.println("");
        
       
        try {
            System.out.println("input objek : ");
            int limit = input.nextInt();
            if (limit > 10 || limit < 1) {
            System.out.println("objek tidak memenuhi kriteria");
            } else {
                try {
                    for(int p=1; p<=limit; p++){
                            System.out.println("pilihan :\n1. Cd\n2. Dvd");
                            int pilihan = input.nextInt();
                
                            switch (pilihan){
                                case 1:
                                    Cd c = new Cd();
                                    c.print();
                                    break;
                
                                case 2:
                                    Dvd d = new Dvd();
                                    d.print();
                                    break;
                
                                default:
                                    break;
                        }
                    }
                } catch (Exception e) {
                    System.out.println("tipe data yang di input tidak valid");
                }
            }
        
        } catch (Exception e) {
           System.out.println("tipe data yang di input tidak valid");
        }
        
           
        }

       
    }
