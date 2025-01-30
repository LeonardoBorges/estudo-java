package ContaDigitos;

import java.util.Scanner;

public class ContaDigitos {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para contar seus digitos: ");
        int num = sc.nextInt();

        int resultado = contaDigitos(num);
        System.out.println("A conta dos digitos de " + num + " é: " + resultado);

        sc.close();
    }

    public static int contaDigitos(int num){
        if(num == 0){
            return 0;
        }
        return 1 + contaDigitos(num/10);
    }
}
