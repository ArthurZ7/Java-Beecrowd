/*---------------------*
| ArthurZ7             |
| BEE 1013             |
| Área                 |
*---------------------*/
import java.util.Scanner;
import java.lang.Math;
public class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);
    
    double A = s.nextDouble();
    double B = s.nextDouble();
    double C = s.nextDouble();
    
    System.out.printf("TRIANGULO: %.3f\n", (A*C)/2);       // base * altura / 2
    System.out.printf("CIRCULO: %.3f\n", 3.14159*(C*C));   // pi * raio^2
    System.out.printf("TRAPEZIO: %.3f\n", ((A+B)*C)/2);    // ((base1 + base2) * altura) / 2
    System.out.printf("QUADRADO: %.3f\n", B*B);            // lado * lado
    System.out.printf("RETANGULO: %.3f\n", A*B);              // base * altura
    s.close ();
  }
}