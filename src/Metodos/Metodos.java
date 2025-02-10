package Metodos;

import Exercicios.*;
import Exercicios.Ex1;

import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {
        int num;
        int opcao;
        int segundos = 5;
        Scanner sc = new Scanner(System.in);
        Object resultado = null;


        do {
            System.out.println("Escolha o exercicio ");
            System.out.println("Digite 1 numero pra converter moeda ");
            System.out.println("Digite 2 numero pra calcular juros simples: ");
            System.out.println("Digite 3 numero pra calcular crescimento: ");
            System.out.println("Digite 4 numero pra calcular media movel: ");
            System.out.println("Digite 5 numero pra  ");
            System.out.println("Digite 0 numero pra sair");
            opcao = sc.nextInt();


            switch (opcao){
                case 1:
                    System.out.println("Digite o valor: ");
                    int valor = sc.nextInt();

                    System.out.println("Digite a taxa = ");
                    double tx =  sc.nextDouble();
                    //resultado = new Metodos.Ex1(valor);
                    //System.out.println("O numero é: " + ((Ex1)resultado).converterMoeda(tx));
                    break;
                case 2:
                    System.out.println(calcularJurosSimples());
                    break;
                case 3:
                    System.out.println("Digite dia1 ");
                    double dia1 = sc.nextInt();

                    System.out.println("Digite dia2");
                    double dia2 =  sc.nextDouble();

                    resultado = new Ex3();
                    System.out.println("Crescimento = " + ((Ex3)resultado).calcularCrescimento(dia1, dia2));
                    break;
                case 4:
                    double[] precos = new double[5];
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Digite o valor: ");
                        precos[i] = sc.nextDouble();
                    }

                    System.out.println("Digite o intervalo ");
                    int inter = sc.nextInt();

                    resultado = new Ex4();
                    System.out.println("Media Movel: " + ((Ex4)resultado).calcularMediaMovel(precos, inter));
                    break;
                case 5:
                    //resultado = new Ex5(num);
                    break;

                default:
                    System.out.println("Escolha outro número!!");
                    break;
            }
        } while (opcao!=0);

        System.out.println("Obrigado por participar!!");
        sc.close();

    }

    public static double calcularJurosSimples(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        int valor = sc.nextInt();

        System.out.println("Digite a taxa = ");
        double tx =  (sc.nextDouble())/100;

        System.out.println("Digite o(s) ano(s): ");
        int anos = sc.nextInt();

        double saldo = valor + ((valor*tx)*anos );

        return saldo;

    }

}
