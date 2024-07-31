/*--------------------------*
| ArthurZ7                  |
| BEE 4768                  |
| ERW05 - validar salarios  |
*--------------------------*/
import java.util.Scanner;
public class Main
{
    public static void main (String[]args)
    {
    Scanner s = new Scanner (System.in);

    double salario= s.nextDouble();
    double media=0;
    int count=0;
    
    while (salario>0 && salario<100000) {
        media+= salario;
        count++;
        
        salario = s.nextDouble();
    }
    
    media = media / count;
    System.out.printf("R$ %.2f\n", media);    
    }
}