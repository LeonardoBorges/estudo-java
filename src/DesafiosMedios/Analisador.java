package DesafiosMedios;
import java.util.Scanner;
import java.util.ArrayList;
/*
Faça um analisador de números que:

Lê uma sequência de números
Mostra o maior, menor, média
Quantidade de pares e ímpares
Porcentagem de números positivos e negativos
 */


public class Analisador {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Digite os números (digite 'fim' para terminar):");

        while (true) {
            System.out.print("Número: ");
            String entrada = sc.next(); // Lê a entrada como String

            // Verifica se o usuário quer parar
            if (entrada.equalsIgnoreCase("fim")) {
                mmm(list);
                break;
            }

            try {

                int numero = Integer.parseInt(entrada);
                list.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número ou 'fim' para terminar.");
            }
        }



    }

    public static void mmm(ArrayList<Integer> lista){
        int maior;
        int menor;
        int media;
        int soma =0;

        if (!lista.isEmpty()){
            maior = lista.get(lista.size() - 1);
            menor = lista.get(0);
            System.out.println("Menor valor: " + menor + " Maior valor: " + maior);

        }else {
            System.out.println("Nenhum número foi digitado.");
        }

        for (int i=0; i<= lista.size();i++){
            soma = soma + lista.get(i);
        }


    }
}
