/*---------------------*
| ArthurZ7             |
| URI 1008             |
| Salário              |
*---------------------*/
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);

    int A = s.nextInt();
    int B = s.nextInt();
    double C = s.nextDouble();
        
    System.out.println("NUMBER = " + A);
    System.out.printf("SALARY = U$ %.2f", B*C);
    System.out.println();
    s.close ();
  }
}

