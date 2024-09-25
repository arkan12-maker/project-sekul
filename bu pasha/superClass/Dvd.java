public class Dvd extends Product {
    private int length;
    private String rating;
    private String studio;

    public Dvd() {
        super();
        length = 0;
        rating = "";
        studio = "";
    }

    public Dvd(int number, String name, double price, int quantity, String rating, int length, String studio) {
        super();
        length = length;
        rating = rating;
        studio = studio;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public void print(){
        super.print();
        System.out.println("length : "+length);
        System.out.println("rating : "+rating);
        System.out.println("studio : "+studio);
        System.out.println("------------------------");
    }

}
