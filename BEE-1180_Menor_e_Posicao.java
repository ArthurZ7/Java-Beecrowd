/*----------------------------*
| ArthurZ7                    |
| BEE 1180                    |
| Menor e Posição             |
*----------------------------*/
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    Scanner s = new Scanner (System.in);
        
	int n = s.nextInt();
	int num[] = new int[n];
	int menor = Integer.MAX_VALUE;
	int pos = 0;
	
	for (int i=0; i<n; i++) {
	    num[i] = s.nextInt();
	    if (num[i] < menor){
            menor = num[i];
            pos = i;
        }
    }
    
    System.out.printf("Menor valor: %d\n", menor);
    System.out.printf("Posicao: %d\n", pos);
    
    }
}
