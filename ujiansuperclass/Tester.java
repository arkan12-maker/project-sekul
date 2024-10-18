package ujiansuperclass;

import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Circle\n2. Rectangle");
        String choice = input.nextLine();
        System.out.println("Enter color: ");
        String color = input.nextLine();
        switch (choice) {
            case "1":
                System.out.println("Enter radius: ");
                int radius = input.nextInt();
                Circle c = new Circle("Circle", color, radius);
                c.print();
                System.out.println();
                c.luas(radius);
                break;
            case "2":
                System.out.println("Option : ");
                System.out.println("1. Rectangle\n2. Cube");
                String option = input.next();

                if (option.equalsIgnoreCase("1")) {
                    System.out.println("length : ");
                    int length = input.nextInt();
                    System.out.println("width : ");
                    int width = input.nextInt();
                    Rectangle r = new Rectangle("Rectangle", color, length, width);
                    r.print();
                    System.out.println();
                    r.luas(length, width);
                }

                if (option.equalsIgnoreCase("2")) {
                    System.out.println("length : ");
                    int length = input.nextInt();
                    System.out.println("width : ");
                    int width = input.nextInt();
                    System.out.println("height : ");
                    int height = input.nextInt();
                    Cube l = new Cube("Cube", color, length, width, height);
                    l.print();
                    System.out.println();
                    l.luas(length, width, height);
                }
                break;
            default:
                break;
        }
    }
}

