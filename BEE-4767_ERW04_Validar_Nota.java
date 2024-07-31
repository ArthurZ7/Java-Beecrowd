/*--------------------------*
| ArthurZ7                  |
| BEE 4767                  |
| ERW04 - Validar Nota      |
*--------------------------*/
import java.util.Scanner;
public class Main
{
    public static void main (String[]args)
    {
    Scanner s = new Scanner (System.in);

    double nota=0;
    
    do{
        nota = s.nextInt();
        
        if ((nota<0 || nota>10) && (nota<100 || nota>200)) {
          System.out.println("nota invalida");  
        } 

    } while ((nota<0 || nota>10) && (nota<100 || nota>200));
    
    System.out.println(nota);    
    }
}