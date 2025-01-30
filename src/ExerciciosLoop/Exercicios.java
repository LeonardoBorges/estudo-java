package ExerciciosLoop;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercicios {

    public static void main(String args[]){
        int opcao;
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1 - Exercicio 1");
            System.out.println("2 - Exercicio 2");
            System.out.println("3 - Exercicio 3");
            System.out.println("4 - Exercicio 4");
            System.out.println("0  para sair");


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
                case 4:
                    System.out.println("Digite um número para a fibonacci ");
                    num = sc.nextInt();

                    Ex4 resultado4 = new Ex4(num);
                    System.out.println("Resultado: "+ resultado4.fibonacci());
                    break;
                case 5:
                    break;
                    case 6:

                        int opcaoM;
                        do {
                            System.out.println("1 - Digite para adicionar o cliente: ");
                            System.out.println("0 - Digite para sair: ");
                            opcaoM = sc.nextInt();

                          if (opcaoM ==1 ){
                              mercado();
                          } else if (opcaoM == 0) {  // Se escolher 0, sai do laço
                              System.out.println("Saindo do menu do cliente...");
                          } else {
                              System.out.println("Opção inválida.");
                          }

                        }while (opcaoM != 0);
                        break;
                default:
                    System.out.println("Invalido");
                    break;
            }

        } while (opcao!=0);

    }

    public static void mercado(){
        ArrayList<Double> produtos = new ArrayList<>();
        double valorProduto = 0;
        Scanner sc = new Scanner(System.in);
      do {

        System.out.println("Digite o valor do produto: ");
        valorProduto = sc.nextInt();
        produtos.add(valorProduto);
    } while (valorProduto!=-1);

    Ex6 resultado6 = new Ex6(produtos);
    System.out.println(resultado6.desconto());


    }
}
