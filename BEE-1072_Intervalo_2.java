/*----------------------*
| ArthurZ7             |
| BEE 1072             |
| Intervalo 2          |
*----------------------*/
import java.util.Scanner;
public class Main
{
    public static void main (String[]args)
    {
    Scanner s = new Scanner (System.in);
    
    int N = s.nextInt();
    int in=0, out=0;
    
    for (int i=0; i<N; i++){
        int X = s.nextInt();
        if (X <= 20 & X >= 10){
            in++;
        } else{
            out++;
        }
    }
        System.out.printf("%d in\n", in);
        System.out.printf("%d out\n", out);
    s.close ();
    }
}