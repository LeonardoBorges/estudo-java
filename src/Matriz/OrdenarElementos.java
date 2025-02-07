package Matriz;

import java.util.Arrays;

public class OrdenarElementos {
    public static void main(String[] args) {
        int[][]valores = {
                {9,6,2},
                {1,4,8},
                {5,3,7}
        };

        int linhas = valores.length;
        int colunas = valores[0].length;
        int[] armazem = new int[linhas * colunas];
        int index = 0;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                armazem[i* colunas +j]= valores[i][j];
            }
        }

        Arrays.sort(armazem);

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                valores[i][j] = armazem[index];
                index++;
                System.out.print(valores[i][j] + " ");
            }
            System.out.println();
        }


    }
}
