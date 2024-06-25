/*---------------------*
| ArthurZ7             |
| BEE 1011             |
| Esfera               |
*---------------------*/
import java.util.Scanner;
import java.lang.Math;
public class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);
    int R = s.nextInt();
    double volume = (4/3.0) * (3.14159) * Math.pow(R, 3);
    
    
    System.out.printf("VOLUME = %.3f", volume);
    System.out.println();
    s.close ();
  }
}