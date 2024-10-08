/*----------------*
| Arthur Borges   |
| BEE 1151        |
| 08/10/2024      |
*----------------*/
import java.util.Scanner;

// Fibonacci Fácil
public class Main {

    public static int calcularFib(int n, int cont) {
        
        if (cont == 0) {
            return 0;
        } else if (cont == 1) {
            return 1;
        } else {
            return calcularFib(n, cont - 1) + calcularFib(n, cont - 2);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // N primeiros números dessa série
        int n = s.nextInt();
        int cont = 0;
        
        for (int i = 0; i < n; i++) {
            // Calcula o Fibonacci e imprime o resultado
            System.out.printf("%d",calcularFib(n, cont));
            if (cont<n-1){
                System.out.print(" ");
                cont++;    
            } else {
                System.out.println();
            }
            
        }
        s.close();
    }
}