package Metodos;

import java.util.Scanner;

public class Ex8Debug {
    public static void main(String[] args) {
        double p =25000, r = 5.0/100, valorJuros = 0, amortizacao = 0;
        int n = 10;
        double   pmt = (p * r) / (1-(Math.pow((1+r), -n)));
        Object[][] matriz = new Object[12][5];
        Scanner sc = new Scanner(System.in);

        /*
        numParcelas
        saldoDevAntes
        valorJuros
        amortizacao
        saldoDevDps
         */

        for (int i = 0; i < matriz[0].length; i++) {
            matriz[0][i] = sc.next();
        }

        for (int i = 1; i <n+1 ; i++) {
            valorJuros = p * r;
            amortizacao = pmt - valorJuros;
            double saldoDevAntes = p;
            p = p-amortizacao;
            for (int j = 0; j < matriz[0].length ; j++) {
                switch (j) {
                    case (0):
                        matriz[i][j] = i;
                        break;
                    case (1):
                        matriz[i][j] = saldoDevAntes;
                        break;
                    case (2):
                        matriz[i][j] = valorJuros;
                        break;
                    case (3):
                        matriz[i][j] = amortizacao;
                        break;
                    case (4):
                        matriz[i][j] =p;
                        break;
                }
            }
        }

        // Exibindo a matriz
        for (Object[] linha : matriz) {
            for (Object elemento : linha) {
                System.out.print((elemento != null ? elemento : "") + "\t");
            }
            System.out.println(); // Quebra de linha após cada linha
        }
    }
}
