/*-----------------------------*
| ArthurZ7                     |
| BEE 1041                     |
| Coordenadas de um ponto      |
*-----------------------------*/
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);

    double x = s.nextDouble();
    double y = s.nextDouble();
    
    if (y==0 && x==0){
        System.out.println("Origem");
    }
    else if (x==0){
        System.out.println("Eixo Y");
    }
    else if (y==0){
        System.out.println("Eixo X");
    }
    else if (x>0 && y>0){
        System.out.println("Q1");
    }
    else if (x<0 && y>0){
        System.out.println("Q2");
    }
    else if (x<0 && y<0){
        System.out.println("Q3");
    }
    else if (x>0 && y<0){
        System.out.println("Q4");
    }
    s.close ();
  }
}