/*---------------------*
| ArthurZ7             |
| BEE 1007             |
| Diferença            |
*---------------------*/
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);

    int A = s.nextInt();
    int B = s.nextInt();
    int C = s.nextInt();
    int D = s.nextInt();
    int DIFERENCA = (A * B - C * D);
        
    System.out.println("DIFERENCA = " + DIFERENCA);
    s.close ();
  }
}

