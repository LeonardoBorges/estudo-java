package Matriz;

public class Ex8 {
    public static void main(String[] args) {
        int[][]valores = {
                {1,0,0},
                {0,1,0},
                {0,0,1}
        };

        int linhas = valores.length;
        int cont = 0;
        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < linhas; j++) {
            if ( valores[i][i] == 1 && valores[i][j] != 0 ){
                cont++;
            }

            }
        }

        if (cont == valores.length){
            System.out.println("Matriz identidade");
        } else {
            System.out.println("Matriz não identidade");
        }

    }
}
