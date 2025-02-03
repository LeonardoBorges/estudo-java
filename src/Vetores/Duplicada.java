package Vetores;
import java.util.ArrayList;
import java.util.Scanner;

public class Duplicada {
    public static void main(String[] args ){

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <=10;i++){
            System.out.println("Escreva um numero para a lista");
            int num = sc.nextInt();
            list.add(num);
        }
        System.out.println(list);

        for(int i = 0; i< list.size(); i++){
            for (int j = list.size()-1; j >= 0;j--){
                if(list.get(i).equals(list.get(j))){
                    list.remove(j);
                    break;
                }
            }
        }

        System.out.println(list);

    }
}
