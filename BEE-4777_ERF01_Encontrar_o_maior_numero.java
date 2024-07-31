/*-----------------------------------*
| ArthurZ7                          |
| BEE 4777                          |
| ERF01 - Encontrar o maior número  |
*-----------------------------------*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	Scanner s = new Scanner (System.in);
	
	int n= s.nextInt();
    int maior = Integer.MIN_VALUE;
    
	for (int i=0; i<n ; i++){
	    int a= s.nextInt();
	    if (a>maior){ 
            maior=a;
        }
	}
	System.out.printf("Maior = %d", maior);
	
	}
}
