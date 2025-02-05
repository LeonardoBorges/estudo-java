package Vetores;

import java.util.Scanner;

public class MenorMaior {

    public static void main(String[] args) {
        //maior e menor
        Scanner sc = new Scanner(System.in);

        int dias = 10;
        double[] precos = new double[dias];
        for (int i= 0; i < 10; i++){
            System.out.println("Digite o valor" + i);
            precos[i] = sc.nextDouble();
        }


        int left = 0;
        int right = dias - 1;
        double maior = precos[0];

        // Usando dois ponteiros para encontrar o maior valor
        while (left <= right) {
            if (precos[left] >= precos[right]) {
                maior = precos[left];
                left++;
            } else {
                maior = precos[right];
                right--;
            }
        }
        System.out.println("Maior: " + maior);
    }
}
