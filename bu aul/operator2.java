public class operator2 {
    public static void main(String[] args) {
        
        int melati= 10, mawar= 10;
        double harga;
        harga = 4500.5;
        double bayar, total;

        boolean mela, mawa;

        // stok berkurang
        melati -= 5;
        mawar -= 5;

        total=mawar+melati;
        bayar = harga*total;

        System.out.println("jumlah barang dibeli = "+mawar+"+"+melati+"= "+total);
        System.out.println("jumlah yang harus dibayar = Rp."+bayar);
        
       
    }
}
