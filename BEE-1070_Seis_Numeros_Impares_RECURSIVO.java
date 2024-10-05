/*-------------------------*
| Arthur Borges            |
| BEE 1070                 |
| Seis Números Ímpares     |
*-------------------------*/
import java.util.Scanner;

public class Main {

    public static void proximosImpares(int num, int cont) {
        if (cont == 0) {
            return; // Para quando imprimir 6 números
        }
        
        // Se o número é par, incrementa
        if (num % 2 == 0) {
            num++;
        }

        System.out.println(num); // Imprime o número ímpar
        proximosImpares(num + 2, cont - 1); // Chama recursivamente para o próximo ímpar
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();

        proximosImpares(x, 6); // Inicia com 6 contagens para imprimir
        s.close();
    }
}
