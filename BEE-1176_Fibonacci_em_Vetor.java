/*----------------------------*
| ArthurZ7                    |
| BEE 1176                    |
| Fibonacci em Vetor          |
*----------------------------*/
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    Scanner s = new Scanner (System.in);
    
    int qnt = s.nextInt();
	int num[] = new int[qnt];
	
	int tam = 61;
	long fib[] = new long[tam];
	fib[0] = 0;
	fib[1] = 1;
	
	// Preenche vetor sequencia Fibonacci
	for (int i=2; i<tam; i++) {
        fib[i] = fib[i-1] + fib[i-2];
       
	}
	
    // Preencher vetor com os casos
    for (int i=0; i<qnt; i++) {
        num[i] = s.nextInt();
    }
    
    for (int i=0; i<qnt; i++) {
        System.out.printf("Fib(%d) = %d\n", num[i], fib[num[i]]);
    }
    }
}
