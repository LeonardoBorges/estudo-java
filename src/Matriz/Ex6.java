package Matriz;

public class Ex6 {
    public static void main(String[] args) {
        int[][]valores = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int p = 8;

        for (int i=0; i < 3; i++){
            for (int j = 0; j<3; j++){
                if (valores[i][j] == p) {
                    System.out.printf("Numero encontrado na posicao: \n linha = %d e coluna = %d", i, j);
                }

            }
        }
    }
}
