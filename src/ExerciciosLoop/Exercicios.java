package ExerciciosLoop;

import java.util.Scanner;

public class Exercicios {
    public static void main(String args[]){
        int opcao;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1 - Exercicio 1");
            System.out.println("2 - Exercicio 2");
            System.out.println("3 - Exercicio 3");

            opcao = sc.nextInt();

            switch (opcao){
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalido");
                    break;
            }

        } while (opcao!=0);
    }
}
