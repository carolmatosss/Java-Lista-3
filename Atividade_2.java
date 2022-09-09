//2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

package Lista3;

import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {
		
		float numero, pares=0, impares=0;
		int x;
		
		Scanner leia= new Scanner(System.in);
 
		for (x=1; x<=10; x++) {
			
		System.out.println("Insira um número: ");
		numero = leia.nextFloat();
				
			if (numero%2==0) {
				pares ++;
			}else {
				impares++;
			}
		}
		
		System.out.println(+pares+" são pares, "+impares+" são ímapres.");
		
	}

}
