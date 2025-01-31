package Esquenta;

import java.util.ArrayList;
import java.util.Scanner;


public class Ex1E {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double total = 5000;
        double valor = 0;
        double cont = 0;

        do {
            System.out.println("Digite um gasto: ");
            valor = sc.nextInt();
            cont += valor;
            if (cont>=total){
                System.out.println("Alerta seus gastos ultrapassaram os " + total); // mesmo após a parada do programa ele ainda imprime o alerta
            }
        }while (valor!=-1); // valores para parada sera somente -1 e não todos os negativos

        System.out.println("Total gastos: " + (cont+1));
    }



}
