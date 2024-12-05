package latihanukl;
import java.util.Scanner;

public class susah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [][] data = {{"1", "Galuh","sawojajar","1", "1000"  },
                            {"2","Indro", "Blimbing", "2", "1500"},
                            {"3","Jedi", "lowokwaru", "3", "3000"},
                            {"4","Kanu", "klojen", "2", "1500" }};
       

        System.out.println("masukkan id : ");
        String id = input.nextLine();
        System.out.println("masukkan jumlah kwh :");
        int kwh = input.nextInt();

        Double hr = Double.parseDouble(String.valueOf(data[0][4]));
        Double hr1 = Double.parseDouble(String.valueOf(data[1][4]));
        Double hr2 = Double.parseDouble(String.valueOf(data[2][4]));
        Double hr3 = Double.parseDouble(String.valueOf(data[3][4]));

        if (id.equalsIgnoreCase("1")) {
            System.out.println();
            System.out.println("---------------------");
            System.out.println("id : " + data[0][0]);
            System.out.println("nama : " + data[0][2]);
            System.out.println("golongan : " + data[0][3]);
            System.out.println("alamat : " + data[0][1]);
            System.out.println("jumlah kwh : " + kwh);
            System.out.println("harga per kwh : " + hr);
            System.out.println("total : " + hr * kwh);
            System.out.println("---------------------");    
            System.out.println();
        }

        if (id.equalsIgnoreCase("2")) {
            System.out.println();
            System.out.println("---------------------");
            System.out.println("id : " + data[1][0]);
            System.out.println("nama : " + data[1][2]);
            System.out.println("golongan : " + data[1][3]);
            System.out.println("alamat : " + data[1][1]);
            System.out.println("jumlah kwh : " + kwh);
            System.out.println("harga per kwh : " + hr1);
            System.out.println("total : " + hr1 * kwh);
            System.out.println("---------------------");    
            System.out.println();
        }

        if (id.equalsIgnoreCase("3")) {
            System.out.println();
            System.out.println("---------------------");
            System.out.println("id : " + data[2][0]);
            System.out.println("nama : " + data[2][2]);
            System.out.println("golongan : " + data[2][3]);
            System.out.println("alamat : " + data[2][1]);
            System.out.println("jumlah kwh : " + kwh);
            System.out.println("harga per kwh : " + hr2);
            System.out.println("total : " + hr2 * kwh);
            System.out.println("---------------------");    
            System.out.println();
            
        }

        if (id.equalsIgnoreCase("4")) {
            System.out.println();
            System.out.println("---------------------");
            System.out.println("id : " + data[3][0]);
            System.out.println("nama : " + data[3][2]);
            System.out.println("golongan : " + data[3][3]);
            System.out.println("alamat : " + data[3][1]);
            System.out.println("jumlah kwh : " + kwh);
            System.out.println("harga per kwh : " + hr3);
            System.out.println("total : " + hr3 * kwh);
            System.out.println("---------------------");    
            System.out.println();
            
        }

        
    }
}
