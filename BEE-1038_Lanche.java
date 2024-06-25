/*---------------------*
| ArthurZ7             |
| BEE 1038             |
| Lanche               |
*---------------------*/
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);

    int X = s.nextInt();
    int Y = s.nextInt();
    double soma=0;
    
    if (X==1) {
        soma = Y*4;
    }
    else if (X==2) {
        soma = Y*4.50;
    }
    else if (X==3) {
        soma = Y*5;
    }
    else if (X==4) {
        soma = Y*2;
    }
    else if (X==5) {
        soma = Y*1.50;
    } 
    
    System.out.printf("Total: R$ %.2f\n", soma);
    s.close ();
  }
}