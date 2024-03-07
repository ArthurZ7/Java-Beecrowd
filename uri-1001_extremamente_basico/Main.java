/*---------------------*
| ArthurZ7             |
| URI 1001             |
| Extremamente Básico  |
*---------------------*/
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);

    int A, B, X;

    A = s.nextInt();
	B = s.nextInt();
      
    X = A + B;
        
    System.out.println ("X = " + X);
    s.close ();
  }
}

