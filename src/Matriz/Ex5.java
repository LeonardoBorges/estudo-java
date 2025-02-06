package Matriz;

public class Ex5 {
    public static void main(String[] args) {
        int[][] valores =
                {{1, 2, 3},
                {4, 5, 6}};
        int [][] valores2 =
                {{1,2,},
                {3,4},
                {5,6}};

        int linhasA = valores.length;
        int colunasA = valores[0].length;
        int linhasB = valores2.length;
        int colunasB = valores2[0].length;



        int[][] valores3 = new int[linhasB][colunasA];

        if (linhasB != colunasA){
            System.out.println("Não tem como fazer a multiplicação");
        } else {

            for (int i=0; i< linhasA; i++){
                for (int j=0; j<colunasB; j++){

                        valores3[i][j] = valores[i][j] * valores2[i][j];

                }
            }
            System.out.println("Matriz resultante:");
            for (int i = 0; i < linhasA; i++) {
                for (int j = 0; j < colunasB; j++) {
                    System.out.print(valores3[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
}
