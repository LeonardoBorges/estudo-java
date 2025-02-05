package Vetores;

import java.util.Scanner;

public class Drawdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dias = 10;
        double[] precos = new double[dias];
        double[] drawdown = new double[dias];
        double maiorPreco = 0;
        double maiorDrawdown = 0;


        for (int i= 0; i < 10; i++){
            System.out.println("Digite o valor " + (i + 1));
            precos[i] = sc.nextDouble();

            maiorPreco = Math.max(maiorPreco, precos[i]);
            if (i>0){
                drawdown[i] = ((precos[i] - maiorPreco) / maiorPreco)*100;
            }

            maiorDrawdown = Math.min(maiorDrawdown, drawdown[i]);
        }

        System.out.println("Drawdown: " + maiorDrawdown);

    }
}
