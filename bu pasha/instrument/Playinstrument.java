public class Playinstrument {
    public static void main(String[] args) {
        Instrument a = new Instrument(120.2, "Guitar");
        Instrument b = new Instrument(120.3, "Violin");
        Instrument c = new Instrument(120.4, "Piano");
        
        a.setType("Guitar"); 
        a.setPrice(120.2);

        b.setType("Violin");            
        b.setPrice(120.3);

        c.setType("Piano");
        c.setPrice(120.4);
        
    
        a.print();
        b.print();
        c.print();
        System.out.println("");

        if (a.getPrice() > b.getPrice() && a.getPrice() > c.getPrice()) {
            System.out.println("harga paling mahal adalah gitar");
        } else if (b.getPrice() > a.getPrice() && b.getPrice() > c.getPrice()) {
            System.out.println("harga paling mahal adalah violin");
        } else {
            System.out.println("harga paling mahal adalah piano");
        }

        if (a.getPrice() < b.getPrice() && a.getPrice() < c.getPrice()) {
            System.out.println("harga paling murah adalah gitar");
        } else if (b.getPrice() < a.getPrice() && b.getPrice() < c.getPrice()) {
            System.out.println("harga paling murah adalah violin");
        } else {
            System.out.println("harga paling murah adalah piano");
        }
    }
}
