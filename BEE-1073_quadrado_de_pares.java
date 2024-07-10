/*----------------------*
| ArthurZ7             |
| BEE 1073             |
| Quadrado de Pares    |
*----------------------*/
import java.util.Scanner;
public class Main
{
    public static void main (String[]args)
    {
    Scanner s = new Scanner (System.in);
    
    int N=0;
    
    do {
        N = s.nextInt();
    } while (N<5 && N<2000);
    
    for (int i=2; i<=N; i=i+ 2){
        System.out.printf("%d^2 = %d\n", i, i*i);
    }
    s.close ();
    }
}