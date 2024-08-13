/*----------------------------*
| ArthurZ7                    |
| BEE 1173                    |
| Preenchimento de Vetor I    |
*----------------------------*/
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    Scanner s = new Scanner (System.in);
        
	int n = 10;
	int num[] = new int[n];
	num[0] = s.nextInt();
	
	for (int i=1; i<n ; i++) {
	    num[i] = num[i- 1]*2;
    }
    
    for (int i=0; i<n; i++) {
        System.out.printf("N[%d] = %d\n", i, num[i]);
    }
    }
}
