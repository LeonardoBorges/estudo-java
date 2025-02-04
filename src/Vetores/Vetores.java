package Vetores;

import java.util.Scanner;

public class Vetores {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        /*
        // tendencia de preços
        int[] preços = {10,11,8,11,12,15,9,12,10,11};

        for (int i = 0; i < preços.length - 2;i++){
            if(preços[i] < preços[i+1] && preços[i+1] < preços[i+2]){
                  System.out.printf(" Dias com tendencia de aumento: %d, %d, %d", i,i+1, i+2 );
            } else {
                System.out.println(" Sem tendendia de alta");
            }

        }
    */

    /*
       // media movel

        int semana = 7;
        double[] imoveis = new double[semana];
        double media= 0;

        for (int i= 0; i < semana; i++){
            System.out.println("Digite o valor do imovel " + i +1);
            imoveis[i] = sc.nextDouble();
        }
        System.out.println(imoveis);
        for (int i = imoveis.length-3; i < semana; i++ ){
            media =  media + imoveis[i];
        }

        System.out.println(media/3);

     */

        //maior e menor

        int dias = 10;
        double[] precos = new double[dias];
        double media= 0;
        double aux1 = Double.MIN_VALUE;;
        int[] aux2 = new int[1];

        for (int i= 0; i < 10; i++){
            System.out.println("Digite o valor do imovel " + i);
            precos[i] = sc.nextDouble();
        }

        for (int i = 0; i < 10; i++) {
            if (precos[i] > aux1) {
                aux1 = precos[i];
                aux2[0] = i;
            }
        }
        System.out.println("Maior: " + aux1);
    }
}
