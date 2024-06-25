/*-------------------------------*
| ArthurZ7                      |
| BEE 1015                      |
| Distância Entre Dois Pontos   |
*------------------------------*/
import java.util.*;
import java.lang.Math;
public class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);

    double x1 = s.nextDouble();
    double y1 = s.nextDouble();
    double x2 = s.nextDouble();
    double y2 = s.nextDouble();
    
    double d = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
    
    System.out.printf("%.4f\n", d);
    s.close ();
  }
}