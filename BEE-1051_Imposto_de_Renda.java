/*---------------------------*
| ArthurZ7                  |
| BEE 1051                  |
| Imposto de Renda          |
*--------------------------*/
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);

    double salario = s.nextDouble();
    double total, valor1, valor2;
    
    valor1 = 1000*0.08;
    valor2 = 1500*0.18;
    
    
    if (salario<=2000){
        System.out.println("Isento");
    }
    else if (salario>2000 && salario<=3000){
        salario -= 2000;
        total = salario*0.08;
        System.out.println("R$ " + String.format("%.2f", total));
    }
    else if (salario>3000 && salario<=4500){
        salario -= 3000;
        total = (salario*0.18) + valor1;
        System.out.println("R$ " + String.format("%.2f", total));
    }
    else{
        salario -= 4500;
        total = (salario*0.28) + valor1 + valor2;
        System.out.println("R$ " + String.format("%.2f", total));
    s.close ();
    }
  }
}
