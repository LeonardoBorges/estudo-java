package SomaDigitos;

import java.util.Scanner;

public class SomaDigitos {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para somar seus digitos: ");
        int num = sc.nextInt();

        int resultado = somaDigitos(num);
        System.out.println("A sina dos digitos de " + num + " é: " + resultado);

        sc.close();
    }

    public static int somaDigitos(int num){
        if(num == 0){
            return 0;
        }
        return num + somaDigitos(num-1);
    }
}
