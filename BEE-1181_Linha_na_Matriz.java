/*------------------------*
| ArthurZ7                |
| BEE 1181                |
| Linha na Matriz         |
*------------------------*/
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    Scanner s = new Scanner (System.in);
        
	int tam = 12;
	double mat[][] = new double[tam][tam];
	// Matriz [LINHA] [COLUNA]
	
	int linha = s.nextInt();
	s.nextLine();
	char operacao = s.next().charAt(0); // 's' ou 'm'
	double soma = 0;
	double media = 0;
	
	for (int i=0; i<tam; i++) {
	    for (int j=0; j<tam; j++) {
    	    mat[i][j] = s.nextDouble();
            
            if (i == linha) {
                soma += mat[linha][j];
            }
	    }
    }
    
    if (operacao == 'M') {
        media = soma/tam;
        System.out.printf("%.1f\n", media);
    } else if (operacao == 'S') {
        System.out.printf("%.1f\n", soma);
    }

    }
}
