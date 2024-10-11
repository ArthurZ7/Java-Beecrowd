/*-------------------------*
| ArthurZ7                 |
| BEE 5211                 |
| REC04 - SOMA DE IMPARES  |
*-------------------------*/
import java.util.Scanner;

public class Main {
    
    static int soma = 0;
    
	public static void main (String[]args) {
		Scanner s = new Scanner (System.in);
		
		int n = s.nextInt();  // Quantidade de números a serem analisado
		
		somaImpar(n, 1);
        
		s.close ();
	}
	
	public static void somaImpar (int num, int cont) {
	    
	    if (cont > num){
	        return;
	    }
	    
	    System.out.print(cont);
	    soma+= cont;
	    
	    if (cont < num-1){
	        System.out.print(" + ");
	    } else {
	        System.out.printf(" = %d\n", soma);
	    }
	    
	    
	    cont = cont + 2; // Próximo impar
	    somaImpar(num, cont);
	    
	}
}