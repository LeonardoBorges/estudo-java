package DesvioPadrao;
import  java.util.Scanner;
import  java.util.Arrays;
import java.text.DecimalFormat;


public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int opcao;
        int[] valores;
        int qtdd;
        System.out.println("Bem vindo ao calculo de desvio padrão!! ");

        do{
            System.out.println("Você quer amostral ou populacional? ");
            System.out.println("1- Populacional ");
            System.out.println("2- Amostral  ");
            System.out.println("0- Sair  ");
            opcao = scanner.nextInt();

            System.out.println("\nQuantos elementos você quer calcular: ");
            qtdd = scanner.nextInt();
            valores = new int[qtdd];

           if(opcao == 1){
               for(int i = 0; i<qtdd;i++){
                   System.out.println("Digite o valor do elemento da posição: " + (i + 1));
                   valores[i] = scanner.nextInt();
               }


               System.out.println("valores do calculo do desvio padrão:  " + Arrays.toString(valores));

               Contas resultado = new Contas();
               double desvio = resultado.DesvioPadrao(valores);

               DecimalFormat df = new DecimalFormat("#.00");
               String desvioFormatado = df.format(desvio);

               System.out.println("Resultado do desvio padrão populacional ~= " + desvioFormatado);

           } else {
               for(int i = 0; i<qtdd;i++){
                   System.out.println("Digite o valor do elemento da posição: " + (i + 1));
                   valores[i] = scanner.nextInt();
               }


               System.out.println("valores do calculo do desvio padrão:  " + Arrays.toString(valores));

               Contas resultado = new Contas();
               double desvio = resultado.DesvioPadraoAmostral(valores);

               DecimalFormat df = new DecimalFormat("#.00");
               String desvioFormatado = df.format(desvio);

               System.out.println("Resultado do desvio padrão amostral ~= " + desvioFormatado);
           }

        } while (opcao!=0);





    }
}