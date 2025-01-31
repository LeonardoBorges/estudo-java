package DesafiosMedios;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
public class MaisEMenos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Digite os números (digite 'fim' para terminar):");

        while (true) {
            System.out.print("Número: ");
            String entrada = sc.next(); // Lê a entrada como String

            // Verifica se o usuário quer parar
            if (entrada.equalsIgnoreCase("fim")) {
                break;
            }

            try {

                int numero = Integer.parseInt(entrada);
                list.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número ou 'fim' para terminar.");
            }
        }

        // Exibe a lista de números digitados
        System.out.println("Números digitados: " + list);
        list.sort(null);
        if (!list.isEmpty()) {
            int menor = list.get(0); // Primeiro elemento após a ordenação
            int maior = list.get(list.size() - 1); // Último elemento após a ordenação

            System.out.println("Lista ordenada: " + list);
            System.out.println("Menor valor: " + menor);
            System.out.println("Maior valor: " + maior);
        } else {
            System.out.println("Nenhum número foi digitado.");
        }

        sc.close(); // Fecha o Scanner

    }
}
