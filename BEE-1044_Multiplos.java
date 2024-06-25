/*--------------------*
| ArthurZ7            |
| BEE 1044            |
| Múltiplos           |
*--------------------*/
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);

    int A = s.nextInt();
    int B = s.nextInt();
    
    if (A>B){
       if (A%B == 0){
        System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
    else{
        if (B%A == 0){
        System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
    s.close ();
  }
}