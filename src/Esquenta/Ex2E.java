package Esquenta;

import java.util.Scanner;

public class Ex2E {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double divida = 0; //quando o valor for instanciado dentro do while não é necessario = 0. Só uma dica!
        double valor = 0;
        int mes = 1;

        System.out.println("Digite o valor da divida: ");
        divida = sc.nextDouble();

        while (divida > 0) {
            System.out.println("Digite o valor a pagar da divida no mes: " + mes);
            valor = sc.nextDouble();
            divida = divida - valor;
            System.out.println(" mes " + mes + " Saldo restante: " + divida);

            mes++;
        }
        if (divida == 0) {

            System.out.println("mes " + mes + " Divida quitada");

        }
        sc.close();

    }
}
