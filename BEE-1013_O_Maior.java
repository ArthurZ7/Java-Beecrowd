/*---------------------*
| ArthurZ7             |
| BEE 1013             |
| O Maior              |
*---------------------*/
import java.util.Scanner;
import java.lang.Math;
public class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);
    
    int A = s.nextInt();
    int B = s.nextInt();
    int C = s.nextInt();
    
    double maiorAB = (A+B+Math.abs(A-B))/2;
    double maior = (maiorAB+C+Math.abs(maiorAB-C))/2;
    
    System.out.printf("%.0f eh o maior\n", maior); 
    s.close ();
  }
}
