package matriz;

public class matriz1 {

    public static void main(String[] args) {

        int[] vector = {1, 2, 4};
        int[][] matriz = {
            {5, 6, 9}, //Agrupa vectores
            {1, 2, 3}
        };

        int[][][] cubo = {
            {{5, 6, 9}, {1, 2, 3}}, //Agrupa matrices (planos)
            {{7, 2, 4}, {5, 2, 4}}
        };

        System.out.println("RECORRER VECTOR");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + "  ");
        }

        System.out.println();

        System.out.println("RECORRER MATRIZ");
        for (int i = 0; i < matriz.length; i++) {             // 0      1      2
            for (int j = 0; j < matriz[0].length; j++) {      // 0 1 2  0 1 2  0 1 2
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("RECORRER CUBO");

        for (int i = 0; i < cubo.length; i++) {                //0     1
            for (int j = 0; j < cubo[0].length; j++) {         //0     1
                for (int k = 0; k < cubo[0][0].length; k++) {  //0 1 2 0 1 2
                    System.out.print(cubo[i][j][k] + "  ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("MATRIZ NO SIMETRICA");
        int[][] x = {{1}, {1, 2, 3}, {1, 2, 3, 4, 5}};
        for (int f = 0; f < x.length; f++) {
            for (int c = 0; c < x[f].length; c++) {
                System.out.print(x[f][c] + "\t");
            }
            System.out.println();
        }
        /*
        f = 0
        Cuantas columnas tiene la fila cero x[0].length = 1
         */
        System.out.println("CUBO NO SIMETRICO");
        int[][][] cubo1 = {
            {{5}, {1, 2, 3}}, //Agrupa matrices (planos)
            {{7, 2}, {5, 2, 4}}
        };

        for (int i = 0; i < cubo1.length; i++) {                //0     1
            for (int j = 0; j < cubo1[i].length; j++) {         //0     1
                for (int k = 0; k < cubo1[i][j].length; k++) {  //0 1 2 0 1 2
                    System.out.print(cubo1[i][j][k] + "  ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
