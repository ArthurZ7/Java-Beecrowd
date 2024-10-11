/*-------------------------*
| ArthurZ7                 |
| BEE 5215                 |
| REC06 - Corrigir         |
|  funcao recursiva ff     |
*-------------------------*/
import java.util.Scanner;

public class Main {
    
	public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("ff(" + n + ") = " + funcaoFF(n));
        s.close();
    }
	
	// Função com erro:
    private static int funcaoFF(int n) {
        if (n <= 1){      // (n == 1) - esta errado, pois deve abranger numeros negativos tbm
            return 1;     //funcaoFF(n-1); - não deve chamar a função novamente, pois deve ter o caso de parada
        }else if (n % 2 == 0){
            return funcaoFF(n/2);
        }else {
            return funcaoFF((n-1)/2) + funcaoFF((n+1)/2);
        }      
    }
}