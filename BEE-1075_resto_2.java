/*----------------------*
| ArthurZ7             |
| BEE 1075             |
| Resto 2              |
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
    } while (N>10000);
    
    for (int i=0; i<10000; i++){
        if (i%N==2){
            System.out.println(i);
        }
    }
    s.close ();
    }
}