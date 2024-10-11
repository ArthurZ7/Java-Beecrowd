/*-----------------------------------*
| ArthurZ7                           |
| BEE 5219                           |
| REC07 - Soma Recursiva de Digitos  |
*-----------------------------------*/
import java.util.Scanner;

public class Main {
    
    
	public static void main (String[]args) {
		Scanner s = new Scanner (System.in);
		
		int n = s.nextInt();
		System.out.print(somaDigitos(n, 0) + "\n");
        
		s.close ();
	}
	
	public static int somaDigitos (int num, int soma) {
	    
	    if (num > 0) {
            soma += num % 10;
            num/=10;
            return somaDigitos(num, soma);
	    } 
	    
        return repeteSoma(soma);
	}
	
	public static int repeteSoma (int soma) {
	    if (soma > 9){
	        return somaDigitos(soma, 0);
	    }
        return soma;
	}
}