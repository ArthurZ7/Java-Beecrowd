/*----------------*
| Arthur Borges   |
| BEE 1029        |
| 04/10/2024      |
*----------------*/
import java.util.Scanner;

// Fibonacci chamada recursiva
public class Main {

    static int chamadas = 0; // Contador de chamadas

    public static int calcularFib(int n) {
        chamadas++; // Incrementa a contagem em cada chamada

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calcularFib(n - 1) + calcularFib(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Quantidade de números a serem lidos
        int qnt = s.nextInt();
        
        // Número a ser calculado o Fibonacci
        int x;

        for (int i = 0; i < qnt; i++) {
            x = s.nextInt();

            chamadas = 0; // Reinicia a contagem de chamadas para cada novo cálculo

            // Calcula o Fibonacci e imprime o resultado
            int resultado = calcularFib(x);
            System.out.printf("fib(%d) = %d calls = %d\n", x, chamadas-1, resultado);
        }
        s.close();
    }
}