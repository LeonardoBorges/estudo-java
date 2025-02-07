package MaratonaMatriz;

public class MaratonaMatriz {
    public static void main(String[] args) {
        int idade = 30;
        double p = 1000.0;
        int r = 6/12;
        int idadeAposentaroria = 65;
        int n = idadeAposentaroria - idade;
        int meses = n* 12;
        double[][] matrizJuros = new double[4][n];
        int linhas = matrizJuros.length;
        int colunas = matrizJuros[0].length;
        int tx = 4;

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


    }
}
