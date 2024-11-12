package superclass2;
import java.util.Scanner;
public class testerArray {
    public static void main(String[] args) {   
        
        Scanner in = new Scanner(System.in);

        System.out.println("mau masukkan berapa data");
        int data = in.nextInt();
        System.out.println();

        System.out.println("pilihan : ");
        System.out.println();
        System.out.println("1. Person\n2. Student\n3. Teacher");

        int pilihan = in.nextInt();
        System.out.println();
        
        Person p[] = new Person[20];

       

      
       
        for (int i = 1; i <= data; i++) {
            switch (pilihan) {
                case 1:
                System.out.println("masukkan nama : ");
                String name = in.next();
                System.out.println("masukkan umur : ");
                int age = in.nextInt();
                p[0] = new Person(name, age);
                p[0].print();
                break;
            
                case 2:
                    System.out.println("masukkan nama : ");
                    String name2 = in.next();
                    System.out.println("masukkan umur : ");
                    int age2 = in.nextInt();
                    System.out.println("masukkan number : ");
                    int studentNumber = in.nextInt();
                    System.out.println("masukkan score : ");
                    int score = in.nextInt();
                    System.out.println("masukkan major : ");
                    String major = in.next();
                    p[1] = new Student(name2, age2, studentNumber, score, major);
                    p[1].print();
                    
                    break;
    
                case 3:
                    System.out.println("masukkan nama : ");
                    String name3 = in.next();
                    System.out.println("masukkan umur : ");
                    int age3 = in.nextInt();
                    System.out.println("masukkan subject : ");
                    String subject = in.next();
                   
                    p[2] = new Teacher(name3, age3, subject );
                    p[2].print();
    
                  
                    
                default:
                    break;
        }
       
        }
    }
}

