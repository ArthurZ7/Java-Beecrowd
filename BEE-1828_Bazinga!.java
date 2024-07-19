/*-----------------*
| ArthurZ7         |
| BEE 1828         |
| Bazinga!         |
*-----------------*/
import java.util.Scanner;
public class Main
{
    public static void main (String[]args)
    {
    Scanner s = new Scanner (System.in);
    
    int t = s.nextInt();
    
    for (int i=1; i<=t; i++){
        String sheldon = s.next();
        String raj = s.next();
    
        if (sheldon.equals(raj)){
            System.out.printf("Caso #%d: De novo!\n", i);
        }else if ( 
        sheldon.equals("tesoura") && raj.equals("papel") ||
        sheldon.equals("tesoura") && raj.equals("lagarto") ||
        sheldon.equals("papel") && raj.equals("pedra") ||
        sheldon.equals("papel") && raj.equals("Spock") ||
        sheldon.equals("pedra") && raj.equals("lagarto") ||
        sheldon.equals("pedra") && raj.equals("tesoura") ||
        sheldon.equals("lagarto") && raj.equals("Spock") ||
        sheldon.equals("lagarto") && raj.equals("papel") ||
        sheldon.equals("Spock") && raj.equals("tesoura") ||
        sheldon.equals("Spock") && raj.equals("pedra"))
        {
            System.out.printf("Caso #%d: Bazinga!\n", i);
    
        } else{
            System.out.printf("Caso #%d: Raj trapaceou!\n", i);
        }
    }
    }
}