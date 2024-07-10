/*----------------------*
| ArthurZ7             |
| BEE 1074             |
| Par ou Ímpar         |
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
    
    for (int i=0; i<N; i++){
        int X = s.nextInt();
        if (X==0){
            System.out.print("NULL\n");
        } else {
            if (X%2==0){
                System.out.printf("EVEN ");
            } else {
                System.out.printf("ODD ");
            }
            if (X>0){
                System.out.printf("POSITIVE\n");
            } else {
                System.out.printf("NEGATIVE\n");
            }
        }
    }
    s.close ();
    }
}