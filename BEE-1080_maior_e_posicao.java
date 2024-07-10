/*----------------------*
| ArthurZ7             |
| BEE 1080             |
| Maior e Posição      |
*----------------------*/
import java.util.Scanner;
public class Main
{
    public static void main (String[]args)
    {
    Scanner s = new Scanner (System.in);
    
    int max=10, N=0;
    int maior=0, pos=0;
    for (int i=1; i<=max; i++){
        N = s.nextInt();
        if (N>maior){
            maior=N;
            pos=i;
        }
    }
    System.out.println(maior);
    System.out.println(pos);
    s.close ();
    }
}