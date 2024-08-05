/*-----------------------*
| ArthurZ7               |
| BEE 4867 - ERW08       |
| Processando Inteiros   |
*-----------------------*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	Scanner s = new Scanner (System.in);
	
	int n = s.nextInt();
	int num = 0;
	int par=0, impar=0;
	double media=0;
	double soma=0;
	int count=0;
	
	while (soma <= n) {
	    num = s.nextInt();
	    
	    soma+= num;
	    
	    if (num%2==0){
            par++;
        } else {
            impar++;
        }
        
        count++;
	}
	
	media = soma/count;
	System.out.println("Pares = " + par);
	System.out.println("Impares = " + impar);
	System.out.printf("Média = %.2f\n", media);

	}
}
