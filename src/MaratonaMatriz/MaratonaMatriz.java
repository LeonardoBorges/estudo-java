package MaratonaMatriz;

import java.util.Arrays;

public class MaratonaMatriz {
    public static void main(String[] args) {
        int idade = 30;
        double p = 1000.0;
        double r = 6.0/100/12;
        int idadeAposentaroria = 65;
        int n = idadeAposentaroria - idade;
        int meses = n* 12;
        double[][] matrizJuros = new double[4][n+1];
        int linhas = matrizJuros.length;
        int colunas = matrizJuros[0].length;
        double tx = 4;
        double[] rendaMensal = new double[4];
        for (int i = 0; i <linhas ; i++) {
            matrizJuros[i][0] = tx;
            tx+=2;
        }
        System.out.println();
        System.out.println("Simulação de Previdencia Privada");
        System.out.println("Idade atual: " +  30 + " anos");
        System.out.println("Contribuição mensal R$ " + p);
        System.out.println("Taxa de juros anual esperada: 6%");
        System.out.println("Idade desejada para aposentadoria: " + idadeAposentaroria + " anos");




        for (int i = 0; i < linhas; i++) {
            for (int j = 1; j < colunas; j++) {
                double taxa = ((matrizJuros[i][0]/100)/12);  // Taxa de juros anual
                    matrizJuros[i][j] = p * ((Math.pow(1 + taxa, (j) *12)) - 1)/ taxa;

            }
        }

        System.out.println();
        System.out.println("Saldo final estimado:");
        for (int i = 0; i < linhas; i++) {
            System.out.printf("- Com taxa de %.0f%%: R$ %,.2f%n",
                    matrizJuros[i][0],
                    matrizJuros[i][colunas-1]);
        }

        System.out.println();
        System.out.println("Renda mensal estimada para 20 anos de aposentadoria:");
        int m = 20;
        for (int i = 0; i < linhas; i++) {
            double result =  matrizJuros[i][colunas -1] * (r/(1-(Math.pow((1+r),-m*12))));
            System.out.printf(" %.0f%%: = R$ %,.2f%n", matrizJuros[i][0], result  );



        }
    }
}
