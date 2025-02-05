package Vetores;

import java.util.Scanner;

public class CalculoImposto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] precosVenda = new double[5];
        double[] precosCompra = new double[5];
        double lucro = 0;
        double imposto = 15/100;

        for (int i= 0; i < 5; i++){
            System.out.println("Digite da compra do ativo " + i);
            precosCompra[i] = sc.nextDouble();
            System.out.println("Digite da venda do ativo " + i);
            precosVenda[i] = sc.nextDouble();

            lucro = lucro + (precosVenda[i] - precosCompra[i]);
        }
        System.out.println("Lucro total sem imposto" +lucro);

        if (lucro >= 20000 ){
            lucro = lucro - (lucro * imposto);
            System.out.println("Lucro total com imposto " +lucro);
        } else System.out.println("Sem imposto devido");

    }
}
