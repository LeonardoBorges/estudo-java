package Exercicios;
public class Ex4 {

    public String calcularPorcen(double valor, double media){
        double porcen = valor - media;
        porcen = Math.abs(porcen);

        double resultado = (porcen * 100)/media;

        if (valor > media) {
            return String.format("O valor %.2f está se aproximando %.2f%% acima da média %.2f.", valor, resultado, media);
        } else if (valor < media) {
            return String.format("O valor %.2f está está se aproximando %.2f%% abaixo da média %.2f.", valor, resultado, media);
        } else {
            return String.format("O valor %.2f é exatamente igual à média %.2f.", valor, media);
        }
    }
}