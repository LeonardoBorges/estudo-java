package Metodos;

import java.util.Arrays;

public class Ex4 {

    public double[] calcularMediaMovel(double[] precos, int intervalo){
            int quantidadeMedias = precos.length - intervalo + 1;
            double[] medias = new double[quantidadeMedias];

            for (int i = 0; i < quantidadeMedias; i++) {
                double soma = 0;
                for (int j = 0; j < intervalo; j++) {
                    soma += precos[i + j];
                }
                medias[i] = soma / intervalo;
            }

            return medias;
        }
}


