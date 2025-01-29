package ExerSwitch;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int opcao;

        System.out.println("1 - para CDB");
        System.out.println("2 - para CDI");
        System.out.println("3 - para Tesouro Direto");
        System.out.println("4 - para FII");

        Scanner sc = new Scanner(System.in);
        opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Voce escolheu o CDB");
                break;
            case 2:
                System.out.println("Voce escolheu o CDI");
                break;
            case 3:
                System.out.println("Voce escolheu o Tesouro Direto");
                break;
            case 4:
                System.out.println("Voce escolheu o FII");
                break;
            default:
                System.out.println("Invalido");
                break;

        }
    }
}
