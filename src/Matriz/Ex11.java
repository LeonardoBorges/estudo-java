package Matriz;

public class Ex11 {
    public static void main(String[] args) {

            int[][] valores =
                    {{1, 2, 3},
                    {4, 5, 6}};


            int linhas = valores.length;
            int colunas = valores[0].length;
            int[][] aux = new int[colunas][linhas];

            for (int i = 0; i< linhas;i++){
                for (int j = 0; j<colunas; j++){
                    aux[j][linhas - 1 - i] = valores[i][j];

                }
            }

            for (int i=0; i < linhas; i++){
                for (int j = 0; j<colunas; j++){
                    System.out.println(aux[i][j]);

                }
            }


    }


}
