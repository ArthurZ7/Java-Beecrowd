/*------------------------------------*
| ArthurZ7                            |
| BEE 4763                            |
| ERW02 - validar ano de nascimento   |
*------------------------------------*/
import java.util.Scanner;
public class Main
{
    public static void main (String[]args)
    {
    Scanner s = new Scanner (System.in);

    int ano=0;

    do{
        ano = s.nextInt();
        
        if (ano>2023 || ano<1900) {
          System.out.println("Ano invalido");  
        } 

    } while (ano>2023 || ano<1900);
    
    System.out.println(ano);
    }
}