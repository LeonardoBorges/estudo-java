package NumPrimos;
import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        // Caso especial para números menores que 2
        if (num < 2) {
            System.out.println(num + " não é primo.");
            return;
        }

        boolean ehPrimo = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                ehPrimo = false;
                break;
            }
        }

        System.out.println(num + (ehPrimo ? " é primo." : " não é primo."));
    }
}
