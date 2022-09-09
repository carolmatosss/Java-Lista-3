/*6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

package Lista3;

import java.util.Scanner;

public class Atividade_6 {

	public static void main(String[] args) {
		int numero, soma=0, media=0, contNum=0;

		Scanner leia = new Scanner (System.in);

		System.out.println("Insira um número inteiro: ");
		numero= leia.nextInt();

		do{

			if (numero%3==0) {

				soma += numero;
				contNum ++;	
			}

			System.out.println("Insira um número inteiro: ");
			numero= leia.nextInt();

		}while(numero != 0);

		media = soma/contNum;
		System.out.println("A media dos números múltiplos por 3 é: "+media);
	}

}
