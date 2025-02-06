package Matriz;

public class Ex10 {
    public static void main(String[] args) {
        int[][] valores =
                {{1,2,3},
                {4,5,6},
                {7,8,9}};

        int linhas = valores.length;
        int colunas = valores[0].length;
        int[][] transposta = new int[colunas][linhas];
/*
        for (int i = 0; i < linhas; i++) {
            for (int j = colunas - 1; j >=0; j--) {
                transposta[i][(colunas-1)-j] = valores [j][i];
            }
        }

 */

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j <colunas; j++) {
                transposta[i][j] = valores[colunas -1 - j][i];
            }

        }
        System.out.println("Matriz rodacionada:");
        for (int i = 0; i < transposta.length; i++) {
            for (int j = 0; j < transposta[i].length; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
