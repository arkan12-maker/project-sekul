public class Instrument {
   private String type;
   private Double price;

   public String getType() {
      return this.type;
   }

   public void setType(String type) {
      this.type = type;
   }

   public Double getPrice() {
      return this.price;
   }

   public void setPrice(Double price) {
      this.price = price;
   }
   
   public Instrument (Double p, String t){
    price = p;
    type = t;
   }

   
   public void print(){
    System.out.println("tipe : "+type);
    System.out.println("harga : "+price);
    
   }
}
