/*----------------------------*
| ArthurZ7                    |
| BEE 1177                    |
| Preenchimento de Vetor II   |
*----------------------------*/
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    Scanner s = new Scanner (System.in);
        
	int valor = s.nextInt();
	int tam = 1000;
	int num[] = new int[tam];
	int j=0;
	
	for (int i=0; i<tam; i++) {
        num[i] += j;
        j++;
        
        if (j == valor){
            j = 0;
        }
    }
    
    for (int i=0; i<tam; i++) {
        System.out.printf("N[%d] = %d\n", i, num[i]);
    }
    }
}
