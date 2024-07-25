/*------------------------*
| ArthurZ7                |
| BEE 1103                |
| Alarme Despertador      |
*------------------------*/
import java.util.Scanner;
public class Main
{
    public static void main (String[]args)
    {
    Scanner s = new Scanner (System.in);
    
    int H1 = s.nextInt();
    int M1 = s.nextInt();
    int H2 = s.nextInt();
    int M2 = s.nextInt();
    
    int totalMin=0;
    int horas=0;
    int minutos=0;
    
    while (H1>0 || H2>0 || M1>0 || M2>0) {
    
        if (H1 == H2 && M1 > M2) { // caso seja a mesma hora, mas no dia seguinte
            horas = 24;
            
        } else if (H1 > H2) {
            horas = (24 - H1 + H2); // calcula a distancia da primeira para a segunda hora, passando pela meia noite
           
        } else {
            horas = H2 - H1;
        }
        
        minutos = M1 - M2; // calc dif. dos minutos
        totalMin = (horas * 60) - minutos; // subtrai as horas (em minutos) com a dif dos minutos
        
        System.out.print(totalMin);
        System.out.println();
        
        H1 = s.nextInt();
        M1 = s.nextInt();
        H2 = s.nextInt();
        M2 = s.nextInt();
    }
    }
}