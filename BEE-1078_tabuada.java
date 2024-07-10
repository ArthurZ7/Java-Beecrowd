/*----------------------*
| ArthurZ7             |
| BEE 1078             |
| Tabuada              |
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
    } while (N<2 && N>1000);
    
    for (int i=1; i<=10; i++){
        System.out.printf("%d x %d = %d\n", i, N, i*N);
    }
    s.close ();
    }
}