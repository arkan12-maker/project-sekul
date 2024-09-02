public class Instrument {
   String type;
   Double price;
   
   public Instrument (Double p, String t){
    price = p;
    type = t;
   }

   public void print(){
    System.out.println("tipe : "+type);
    System.out.println("harga : "+price);
    
   }
}
