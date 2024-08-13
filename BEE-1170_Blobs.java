/*----------------*
| ArthurZ7        |
| BEE 1170        |
| Blobs           |
*-----------------*/
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    Scanner s = new Scanner (System.in);
        
	int n = s.nextInt();
	double x[] = new double[n];
	int dias = 0;
	
	for (int i=0; i<n ; i++) {
	    x[i] = s.nextDouble();
	    
	    while (x[i] > 1) {
	        x[i] /= 2;
	        dias++;
	    }
	    System.out.println(dias + " dias");
	    dias = 0;
    }

    }
}
