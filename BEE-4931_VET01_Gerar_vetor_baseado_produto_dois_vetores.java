/*---------------------------------*
| ArthurZ7                         |
| BEE 4931                         |
| VET01 - Gerar vetor baseado      |
| no produto de dois vetores       |
*---------------------------------*/
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    Scanner s = new Scanner (System.in);
    
    int tam = s.nextInt();
	int vet1[] = new int[tam];
	int vet2[] = new int[tam];
	
	int prod[] = new int[tam];
	
	for (int i=0; i<tam; i++) {
        vet1[i] = s.nextInt();
	}
	
    for (int i=0; i<tam; i++) {    
        vet2[i] = s.nextInt();
        
        prod[i] = vet1[i]*vet2[i];
	}
    
    System.out.print("{");
    for (int i=0; i<tam; i++) {
        System.out.printf("%d", prod[i]);
        if (i < tam-1){
           System.out.printf(","); 
        } 
    }
    System.out.print("}\n");
    }
}
