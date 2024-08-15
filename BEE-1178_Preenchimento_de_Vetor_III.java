/*----------------------------*
| ArthurZ7                    |
| BEE 1178                    |
| Preenchimento de Vetor III   |
*----------------------------*/
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    Scanner s = new Scanner (System.in);
        
	int tam = 100;
	double num[] = new double[tam];
	num[0] = s.nextDouble();
	
	for (int i=1; i<tam; i++) {
        num[i] += num[i- 1]/2;
    }
    
    for (int i=0; i<tam; i++) {
        System.out.printf("N[%d] = %.4f\n", i, num[i]);
    }
    }
}
