// programa feito por Leonardo Borges pontuação:100, tudo certo
// tester = Vinicius Lima

package Maratona;
import java.lang.Math;
import java.util.Scanner;


public class Maratona {
    //Math.cos()
    //Math.sin()
    //Math.toRadians();
    //entradas =  angulo em grau e velocidade(m/s)
    //transformar grau em radiando
    //tempo = 0,01
    //deta
    // g= 9,8

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double angulo, velocidade, x, y;
        double t = 0.01;
        double g = 9.8;


        System.out.println("Digite os graus: ");
        angulo = Math.toRadians( sc.nextDouble());

        System.out.println("Digite a velocidade: ");
        velocidade = sc.nextDouble();

        x = 1;
        y =1 ;

        while (y>0){

            x = (velocidade * (Math.cos(angulo)) * t);
            y = ((velocidade * Math.sin(angulo))*t) - ((0.5 * g) *  Math.pow(t,2));
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            t = t + 0.01;

        }

    }
}
