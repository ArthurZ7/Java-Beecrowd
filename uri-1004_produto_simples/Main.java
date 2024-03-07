/*---------------------*
| ArthurZ7             |
| URI 1004             |
| Produto Simples      |
*---------------------*/
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);

    int A = s.nextInt();
    int B = s.nextInt();
    int PROD = A*B;
        
    System.out.println("PROD = " + PROD);
    s.close ();
  }
}

