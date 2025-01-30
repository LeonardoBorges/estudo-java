package fatorial;


import java.util.Scanner;

public class Fatorial {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int num = sc.nextInt();

        int resultado = calcularFatorial(num);
        System.out.println("O fatorial de " + num + " é: " + resultado);

        sc.close();
    }
    public static int calcularFatorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * calcularFatorial(num - 1);
    }

}
