package Matriz;

public class Determinante {
    public static void main(String[] args) {
        // Matriz original
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        int colunaParaDuplicar = 0;
        // Nova matriz com uma coluna a mais
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int[][] novaMatriz = new int[linhas][colunas + 1];
        int novaColuna = 0;
        for (int i = 0; i < linhas ; i++) {
            for (int j = 0; j <colunas; j++) {
                novaMatriz[i][novaColuna] = matriz[i][j];
                novaColuna++;
                if (j == colunaParaDuplicar) {
                    novaMatriz[i][novaColuna] = matriz[i][j];
                    novaColuna++;
                }
            }
        }
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < novaMatriz[0].length; j++) {
                System.out.print(novaMatriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
