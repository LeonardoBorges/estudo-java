package Exercicios;

public class Ex5 {

    public String notafinal(double nota){

        if (nota < 4 ){
            return "Reprovado";
        } else if (nota > 4 && nota <6) {
            return "Exame";
        } else {
            return  "Aprovado";
        }
    }
}

