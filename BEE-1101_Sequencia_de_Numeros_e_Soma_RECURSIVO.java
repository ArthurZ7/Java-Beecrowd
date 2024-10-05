/*------------------------------*
| Arthur Borges                 |
| BEE 1101                      |
| Sequência de Números e Soma   |
*------------------------------*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n;
        int m;
        
        do {
            n = s.nextInt();
            m = s.nextInt();
            
            int menor = 0;
            int maior = 0;
            
            if (n > m){
                maior = n;
                menor = m;
            } else {
                maior = m;
                menor = n;
            }
            
            sequenciaSoma(menor, maior, 0); 
        } while ((n>0) && (m>0));
        s.close();
    }
    
    public static void sequenciaSoma(int a, int b, int soma) {
        
        if (a > b){
            System.out.printf("Sum=%d\n", soma);
            return;
        }
            
        System.out.print(a + " ");
        
        sequenciaSoma(a+1, b, soma + a);
    }
}
