/*-------------------*
| ArthurZ7           |
| BEE 1115           |
| Quadrante          |
*-------------------*/
import java.util.Scanner;
public class Main
{
    public static void main (String[]args)
    {
    Scanner s = new Scanner (System.in);
    
    int X = s.nextInt();
    int Y = s.nextInt();
    
    while (X != 0 && Y != 0) {
        
        if (X > 0 && Y > 0){
            System.out.printf("primeiro\n");
        } if (X < 0 && Y > 0){
            System.out.printf("segundo\n");
        } if (X < 0 && Y < 0) {
            System.out.printf("terceiro\n");
        } if (X > 0 && Y < 0) {
            System.out.printf("quarto\n");
        }
        
        X = s.nextInt();
        Y = s.nextInt();
    }
    }
}