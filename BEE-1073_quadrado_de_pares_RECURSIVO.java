/*-------------------------*
| Arthur Borges            |
| BEE 1073                 |
| Quadrado de Pares        |
*-------------------------*/
import java.util.Scanner;

public class Main {

    public static void quadradoPares(int num, int cont) {
        if (cont > num) {
           return;
        }
        else if (num%2 != 0){
            quadradoPares(num--, cont);
            
        } else {
            System.out.printf("%d^2 = %d\n", cont, cont*cont);
            quadradoPares(num, cont+2);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int x = s.nextInt();
        int cont = 2;
        
        quadradoPares(x, cont);
        s.close();
    }
}
