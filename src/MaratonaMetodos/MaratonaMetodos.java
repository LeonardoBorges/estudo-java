package MaratonaMetodos;

import java.util.Arrays;
import java.util.ArrayList;

/*

Nome do DEV: Leonardo Nunes Borges
Nota: 100-5 ==> 95
Nome do Tester: Vinicius Lima Cabral
 */
public class MaratonaMetodos {
    public static void main(String[] args) {
        int codigo = 2, dia =3;
        int codigoMediaDeseja = 1;

        double[][] matriz =
                {{22.5, 23.0, 22.0, 24.5,25.0},
                { 85.0, 86.5, 84.0, 83.5, 87.0},
                { 30.0, 29.5, 30.5, 31.0, 32.5}};

        double[] valores = new double[matriz.length];

        System.out.println("Media PETR4" + mediaPrecos(matriz, codigoMediaDeseja));
        //deixando fixo que o ativo vai ser a Petr4

        System.out.println(maiorValorizacao(matriz));
        valores = simulacaoLucroPerda(matriz);

        try {
            for (int i = 0; i <= matriz.length -1 ; i++) {
            if (valores[i] >= (matriz[i][0] - matriz[i][matriz[i].length-1])){
                System.out.println("Lucro: (" + valores[i] + ")" );
            } else {
                System.out.println("Perda: (" + valores[i] + ")" );
            }
        }

        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Valores incorretos");
        }

        if (codigo == 1){
            String nomeAtivo = "PETR4";
            System.out.println("Consulta  do preco ativo "+ nomeAtivo + "no dia " + dia + "->" + consultePreco(matriz, codigo, dia));
        } else if (codigo ==2) {
            String nomeAtivo = "VAL3";
            System.out.println("Consulta  do preco ativo "+ nomeAtivo + "no dia " + dia + "->" + consultePreco(matriz, codigo, dia));
        } else if (codigo ==3){
            String nomeAtivo = "ITUB4";
            System.out.println("Consulta  do preco ativo "+ nomeAtivo + "no dia " + dia + "->" + consultePreco(matriz, codigo, dia));
        }

    }

    public static double mediaPrecos(double[][] matrizValores, int codigo){ //parametro codigo não utilizado
       double media = 0;

        for (int i = 0; i <= matrizValores[0].length -1; i++) {
            media =  media + matrizValores[0][i];
        }

        media = media/matrizValores[0].length;
        return media;
    }

    public static String  maiorValorizacao(double[][] matrizValores){
        double[] maior = new double[matrizValores.length];
        for (int i = 0; i < matrizValores.length-1; i++) {
            maior[i] = ((matrizValores[i][matrizValores[0].length -1] -  matrizValores[0][0])/matrizValores[0][0])*100;
        }

        int codigoAtivo = 0;
        double aux = 0;
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < maior.length ; i++) {
            if (aux < maior[i]){
                aux = maior[i];
                codigoAtivo++;
            }
        }

        if (codigoAtivo ==1 ){
            resultado.append("PETR4 ( de " + matrizValores[0][0] + " para " + matrizValores[0][matrizValores[0].length-1] + " crescimento de "+ aux + "%" + " /" );
            return resultado.toString();
        } else if (codigoAtivo ==2) {
            resultado.append("PETR4 ( de " + matrizValores[codigoAtivo][0] + " para " + matrizValores[codigoAtivo][matrizValores[codigoAtivo].length-1] + " crescimento de "+ aux + "%" + " /" );
            return resultado.toString();
        } else{
            resultado.append("PETR4 ( de " + matrizValores[codigoAtivo][codigoAtivo] + " para " + matrizValores[codigoAtivo][matrizValores[codigoAtivo].length-1] + " crescimento de "+ aux + "%" + " /" );
            return resultado.toString();

        }
    }

public static double[] simulacaoLucroPerda(double[][] matrizValores){
        double[] valores = new double[matrizValores.length];
    for (int i = 0; i <= matrizValores.length-1; i++) {
        valores[i] = ((matrizValores[0][matrizValores[0].length -1] -  matrizValores[0][i])/matrizValores[0][i])*100;

    }
    return valores;
}


    public static double consultePreco(double[][] matrizValores, int codigo, int dia){
        return matrizValores[codigo - 1 ][dia -1];
    }

}
