package ujiansuperclass;

public class Rectangle extends Shape {
    private int length;
    private int width;

    
    public Rectangle() {
    
    }

    public Rectangle(String name, String color, int length, int width) {
        super(name, color);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void luas(int length, int width) {
        System.out.println("Luas: " + (length * width));
    }   

    public void print() {
        super.print();
        System.out.println("length : " + length);
        System.out.println("width : " + width);
    }

}
