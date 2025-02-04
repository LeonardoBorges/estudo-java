package Vetores;

import java.util.Scanner;

public class DiasAltaQueda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dias = 10;
        double[] precos = new double[dias];
        double aux1 = 0;
        double aux2 = 0;


        for (int i= 0; i < dias; i++){
            System.out.println("Digite o preço " + i);
            precos[i] = sc.nextDouble();

            if(i == 0 ){
                System.out.println("Dias alta 0:" + aux1);
                aux1++;
            } else if (precos[i] > precos[i -1]) {
                System.out.println("Dias alta:" + aux1);
                aux1++;
            } else {
                aux2++;
            }

        }

        System.out.println("Dias alta:" + aux1);



    }
}
