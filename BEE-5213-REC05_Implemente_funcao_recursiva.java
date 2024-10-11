/*-------------------------*
| ArthurZ7                 |
| BEE 5213                 |
| REC05 - Implemente       |
|  a função recursiva      |
*-------------------------*/
import java.util.Scanner;

public class Main {
    
	public static void main (String[]args) {
		Scanner s = new Scanner (System.in);
		
		int m = s.nextInt(); 
		int n = s.nextInt();
		
		System.out.printf("h(%d,%d) = %d\n", m, n, funcH(m, n));
        
		s.close ();
	}
	
	public static int funcH (int m, int n) {

	    if (n == 1) {
            return m+1;
        } else if (m == 1) {
            return n+1;
        } else {
            return funcH(m, n - 1) + funcH(m - 1, n);
        }
	}
}