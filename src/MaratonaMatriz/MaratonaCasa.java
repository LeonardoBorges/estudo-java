package MaratonaMatriz;

import java.util.Arrays;
import java.util.Scanner;

public class MaratonaCasa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade  = 30;
        double p = 1000.0;
        double txAnual  = 6.0;
        double r =  (txAnual/100)/12;
        int idadeAposentatoria = 65;
        int n =  (idadeAposentatoria - idade) *12;
        double[] saldoAnos = new double[idadeAposentatoria - 30];
        double s = 0;
        double[][] matrizJuros = new double[4][n];
        int linhas = matrizJuros.length;
        int colunas = matrizJuros[0].length;
        int meses = 12;
        double tx = 4;

        for (int i = 0; i <linhas ; i++) {
            matrizJuros[i][0] = tx;
            tx+=2;
        }
        // exer1
        for (int i = 0; i < saldoAnos.length; i++) {

            saldoAnos[i] = p *(((Math.pow(1+r, meses))-1)/r);
            meses+=12;

            for (int j = 0; j <colunas ; j++) {
                double taxa = ((matrizJuros[i][0]/100)/12);
                matrizJuros[i][j] = p * ((Math.pow(1 + taxa, (j+1) *12)) - 1)/ taxa;
            }

        }

        System.out.println("Saldo final estimado:");
        for (int i = 0; i < linhas; i++) {
            System.out.printf("- Com taxa de %.0f%%: R$ %,.2f%n",
                    matrizJuros[i][0],
                    matrizJuros[i][colunas-1]);
        }




        /*
        //exer 2

        for (int i = 0; i <linhas ; i++) {
            matrizJuros[i][0] = tx;
            tx+=2;
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 1; j < colunas; j++) {
                double taxa = matrizJuros[i][0];  // Taxa de juros anual
                matrizJuros[i][j] = p * (Math.pow(1 + (taxa/100), (j+1) *12)) - 1/ (taxa/100.0);
            }
        }


        System.out.println("Saldo final estimado:");
        for (int i = 0; i < linhas; i++) {
            System.out.printf("- Com taxa de %.0f%%: R$ %,.2f%n",
                    matrizJuros[i][0],
                    matrizJuros[i][colunas-1]);
        }

         */

    }
}
