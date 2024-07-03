/*----------------------------------*
| ArthurZ7                          |
| BEE 1071                          |
| Soma de Impares Consecutivos I    |
*----------------------------------*/
import java.util.Scanner;
public class Main
{
    public static void main (String[]args)
    {
    Scanner s = new Scanner (System.in);
    
    int X = s.nextInt();
    int Y = s.nextInt();
    int soma = 0;
    int maior = 0;
    int menor = 0;
    
    // Definindo o valor maior e menor
    if (X<Y) {
        menor = X;
        maior = Y;
    } else {
        menor = Y;
        maior = X;
    }
    
    // Transformando o valor par em impar, 
    //e garantindo que o valor impar inicial não será somado
    if (menor%2 == 0){
        menor++;
    } else {
        menor = menor + 2;
    }
    
    for (int i=0; menor<maior; i++){
        soma += menor;
        menor = menor + 2;
    }
    System.out.println(soma);
    
    s.close ();
    }
}