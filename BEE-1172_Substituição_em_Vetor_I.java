/*----------------------------*
| ArthurZ7                    |
| BEE 1172                    |
| Substituição em Vetor I     |
*----------------------------*/
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    Scanner s = new Scanner (System.in);
        
	int n = 10;
	int num[] = new int[n];
	
	for (int i=0; i<n ; i++) {
	    num[i] = s.nextInt();

	    if (num[i] <= 0) {
	        num[i] = 1;
	    } 
    }
    
    for (int i=0; i<n; i++) {
        System.out.printf("X[%d] = %d\n", i, num[i]);
    }
    }
}
