package Exercicios;

public class Ex2 {
    private int num;

    public Ex2(int valor) {
        this.num = valor;
    }
    public String parimpar(){
        if (num %2 == 0){
            return "par";
        } else {
            return "impar";
        }
    }
}