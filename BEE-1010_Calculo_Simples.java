/*---------------------*
| ArthurZ7             |
| BEE 1010             |
| Cálculo Simples      |
*---------------------*/
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);

    int a1 = s.nextInt();
    int a2 = s.nextInt();
    double a3 = s.nextDouble();
    
    int b1 = s.nextInt();
    int b2 = s.nextInt();
    double b3 = s.nextDouble();
        
    System.out.printf("VALOR A PAGAR: R$ %.2f", (a2*a3)+(b2*b3));
    System.out.println();
    s.close ();
  }
}