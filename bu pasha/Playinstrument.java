public class Playinstrument {
    public static void main(String[] args) {
        Instrument a = new Instrument(120.2, "Guitar");
        Instrument b = new Instrument(120.3, "Violin");
        Instrument c = new Instrument(120.4, "Piano");

       a.print();
       b.print();
       c.print();
    }
}
