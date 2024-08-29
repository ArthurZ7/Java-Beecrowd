/*-----------------------*
| ArthurZ7               |
| BEE 4953 - FUNC02      |
| Somar Números          |
*-----------------------*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		System.out.println(somarNum(num1, num2));
		
		s.close();
	}
	
	static int somarNum(int numero1, int numero2) {
	    return numero1 + numero2;
	} 
}
