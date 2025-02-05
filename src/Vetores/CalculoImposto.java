package Vetores;

import java.util.Scanner;

public class CalculoImposto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dias = 5;
        double[] precosVenda = new double[dias];
        double[] precosCompra = new double[dias];
        double lucro = 0;
        double imposto = 15/100;

        for (int i= 0; i < dias; i++){
            System.out.println("Digite da compra do ativo " + i);
            precosCompra[i] = sc.nextDouble();
            System.out.println("Digite da venda do ativo " + i);
            precosVenda[i] = sc.nextDouble();

            lucro = lucro + (precosVenda[i] - precosCompra[i]);
        }

        System.out.println("Lucro total " +lucro);
        if (lucro > 20000 ){
            double lucroImp = (lucro - 2000) - imposto;
            System.out.println("Lucro total com imposto " +lucroImp);
        } else System.out.println("Sem imposto devido");

    }
}
