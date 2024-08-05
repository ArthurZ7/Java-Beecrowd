/*-----------------------*
| ArthurZ7               |
| BEE 4872 - ERW09       |
| Soma de números reais  |
*-----------------------*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	Scanner s = new Scanner (System.in);
	
	double num = s.nextDouble();
	double soma=0;
	int count=0;
	
	while (num >= 0) {
	    soma+= num;
        count++;
        
        num = s.nextDouble();
	}
	System.out.printf("Soma = %.2f\n", soma);
	System.out.printf("Quantidade = %d\n", count);
	}
}
