package Matriz;

public class Ex7 {
    public static void main(String[] args) {
        int[][]valores = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int linhas = valores.length;
        int k = valores.length - 1;
        int somaDS = 0;
        int somaDP = 0;

        for (int i = 0; i < linhas; i++){
            somaDP = somaDP + (valores[i][i]);
            somaDS = somaDS + (valores[i][k - i]);

        }

        System.out.println(somaDP);
        System.out.println(somaDS);
    }
}
