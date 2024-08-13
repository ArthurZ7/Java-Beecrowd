/*----------------------------*
| ArthurZ7                    |
| BEE 1174                    |
| Seleçao em Vetor I          |
*----------------------------*/
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    Scanner s = new Scanner (System.in);
        
	int n = 100;
	double num[] = new double[n];
	
	for (int i=0; i<n ; i++) {
	    num[i] = s.nextDouble();
    }
    
    for (int i=0; i<n; i++) {
        if (num[i] <= 10) {
            System.out.printf("A[%d] = %.1f\n", i, num[i]);
        } 
    }
    }
}
