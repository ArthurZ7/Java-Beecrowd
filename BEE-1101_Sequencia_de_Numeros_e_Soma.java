/*-----------------------------*
| ArthurZ7                     |
| BEE 1101                     |
| Sequência de Números e Soma  |
*-----------------------------*/
import java.util.Scanner;
public class Main
{
    public static void main (String[]args)
    {
    Scanner s = new Scanner (System.in);
    
    int maior, menor, soma=0;
    int N = s.nextInt();
    int M = s.nextInt();
    
    while (N > 0 && M > 0) {
        
        
        if (N < M){
            menor = N;
            maior = M;
        } else {
            menor = M;
            maior = N;
        }
        
        while (menor <= maior){
            System.out.print(menor + " ");
            soma+= menor;
            menor++;
        }
        System.out.printf("Sum=%d\n", soma);
        soma=0;
        
        N = s.nextInt();
        M = s.nextInt();
    }
    }
}