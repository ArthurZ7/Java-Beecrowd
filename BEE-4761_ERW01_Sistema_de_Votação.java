/*-----------------------------*
| ArthurZ7                     |
| BEE 4761                     |
| ERW01 - sistema de votação   |
*-----------------------------*/
import java.util.Scanner;
public class Main
{
    public static void main (String[]args)
    {
    Scanner s = new Scanner (System.in);

    int voto=1;
    int cand1=0; // voto 1
    int cand2=0; // voto 2
    int cand3=0; // voto 3
    int nulos=0; // voto 4
    int brancos=0; // voto 5

    while (voto>0 && voto<6) {
        voto = s.nextInt();
        
        if (voto==1){
            cand1++;
       } else if (voto==2){
            cand2++;
       } else if (voto==3){
            cand3++;
       } else if (voto==4){
            nulos++;
       } else if (voto==5){
            brancos++;
       } 
    }
    
    System.out.printf("Candidato 1 : %d voto(s)\n", cand1);
    System.out.printf("Candidato 2 : %d voto(s)\n", cand2);
    System.out.printf("Candidato 3 : %d voto(s)\n", cand3);
    System.out.printf("Nulos : %d voto(s)\n", nulos);
    System.out.printf("Brancos : %d voto(s)\n", brancos);
    }
}