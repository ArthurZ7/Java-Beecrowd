/*---------------------------------*
| ArthurZ7                         |
| BEE 4932                         |
| VET02 - Imprimir elementos       |
| baseado em X                     |
*---------------------------------*/
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    Scanner s = new Scanner (System.in);
    
    int tam = s.nextInt();
	int vet[] = new int[tam];
	
	for (int i=0; i<tam; i++) {
        vet[i] = s.nextInt();
	}
	
	int x = s.nextInt();
	
    for (int i=0; i<tam; i++) {
        if (i%x == 0){
            System.out.printf("Pos[%d] = %d\n", i, vet[i]);
        } 
    }
    }
}
