package Vetores;
import java.util.Arrays;import java.util.Arrays;


public class PrevisaoJuros {
    public static void main(String[] args) {
        int meses =  6;
        double valorInicial = 1000.0;
        double[] valorFuturo = new double[meses];
        double taxa = 2.0/100;

        for (int i= 0; i < meses; i++){
            valorFuturo[i] = valorInicial * Math.pow((1+taxa),i+1);
        }

        System.out.println( Arrays.toString(valorFuturo));

    }
}
