package Metodos;

import java.util.Arrays;
import java.util.Random;

public class Ex10 {
    public double[] simularPrecoMonteCarlo(double preco, double media, double volatilidade, int periodos){
        double[] precosSimulados = new double[periodos];
        Random gau = new Random();
        precosSimulados[0] = preco;

        for (int i = 1; i < periodos ; i++) {
            double z= gau.nextGaussian();
            precosSimulados[i] = precosSimulados[i-1] * (Math.exp(z*(media+volatilidade)));
        }

        return precosSimulados;
    }

}
