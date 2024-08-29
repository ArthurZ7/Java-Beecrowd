/*----------------------------*
| ArthurZ7                    |
| BEE 4954 - FUNC03           |
| Trabalhando com vetores     |
*----------------------------*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		int tam = s.nextInt();
		int vet[] = new int[tam];
		
		for (int i=0; i<tam; i++){
		    vet[i] = s.nextInt();
		} 
		
		formatarVetor(vet);
		
		s.close();
	}
	
	 static void formatarVetor(int vetor[]) {
        System.out.print("{");
		for (int i=0; i<vetor.length; i++){
		    System.out.printf("%d", vetor[i]);
		    if (i<vetor.length-1){
		        System.out.printf(",");
		    }
		}
		System.out.print("}\n");
    }
}
