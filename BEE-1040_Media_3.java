/*---------------------*
| ArthurZ7             |
| BEE 1040             |
| Média 3              |
*---------------------*/
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);

    float A = s.nextFloat()*2;
    float B = s.nextFloat()*3;
    float C = s.nextFloat()*4;
    float D = s.nextFloat()*1;
    float MEDIA = (A+B+C+D)/10;
    
    System.out.printf("Media: %.1f\n", MEDIA);
    
    if (MEDIA >= 7.0){
        System.out.print("Aluno aprovado.\n");
    }
    else if (MEDIA < 5.0){
        System.out.printf("Aluno reprovado.\n");
    }
    else {
        System.out.print("Aluno em exame.\n"); 
        
        float E = s.nextFloat();
        System.out.printf("Nota do exame: %.1f\n", E);
        if ((MEDIA+E)/2 > 5) {
            System.out.print("Aluno aprovado.\n");
        }
        else {
            System.out.print("Aluno reprovado.\n");
        }
        System.out.printf("Media final: %.1f\n", (MEDIA+E)/2);
    }
    s.close ();
  }
}