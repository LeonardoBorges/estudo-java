package Matriz;

public class Ex1 {
    public static void main(String[] args) {
        int[][]valores = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

            for (int i=0; i < 3; i++){
                for (int j = 0; j<3; j++){
                    System.out.println(valores[i][j]);

                }
            }
    }
}
