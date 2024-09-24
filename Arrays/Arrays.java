package Arrays;

public class Arrays {
    public static void main(String[] args) {
        // ARRAYS UNIDIMENSIONAIS (VETORES)
        int[] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 15;
        numeros[2] = 20;
        numeros[3] = 25;
        numeros[0] = 5;
        numeros[4] = 30;

        // Exibindo os valores do array unidimensional        
        for(int i = 0; i < numeros.length; i++) { 
            System.out.println(numeros[i]);
        }

        // ARRAYS BIDIMENSIONAIS (MATRIZES)
        int[][] matriz = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Exbindo os valores do array bidimensional
        for(int i = 0; i < matriz.length; i++) {
            System.out.print("[");
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("]");
        }
    }
}