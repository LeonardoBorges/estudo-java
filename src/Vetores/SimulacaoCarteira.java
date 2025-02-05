package Vetores;

import java.util.Arrays;
import java.util.Scanner;

public class SimulacaoCarteira {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dias =5;
        double[] carteira= new double[dias];
        double[] percentual = new double[dias];
        double total = 0;

        for (int i= 0; i < dias; i++){
            System.out.println("Digite total investido da acao " + i);
            carteira[i] = sc.nextDouble();

            total+=carteira[i];
        }
        for (int i= 0; i < dias; i++){
            percentual[i] = (carteira[i]/total) * 100;
        }

        System.out.println("Carteira: " +  Arrays.toString(carteira));
        System.out.println("Percentual: " + Arrays.toString(percentual));
    }
}
