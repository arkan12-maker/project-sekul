package superclass2;
import java.util.Scanner;
public class Tester {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    
    System.out.println("1. Student\n2. Teacher");
    String choice = input.nextLine();

    switch (choice) {
        case "1":
                

            System.out.println("Enter name:");
            String name = input.next();

            System.out.println("Enter major:");
            String major = input.nextLine();

            System.out.println("Enter age:");
            int age = input.nextInt();

            System.out.println("Enter student number:");
            int studentNumber = input.nextInt();

            System.out.println("Enter score:");
            int score = input.nextInt();

            Student student = new Student(name, age, studentNumber, score, major);
            
            student.print();
            break;
        case "2":
            System.out.println("1. Full time\n2. Part time");
            String choice2 = input.nextLine();

            if (choice2.equals("1") ) {
                System.out.println("Enter name:");
                String name2 = input.nextLine();

                System.out.println("Enter subject:");
                String subject = input.nextLine();

                System.out.println("Enter age:");
                int age2 = input.nextInt();

                System.out.println("Enter unit:");
                String unit = input.nextLine();
               

                System.out.println("Enter anual salary:");
                int anualSalary = input.nextInt();
                
                FullTime fullTime = new FullTime(name2, age2, subject, anualSalary, unit);
                
                fullTime.print();
            }

            if (choice2.equals("2") ) {

                System.out.println("Enter name:");
                String name2 = input.nextLine();

                System.out.println("Enter subject:");
                String subject = input.nextLine();

                System.out.println("Enter age:");
                int age2 = input.nextInt();

                System.out.println("Enter hours worked:");
                int hoursWorked = input.nextInt();

                partTime partTime = new partTime(name2, age2, subject, hoursWorked);
                
                partTime.print();
            }
            break;

        default:
            break;
            

    }
}
}


