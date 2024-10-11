/*----------------------------*
| ArthurZ7                    |
| BEE 1177                    |
| Preenchimento de Vetor II   |
|       RECURSIVO             |
*----------------------------*/
import java.util.Scanner;

public class Main {
    
    static int vet [] = new int [1000];
    static int tam = 0;
    
	public static void main (String[]args) {
		Scanner s = new Scanner (System.in);
		

		int n = s.nextInt();
        preencheVet(n, 0);
        
        for (int i=0; i<1000; i++){
		    System.out.printf("N[%d] = %d\n", i, vet[i]);
        } 
        
		s.close ();
	}
	
	public static void preencheVet (int num, int x) {
	    
	    if (tam >= 1000){
	        return;
	    }
	    
	    vet[tam] = x;
	    tam++;
	    
        if (x<num-1) {
		    preencheVet(num, x+ 1);
	    } else {
	        preencheVet(num, x=0);
	    }
	    
	    
	}
}