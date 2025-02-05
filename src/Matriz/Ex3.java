package Matriz;

import java.util.SortedMap;

public class Ex3 {
    public static void main(String[] args) {
        int[][] valores =
                {{1,2,3},
                {4,5,6},
                {7,8,9}};

        int somaDiagonal = 0;
        for (int i=0; i < 3 ; i++){
            for (int j = 0; j<3; j++){
                if(j==i){
                    somaDiagonal = somaDiagonal + valores[i][j];
                }
            }
        }

        System.out.println(somaDiagonal);
    }
}
