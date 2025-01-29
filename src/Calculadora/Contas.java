package Calculadora;

public class Contas {
    private double num1;
    private double num2;

    public Contas( double num1, double num2){
        this.num1= num1;
        this.num2 = num2;
    }

    public double soma(){
        return this.num1 + this.num2;
    }

    public double subtracao(){
        return this.num1 - this.num2;
    }

    public double divisao(){
        return this.num1 / this.num2;
    }

    public double multiplicacao(){
        return this.num1 * this.num2;
    }

    public double porcentagem(){
        return this.num1;
    }

    public double exponencial(){
        return this.num1 * num1;
    }





}
