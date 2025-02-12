package Metodos;

import Exercicios.*;
import Exercicios.Ex1;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {

        int opcao;
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
                    System.out.println("Media Movel: " + Arrays.toString(((Ex4)resultado).calcularMediaMovel(precos, inter)));
                    break;
                case 5:
                    resultado = new Ex5();
                    double ativo1 = 5.0;
                    double ativo2 = 4.5;

                    String compara = ((Ex5) resultado).compararAtivos(ativo1, ativo2);

                    System.out.println(compara);
                    break;
                case 6:
                    double[] valores;
                    int qtdd;
                    System.out.println("\nQuantos elementos você quer calcular: ");
                    qtdd = sc.nextInt();
                    valores = new double[qtdd];
                    for(int i = 0; i<qtdd;i++){
                        System.out.println("Digite o valor do elemento da posição: " + (i + 1));
                        valores[i] = sc.nextDouble();
                    }

                    resultado = new Ex6();
                    double desvio = ((Ex6) resultado).desvioPradao(valores);

                    DecimalFormat df = new DecimalFormat("#.00");
                    String desvioFormatado = df.format(desvio);

                    System.out.println("Resultado do desvio padrão populacional ~= " + desvio);

                    break;
                case 7:
                    double[] ativos = new double[3];
                    double[] retorno = new double[3];
                    for (int i = 0; i <3 ; i++) {
                        ativos[i] = sc.nextDouble();
                    }

                    for (int i = 0; i <3 ; i++) {
                        retorno[i] = sc.nextDouble();
                    }
                    resultado = new Ex7();
                    System.out.println(((Ex7) resultado).simularCarteira(ativos, retorno));
                    break;
                case 8:
                    System.out.println(calcularJurosComposto());

                    break;
                case 10:
                    resultado = new Ex10();
                    double volatilidade = 0.02;
                    double media = 0.001;
                    int peri = 10;
                    double preco = 100.0;
                    System.out.printf("preco simulado = %s", Arrays.toString(((Ex10) resultado).simularPrecoMonteCarlo(preco, media, volatilidade, peri)));
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

        return valor + ((valor*tx)*anos );

    }

    public static double calcularJurosComposto(){
        int meses= 12;
        double capital = 1000.0;
        double tx = 0.02;
        double total = 0;

       return capital * Math.pow(1+tx, meses);
    }

}
