/*---------------------*
| ArthurZ7             |
| BEE 1006             |
| Média 2              |
*---------------------*/
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);

    double A = s.nextDouble()*2;
    double B = s.nextDouble()*3;
    double C = s.nextDouble()*5;
    double MEDIA = (A+B+C)/10;
        
    System.out.printf("MEDIA = %.1f", MEDIA);
    System.out.println();
    s.close ();
  }
}

