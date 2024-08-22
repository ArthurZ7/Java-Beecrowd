/*---------------------------------*
| ArthurZ7                         |
| BEE 4934                         |
| VET04 - Imprimir negativos       |
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
	}
	
    for (int i=1; i<=tam; i++) {
        if (vet[tam-i]<0){
            System.out.printf("%d\n", vet[tam-i]);
        } 
    }
    }
}
