/*----------------------*
| ArthurZ7             |
| BEE 1075             |
| Resto 2 - Recursivo  |
*----------------------*/
import java.util.Scanner;

public class Main {
    
    static int cont = 0;
    
	public static void main (String[]args) {
		Scanner s = new Scanner (System.in);
		
		// N = numero que será dividido
		int N=0;
		do {
			N = s.nextInt();
		} while (N <= 0 || N > 10000);
        
        restoDois(N);
        
		s.close ();
	}
	
	public static void restoDois (int num) {
	    
	    if (cont > 10000){
	        return;
	    }
	    
        if (cont%num==2) {
		    System.out.println(cont);
	    }

	    cont++;
	    
	    restoDois (num);
	    
	}
}