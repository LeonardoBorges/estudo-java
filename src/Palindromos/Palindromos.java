package Palindromos;

import java.util.Scanner;

public class Palindromos {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String palavra;

        System.out.println("Digite uma palavra: ");
        palavra = sc.nextLine();
        palavra = palavra.toLowerCase().replace(" ", "");
        String palavraInvertida = new StringBuilder(palavra).reverse().toString();
        // char[] aux = new char[palavra.length()];

        if(palavraInvertida.equals(palavra)){
            System.out.println("A palavra é um palindromo");
            System.out.println(palavraInvertida);
        } else {
            System.out.println("A palavra não é um palindromo");
        }
        sc.close();
        char[] reversa = new char[palavra.length()];
        for(int i = palavra.length()-1, j=0; i >=0; i--, j++){
           reversa[j] = palavra.charAt(i);
        }

        System.out.println("reversa = " + new String(reversa) );

    }

}

