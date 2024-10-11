/*------------------*
| Arthur Borges     |
| BEE 1153          |
| Fatorial Simples  |
*------------------*/
import java.util.Scanner;

public class Main {

    public static int calcFatorial(int n, int cont) {
        
        if (n == 1) {
            return cont; // Quando n chega a 1, o fatorial é o valor acumulado de 'cont'
        } else {
            return calcFatorial(n - 1, cont * n); // Decrementa 'n' e acumula o produto em 'cont'
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int cont = 1; // 'cont' começa em 1, pois o fatorial de 1 é 1
        
        System.out.printf("%d\n", calcFatorial(n, cont));

        s.close();
    }
}