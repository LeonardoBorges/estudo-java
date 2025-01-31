package Esquenta;

import java.awt.*;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double saldoInicial = 0;
        double saque= 0;

        System.out.println("Digite o valor do seu saldo incial: ");
        saldoInicial = sc.nextDouble();
        System.out.println("Saldo Atual: " + saldoInicial);

        do {

            System.out.println("Digite o valor do seu saque: ");
            saque = sc.nextDouble();

            if (saque > saldoInicial){
                System.out.println("Error, saldo isuficiente");
            } else {
                saldoInicial = saldoInicial - saque;
                System.out.println("Novo Saldo: " + saldoInicial);
            }

        }while (saldoInicial!=0);

        if (saldoInicial == 0){
            System.out.println("saldo zerado! conta vazia" );
        }

        sc.close();
    }
}
