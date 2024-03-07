/*---------------------*
| ArthurZ7             |
| URI 1009             |
| Salário com Bonus    |
*---------------------*/
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);

    String A = s.nextLine();
    double B = s.nextDouble();
    double C = s.nextDouble();
        
    System.out.printf("TOTAL = R$ %.2f", B+C*(0.15));
    System.out.println();
    s.close ();
  }
}

