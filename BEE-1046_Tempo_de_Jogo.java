/*--------------------*
| ArthurZ7            |
| BEE 1046            |
| Tempo de Jogo       |
*--------------------*/
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);

    int hi = s.nextInt();
    int hf = s.nextInt();
    int total;
    
    if (hi<hf){
        total = hf - hi;
        System.out.printf("O JOGO DUROU %d HORA(S)\n", total);
    }
    else if (hi>hf){
        total = hf + 24 - hi;
        System.out.printf("O JOGO DUROU %d HORA(S)\n", total);
    }
    else if (hi == hf){
        System.out.println("O JOGO DUROU 24 HORA(S)");
    }
    s.close ();
  }
}