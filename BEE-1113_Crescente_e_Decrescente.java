/*-----------------------------*
| ArthurZ7                     |
| BEE 1113                     |
| Crescente e Decrescente      |
*-----------------------------*/
import java.util.Scanner;
public class Main
{
    public static void main (String[]args)
    {
    Scanner s = new Scanner (System.in);
    
    int X = s.nextInt();
    int Y = s.nextInt();
    
    while (X != Y) {
        
        if (X > Y){
            System.out.printf("Decrescente\n");
        } else {
            System.out.printf("Crescente\n");
        }
        
        X = s.nextInt();
        Y = s.nextInt();
    }
    }
}