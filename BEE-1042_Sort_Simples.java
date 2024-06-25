/*---------------------------*
| ArthurZ7                  |
| BEE 1042                  |
| Sort Simples              |
*--------------------------*/
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    Scanner ler = new Scanner (System.in);
        
	int[] vet = new int[3];
	int[] vet2 = new int[3];
	int aux = 0;
	int i = 0;
    
    //entrada do vetor
	for(i = 0; i<3; i++){
		vet[i] = ler.nextInt();
		vet2[i] = vet[i];
	}
	
    // bubble sort
    for(i = 0; i<3; i++){
		for(int j = 0; j<2; j++){
			if(vet[j] > vet[j + 1]){
				aux = vet[j];
				vet[j] = vet[j+1];
				vet[j+1] = aux;
			}
		}
	}
    
	//Vetor organizado
	for(i = 0; i<3; i++){
		System.out.println(vet[i]);
	}
	
	System.out.println("");
	
	//Vetor desorganizado
	for(i = 0; i<3; i++){
		System.out.println(vet2[i]);
    }
    }
}
