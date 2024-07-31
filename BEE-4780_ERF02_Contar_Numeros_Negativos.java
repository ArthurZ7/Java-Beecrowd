/*-----------------------------------*
| ArthurZ7                          |
| BEE 4780                          |
| ERF02 - Contar números negativos  |
*-----------------------------------*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	Scanner s = new Scanner (System.in);
	
	int n= s.nextInt();
    int negativos = 0;
    
	for (int i=0; i<n ; i++){
	    int a= s.nextInt();
	    if (a<0){ 
            negativos++;
        }
	}
	System.out.println(negativos);
	
	}
}
