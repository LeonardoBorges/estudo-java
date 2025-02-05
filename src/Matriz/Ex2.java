package Matriz;

public class Ex2 {
    public static void main(String[] args) {
        int[][] valores =  {
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12}
        };

        int somaTotal=0;
        int somaLinhas = 0;
        int somaColunas = 0;

        for (int i=0; i <4 ; i++){
            for (int j = 0; j<4 ; j++){

                somaColunas = somaColunas + valores[j][i];
                somaLinhas =  somaLinhas + valores[i][j];
            }


        }
        somaTotal = somaColunas + somaLinhas;
    }
}
