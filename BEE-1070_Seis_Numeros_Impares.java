/*-------------------------*
| ArthurZ7                |
| BEE 1070                |
| Seis Números Ímpares    |
*-------------------------*/
import java.util.Scanner;
public class Main
{
    public static void main (String[]args)
    {
    Scanner s = new Scanner (System.in);
    
    int X = s.nextInt();
    
    if (X%2 == 0){
        X++;
    }
        
    for (int i=0; i<6; i++){
        System.out.println(X);
        X = X + 2;
    }
    
    s.close ();
    }
}
