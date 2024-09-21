// package superClass;

import java.util.Scanner;
public class Product {
    private String name;
    private double price;
    private int quantity;
    private int number;

    public Product() {
        number = 0;
        name = "";
        price = 0.0;
        quantity = 0;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public int getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public int getNumber() {
        return this.number;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
    
    public void print() {
        System.out.println("");
        System.out.println("-----------------------"); 
        System.out.println("name     : "+name);
        System.out.println("price    : "+price);
        System.out.println("quantity : "+quantity);
        System.out.println("number   : "+number);
    }
}

