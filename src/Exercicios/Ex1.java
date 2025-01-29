package Exercicios;

public class Ex1 {
    private int num;

    public Ex1(int valor) {
        this.num = valor;
    }

    public String positivo(){
        if(num>0){
            return "positivo";

        } else if(num<0){
            return "negativo";
        } else {
            return "zero";
        }
    }
}