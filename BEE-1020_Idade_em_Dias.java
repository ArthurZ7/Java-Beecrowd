/*---------------------*
| ArthurZ7             |
| BEE 1020             |
| Idade em Dias        |
*---------------------*/
import java.util.Scanner;
public class Main
{
    public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);

    int a = s.nextInt();

    int anos = 0;
    int meses = 0;
    int dias = 0;

    while (a > 365) {
        anos++;
        a = a - 365; 
    }
    while (a >= 30) {
        if (meses < 12) {
            meses++;
            a = a - 30;
        }
    }
    dias = a;
    System.out.printf("%d ano(s)\n", anos);
    System.out.printf("%d mes(es)\n", meses);
    System.out.printf("%d dia(s)\n", dias);
    
    s.close();
  }
}