package ExerciciosLoop;

import java.util.Scanner;

public class Exercicios {
    public static void main(String args[]){
        int opcao;
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1 - Exercicio 1");
            System.out.println("2 - Exercicio 2");
            System.out.println("3 - Exercicio 3");
            System.out.println("4 - Para sair");

            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite um número para a tabuada dele");
                    num = sc.nextInt();
                    Ex1 resultado1 = new Ex1(num);
                    System.out.println(resultado1.tabuada());
                    break;
                case 2:
                    System.out.println("Digite um número para a soma dos impares dele: ");
                    num = sc.nextInt();
                    Ex2 resultado2 = new Ex2(num);
                    System.out.println(resultado2.quadrado());

                    break;
                case 3:
                    System.out.println("Digite um número para a base: ");
                    int base = sc.nextInt();
                    System.out.println("Digite um número para exponencial: ");
                    int expo = sc.nextInt();

                    Ex3 resultado3 = new Ex3();
                    System.out.println("Resultado: "+resultado3.exponencial(base, expo));
                    break;
                default:
                    System.out.println("Invalido");
                    break;
            }

        } while (opcao!=0);
    }
}
