import java.util.Scanner;

public class Cd extends Product{
  

    public Cd (){
        super(); //Constructor superclass
        artist = ""; 
        lable = "";
        numSong = 0;
    }

    private String artist;
    private String lable;
    private int numSong;

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getLable() {
        return this.lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    public int getNumSong() {
        return this.numSong;
    }

    public void setNumSong(int numSong) {
        this.numSong = numSong;
    }

    public void print(){
        super.print();
        System.out.println("artist : "+artist);
        System.out.println("lable : "+lable);
        System.out.println("total song : "+numSong);
 
    }

   
}
