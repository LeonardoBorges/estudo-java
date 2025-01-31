package Esquenta;

import java.util.Scanner;

public class Ex4E {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double valor = 0;
        int limite = 1000;

        System.out.println("Taxa de cambio: 1US = 5BRL");

        for (int i = limite; i>=0; i++){
            System.out.println("Digite valor para converter: ");
            valor= sc.nextDouble();
            if (valor> limite ){
                System.out.println("Erro: o limite de R$1000 foi ultrapassado");
            } else {
                System.out.println("Voce receberá: " + valor/5 +" USD");
                limite -= valor;
            }
        }
        sc.close();
    }
}
