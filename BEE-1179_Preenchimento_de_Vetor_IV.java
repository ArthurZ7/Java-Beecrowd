/*----------------------------*
| ArthurZ7                    |
| BEE 1179                    |
| Preenchimento de Vetor IV   |
*----------------------------*/
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    Scanner s = new Scanner (System.in);
    
    int valor = 15;
    
	int tam = 5;
	int par[] = new int[tam];
	int impar[] = new int[tam];
	int num[] = new int[valor];
	int countPar = 0;
	int countImpar = 0;
	
	for (int i=0; i<valor; i++) {
        num[i] = s.nextInt();
	}
	
    // Preencher vetores (par e impar)
    for (int i=0; i<valor; i++) {
        if (num[i]%2 == 0){
            par[countPar] = num[i];
            countPar++;
            // Caso a última posição esteja preenchida, imprime e zera o vetor
            if (countPar == 5){
               for (int j=0; j<5; j++) {
                    System.out.printf("par[%d] = %d\n", j, par[j]);
                }
                countPar = 0;
            }
            
        } else {
            impar[countImpar] = num[i];
            countImpar++;
            if (countImpar == 5){
                for (int j=0; j<5; j++) {
                    System.out.printf("impar[%d] = %d\n", j, impar[j]);
                }
                countImpar = 0;
            }
        }
    }
    
    // Imprime o restante
    for (int j=0; j<countImpar; j++) {
        System.out.printf("impar[%d] = %d\n", j, impar[j]);
    }
    for (int j=0; j<countPar; j++) {
        System.out.printf("par[%d] = %d\n", j, par[j]);
    }
    }
}
