package Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int opcao;
        int segundos = 5;
        do{
            System.out.println("Calculadora JAVA");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Porcentagem");
            System.out.println("6. Exponencial");
            System.out.println("7. Logaritimo");
            System.out.println("0. Sair");

            opcao =scanner.nextInt();

            if(opcao >= 1 && opcao <= 4){
                System.out.println("digite o primeiro numero: ");
                double num1 =  scanner.nextDouble();

                System.out.println("digite o segundo numero: ");
                double num2 =  scanner.nextDouble();


                System.out.println("Vc escolheu: " + num1 + " e " + num2);
                Contas resultado = new Contas(num1,num2);
                switch (opcao) {
                    case 1:
                        System.out.println("Soma = "+ resultado.soma());
                        for (int i = segundos; i > 0; i--) {
                            System.out.println("Faltam " + i + " segundos... proximo calculadora");
                            try {
                                Thread.sleep(1000); // Pausa por 1 segundo
                            } catch (InterruptedException e) {
                                System.out.println("Thread interrompida");
                            }
                        }

                        break;
                    case 2:

                        System.out.println("Sub = "+ resultado.subtracao());
                        for (int i = segundos; i > 0; i--) {
                            System.out.println("Faltam " + i + " segundos... para proximo calculadora");
                            try {
                                Thread.sleep(1000); // Pausa por 1 segundo
                            } catch (InterruptedException e) {
                                System.out.println("Thread interrompida");
                            }
                        }
                        break;
                    case 3:

                        System.out.println("Mult = "+ resultado.multiplicacao());
                        for (int i = segundos; i > 0; i--) {
                            System.out.println("Faltam " + i + " segundos... proximo calculadora");
                            try {
                                Thread.sleep(1000); // Pausa por 1 segundo
                            } catch (InterruptedException e) {
                                System.out.println("Thread interrompida");
                            }
                        }
                        break;
                    case 4:


                        System.out.println("Div = "+ resultado.divisao());
                        for (int i = segundos; i > 0; i--) {
                            System.out.println("Faltam " + i + " segundos... proximo calculadora");
                            try {
                                Thread.sleep(1000); // Pausa por 1 segundo
                            } catch (InterruptedException e) {
                                System.out.println("Thread interrompida");
                            }
                        }

                        break;
                    case 5:


                        System.out.println("Porcentagem = "+ resultado.porcentagem());
                        for (int i = segundos; i > 0; i--) {
                            System.out.println("Faltam " + i + " segundos... proximo calculadora");
                            try {
                                Thread.sleep(1000); // Pausa por 1 segundo
                            } catch (InterruptedException e) {
                                System.out.println("Thread interrompida");
                            }
                        }

                        break;



                    default:
                        break;
                }

            } else if(opcao>4 || opcao < 0 ) {
                System.out.println("invalido");
            }

        }while (opcao != 0);

        System.out.println("calculadora encerrada!");
        scanner.close();

    }
}
