package Vetores;

import java.util.Scanner;

public class MenorMaior {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dias = 10;
        double[] precos = new double[dias];
        double media= 0;
        double aux1 = Double.MIN_VALUE;;
        int[] aux2 = new int[1];

        for (int i= 0; i < 10; i++){
            System.out.println("Digite o valor do imovel " + i);
            precos[i] = sc.nextDouble();
        }

        for (int i = 0; i < 10; i++) {
            if (precos[i] > aux1) {
                aux1 = precos[i];
                aux2[0] = i;
            }
        }
        System.out.println("Maior: " + aux1);
    }
}
