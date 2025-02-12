package Metodos;

public class Ex7 {

    public double simularCarteira(double[] ativos, double[] retornos){
        double total = 0;
        for (int i = 0; i < ativos.length; i++) {
            total = total + (ativos[i] + (ativos[i] * retornos[i]));
        }

        return total;
    }
}
