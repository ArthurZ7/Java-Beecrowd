/*-----------------------------*
| ArthurZ7                     |
| BEE 1160                     |
| Crescimento Populacional     |
*-----------------------------*/
import java.util.Scanner;
public class Main
{
    public static void main (String[]args)
    {
    Scanner s = new Scanner (System.in);
    
    int T = s.nextInt();
    double taxaAnoA=0;
    double taxaAnoB=0;
    int anos=0;
    
    for (int i=0; i<T; i++){
        int PA = s.nextInt();
        int PB = s.nextInt();
        double G1 = s.nextDouble();
        double G2 = s.nextDouble();
        
        // passar os anos enquanto a popul de A for menor que a popul de B
        while (PA<=PB && anos<=100) { 
            taxaAnoA = PA*(G1/100);
            taxaAnoB = PB*(G2/100);
            
            // Soma a população com o crescimento popul do ano
            PA += taxaAnoA; 
            PB += taxaAnoB;
            
            anos++;
        }
        
        if (anos<=100) {
            System.out.printf("%d anos.\n", anos); 
        } else {
            System.out.println("Mais de 1 seculo.");
        }
        anos = 0;
    }
    }
}