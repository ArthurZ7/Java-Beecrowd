/*-----------------------*
| ArthurZ7               |
| BEE 4952 - FUNC01      |
| Imprimir Usuário       |
*-----------------------*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		int n = 2; //qnt de users
		
		String nome;
		int idade = 0;
		
		for (int i=0; i<n; i++) {
		    nome = s.next();
		    idade = s.nextInt();
		    
		    imprimirUsuario(nome, idade);
		}
		
		s.close();
	}
	
	static void imprimirUsuario(String nomeUser, int idadeUser) {
	    System.out.printf("Usuario: %s, Idade: %d anos\n", nomeUser, idadeUser);
	} 
}
