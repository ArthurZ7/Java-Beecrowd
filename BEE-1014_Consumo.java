/*---------------------*
| ArthurZ7             |
| BEE 1014             |
| Consumo              |
*---------------------*/
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);
    
    int X = s.nextInt();
    double Y = s.nextDouble();
    
    System.out.printf("%.3f km/l\n", X/Y); 
    s.close ();
  }
}