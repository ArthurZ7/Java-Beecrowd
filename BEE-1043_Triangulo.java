/*-----------------*
| ArthurZ7         |
| BEE 1043         |
| Triangulo        |
*-----------------*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	Scanner s = new Scanner (System.in);
	
	double a= s.nextDouble();
	double b= s.nextDouble();
	double c= s.nextDouble();
	double area=0;
	double perimetro=0;
	
	if ((a+b > c) && (b+c > a) && (a+c > b)){
	    perimetro = a + b + c;
	    System.out.printf("Perimetro = %.1f\n", perimetro);
	} else {
	    area = ((a+b)*c)/2;
	    System.out.printf("Area = %.1f\n", area);
	}
	
	}
}
