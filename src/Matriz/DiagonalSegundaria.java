package Matriz;

public class DiagonalSegundaria {
    public static void main(String[] args) {

        int[][]valores = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int linhas = valores.length;
        int k = valores.length - 1;

        for (int i = 0; i < linhas; i++){
            System.out.println(valores[i][k - i]);
        }

    }
}
