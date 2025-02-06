package Matriz;

public class Ex4 {
    public static void main(String[] args) {
        int[][] valores =
                {{1, 2, 3},
                        {4, 5, 6}
                };


        int linhas = valores.length;
        int colunas = valores[0].length;
        int[][] transposta = new int[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta[j][i] = valores[i][j];
            }
        }

        // Exibir a matriz transposta
        System.out.println("Matriz Transposta:");
        for (int i = 0; i < transposta.length; i++) {
            for (int j = 0; j < transposta[i].length; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
