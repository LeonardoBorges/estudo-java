package Exercicios;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        int opcao;
        int segundos = 5;
        Scanner sc = new Scanner(System.in);



        do {
            System.out.println("Escolha o exercicio ");
            System.out.println("Digite 1 numero pra saber se é positivo: ");
            System.out.println("Digite 2 numero pra saber se é par: ");
            System.out.println("Digite 3 numero pra saber o IMC: ");
            System.out.println("Digite 4 numero pra saber a media ");
            System.out.println("Digite 5 numero pra saber a situação do aluno ");
            System.out.println("Digite 0 numero pra sair");
            opcao = sc.nextInt();

            Object resultado = null;
            switch (opcao){
                case 1:
                    System.out.println("Digite um numero pra saber se é positivo: ");
                    num = sc.nextInt();
                    resultado = new Ex1(num);
                    System.out.println("O numero é: " + ((Ex1)resultado).positivo());
                    for (int i = segundos; i > 0; i--) {
                        System.out.println("Faltam " + i + " segundos... proximo exercicio");
                        try {
                            Thread.sleep(1000); // Pausa por 1 segundo
                        } catch (InterruptedException e) {
                            System.out.println("Thread interrompida");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Digite um numero pra se é par: ");
                    num = sc.nextInt();
                    resultado = new Ex2(num);
                    System.out.println("Seu numero é:" + ((Ex2)resultado).parimpar());
                    for (int i = segundos; i > 0; i--) {
                        System.out.println("Faltam " + i + " segundos... proximo exercicio");
                        try {
                            Thread.sleep(1000); // Pausa por 1 segundo
                        } catch (InterruptedException e) {
                            System.out.println("Thread interrompida");
                        }
                    }
                    break;
                case 3:
                    double altura;
                    double peso;

                    System.out.println("Digite um numero pra altura pra saber o IMC: ");
                    altura = sc.nextDouble();
                    System.out.println("Digite um numero pra peso pra saber o IMC: ");
                    peso= sc.nextDouble();

                    resultado = new Ex3();
                    System.out.println("Seu " + ((Ex3)resultado).imc(altura, peso));
                    for (int i = segundos; i > 0; i--) {
                    System.out.println("Faltam " + i + " segundos... proximo exercicio");
                    try {
                        Thread.sleep(1000); // Pausa por 1 segundo
                    } catch (InterruptedException e) {
                        System.out.println("Thread interrompida");
                    }
                }
                    break;
                case 4:
                    double valor;
                    double media;
                    System.out.println("Digite um numero pra valor: ");
                    valor = sc.nextDouble();
                    System.out.println("Digite um numero pra media");
                    media= sc.nextDouble();

                    resultado = new Ex4();
                    System.out.println(((Ex4)resultado).calcularPorcen(valor,media) +"%");
                    for (int i = segundos; i > 0; i--) {
                        System.out.println("Faltam " + i + " segundos... proximo exercicio");
                        try {
                            Thread.sleep(1000); // Pausa por 1 segundo
                        } catch (InterruptedException e) {
                            System.out.println("Thread interrompida");
                        }
                    }

                    break;
                case 5:
                    System.out.println("Digite um numero para nota final: ");
                    num = sc.nextInt();
                    resultado = new Ex5();
                    System.out.println("Sua situação é: " + ((Ex5)resultado).notafinal(num));
                    for (int i = segundos; i > 0; i--) {
                        System.out.println("Faltam " + i + " segundos... proximo exercicio");
                        try {
                            Thread.sleep(1000); // Pausa por 1 segundo
                        } catch (InterruptedException e) {
                            System.out.println("Thread interrompida");
                        }
                    }

                    break;
            }
        } while (opcao!=0);

        System.out.println("Obrigado por participar!!");
        sc.close();
    }
}