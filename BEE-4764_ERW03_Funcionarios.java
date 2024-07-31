/*--------------------------*
| ArthurZ7                  |
| BEE 4764                  |
| ERW03 - funcionários      |
*--------------------------*/
import java.util.Scanner;
public class Main
{
    public static void main (String[]args)
    {
    Scanner s = new Scanner (System.in);

    int idade=0;
    char sexo;
    double salario=0;
    char continuar = 's';
    
    double mediaSalarios = 0;
    int maior = Integer.MIN_VALUE;
 	int menor = Integer.MAX_VALUE;
    int salariosMulheresMaior = 0;
    
    int count = 0;
    
    while (continuar == 's') {
        idade = s.nextInt();
        sexo = s.next().charAt(0);
        salario = s.nextDouble();
        
        mediaSalarios += salario; // soma cada um dos salários
        
        if (idade>maior){ // descobre a maior e menor idade
            maior=idade;
        }
        if (idade<menor){
            menor=idade;
        }
        
        if (sexo == 'f' && salario>3000){   
            salariosMulheresMaior++;
        }
        
        
        count++;
        continuar = s.next().charAt(0); // "s" (sim) ou "n" (não)
    };
    
    mediaSalarios = mediaSalarios / count;   // divide a soma dos salarios com o total de casos
    System.out.printf("Media salarios = R$ %.2f\n", mediaSalarios);
    System.out.printf("Menor e maior idade = %d e %d\n", menor, maior);
    System.out.printf("Salarios de mulheres acima de R$ 3000.00 = %d\n", salariosMulheresMaior);
    }
}