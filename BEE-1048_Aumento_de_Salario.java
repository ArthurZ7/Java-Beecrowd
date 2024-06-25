/*-----------------------*
| ArthurZ7               |
| BEE 1048               |
| Aumento de Salário     |
*-----------------------*/
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);

    double salario = s.nextDouble();
    double aumento = 0;
    int percentual = 0;
    
    if (salario>=0 && salario<=400){
       aumento = salario * 0.15;
       salario += aumento;
       percentual += 15;
    }
    else if(salario>400 && salario<=800){
       aumento = salario * 0.12;
       salario += aumento;
       percentual += 12;
    }
    else if(salario>800 && salario<=1200){
       aumento = salario * 0.10;
       salario += aumento;
       percentual += 10;
    }
    else if(salario>1200 && salario<=2000){
       aumento = salario * 0.07;
       salario += aumento;
       percentual += 7;
    }
    else if(salario>2000){
       aumento = salario * 0.04;
       salario += aumento;
       percentual += 4;
    }
    System.out.printf("Novo salario: %.2f\n", salario);
    System.out.printf("Reajuste ganho: %.2f\n", aumento);
    System.out.printf("Em percentual: %d %%\n", percentual);
    s.close ();
  }
}