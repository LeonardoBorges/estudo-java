package Matriz;

public class Ex9 {
    public static void main(String[] args) {
        double[][]valores = {
                {2.0,4.0,6.0},
                {8.0,10.0,12.0}
        };
        int linhas = valores.length;
        int colunas = valores[0].length;
        double aux = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (valores[i][j] > aux){
                    aux = valores[i][j];
                }
            }
        }
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                valores[i][j]= valores[i][j]/ aux;
            }
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(valores[i][j] + " ");
            }
            System.out.println();
        }
    }
}
