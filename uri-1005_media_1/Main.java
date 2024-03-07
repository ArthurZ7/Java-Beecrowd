/*---------------------*
| ArthurZ7             |
| URI 1005             |
| Média 1              |
*---------------------*/
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);

    double A = s.nextDouble()*3.5;
    double B = s.nextDouble()*7.5;
    double MEDIA = (A+B)/11;
        
    System.out.printf("MEDIA = %.5f", MEDIA);
    System.out.println();
    s.close ();
  }
}

