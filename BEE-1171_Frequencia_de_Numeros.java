/*------------------------*
| ArthurZ7                |
| BEE 1171                |
| Frequência de Números   |
*------------------------*/
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    Scanner s = new Scanner (System.in);
        
	int n = s.nextInt();
	int num[] = new int[n];
	int posicao[] = new int[2000];
	
	for (int i=0; i<n ; i++) {
	    num[i] = s.nextInt();

	    // numero inserido == posição 
	    // incrementa na posição relativa ao numero inserido
        posicao[num[i] - 1]++;
    }
    
    for (int i=0; i<2000; i++) {
        if (posicao[i] > 0){
            System.out.printf("%d aparece %d vez(es)\n", i+ 1, posicao[i]);
        }
    }
    }
}
