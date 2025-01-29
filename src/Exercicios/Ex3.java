package Exercicios;

public class Ex3 {
    public String imc(double altura, double peso) {
        double resultado = peso / (altura * altura);

        if (resultado >= 1 && resultado <= 18.99) {
            return "IMC menor";
        } else if (resultado >= 19 && resultado <= 29.99) {
            return "IMC bom";
        } else if (resultado >= 30 && resultado <= 59.99) {
            return "IMC maior";
        } else {
            return "IMC fora do esperado";
        }
    }
}