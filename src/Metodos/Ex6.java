package Metodos;

public class Ex6 {
    private int qtdd; //poderia atribuir o .length aqui, mas vou fazer alguma coisa mais complexo
    private double soma;
    private double media;
    private double somaDesvio;
    private double variancia;
    private double desvio;

    public double desvioPradao(double[] valores){

        soma = 0;  // Inicializar soma
        somaDesvio = 0;  // Inicializar somaDesvio
        qtdd = valores.length;;

        for(int i = 0; i< valores.length; i++){

            soma = soma + valores[i];
        }

        media = soma/qtdd;
        for(int i = 0; i< valores.length; i++){
            somaDesvio += Math.pow((valores[i] - media), 2);
        }

        variancia = somaDesvio/qtdd;

        desvio = Math.sqrt(variancia);

        return this.desvio;
    }
}
