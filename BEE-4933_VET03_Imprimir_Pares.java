/*---------------------------------*
| ArthurZ7                         |
| BEE 4933                         |
| VET03 - Imprimir Pares           |
*---------------------------------*/
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    Scanner s = new Scanner (System.in);
    
    int tam = s.nextInt();
	int vet[] = new int[tam];
	int par = 0;
	
	for (int i=0; i<tam; i++) {
        vet[i] = s.nextInt();
        
        if (vet[i]%2 == 0){
            par++;
        }
	}
	
	System.out.printf(par + "\n{");
    for (int i=0; i<tam; i++) {
        if (vet[i]%2 == 0){
            System.out.printf("%d", vet[i]);
        if (i < tam-1){
           System.out.printf(";"); 
        }
        } 
    }
    System.out.print("}\n");
    }
}
