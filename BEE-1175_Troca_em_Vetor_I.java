/*----------------------------*
| ArthurZ7                    |
| BEE 1175                    |
| Troca em Vetor I            |
*----------------------------*/
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    Scanner s = new Scanner (System.in);
        
	int n = 20;
	int num[] = new int[n];
	
	// preenche vetor
	for (int i=1; i<(n+ 1) ; i++) {
	    num[n- i] = s.nextInt(); // a posição é o total - o indice
    }
    for (int i=0; i<n; i++) {
        System.out.printf("N[%d] = %d\n", i, num[i]);
    }
    }
}
