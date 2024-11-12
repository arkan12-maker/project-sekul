public class arrayMultidimension {
    public static void main(String[] args) {

        int[][] matriksA = {{1, 2, 3}, {4, 5, 6}};
        int[][] matriksB = {{7, 8, 9}, {10, 11, 12}};
        int[][] matriksC = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matriksC[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriksC[i][j] + " ");
            }
            System.out.println();
        }
    
       
    }
}

