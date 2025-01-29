package ExerSwitch;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        int opcao;
        System.out.println("Digite o numero que demosntra sua satisfação: ");

        System.out.println("1 - para nada satisfeito");
        System.out.println("2 - para pouco satisfeito");
        System.out.println("3 - para satisfez a nacessidade");
        System.out.println("4 - para muito bom");
        System.out.println("5 - para extremamente bom");

        Scanner sc = new Scanner(System.in);
        opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Nos desculpe pelos problemas, vamos melhorar!");
                break;
            case 2:
                System.out.println("Vamos melhorar!");
                break;
            case 3:
                System.out.println("Obrigado, na proxima vai ser melhor!!");
                break;
            case 4:
                System.out.println("Sua satisfação é a nossa satisfação!!");
                break;
            case 5:
                System.out.println("Nós que agradecemos, muito bom atender você!!!");
                break;
            default:
                System.out.println("Invalido");
                break;
        }
    }
}
