/*4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.*/

package Lista3;

import java.util.Scanner;

public class Atividade_4 {
	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);

		int genero, saude, idade, pessoas=0, contCalm=0,contFem=0, contMasc=0, contOut=0, contQua=0, contDezoi=0;
		
		System.out.println("Insira sua idade ");
		idade = leia.nextInt();

		System.out.println("Insira seu gênero: ");
		System.out.println("1- Masculino");
		System.out.println("2- Feminino");
		System.out.println("3- Outros");
		genero= leia.nextInt();
		
		System.out.println("Insira seu estado mental:  ");
		System.out.println("1- Calma");
		System.out.println("2- Nervosa");
		System.out.println("3- Agressiva");
		saude= leia.nextInt();
		
		if(saude==1) {
			contCalm++;
		}if (genero==2 && saude==2 ) {
			contFem ++;
		}if (genero==1 && saude == 3) {
			contMasc++;
		}if(genero==3 && saude==1) {
			contOut++;
		}if(idade>=40 && saude == 2) {
			contQua ++;
		}if (idade<=18 && saude ==1) {
			contDezoi ++;
		}
		
		pessoas++;
		
		while (pessoas<150) {
			
			System.out.println("Insira sua idade ");
			idade = leia.nextInt();

			System.out.println("Insira seu gênero: ");
			System.out.println("1- Masculino");
			System.out.println("2- Feminino");
			System.out.println("3- Outros");
			genero= leia.nextInt();
			
			System.out.println("Insira seu estado mental:  ");
			System.out.println("1- Calma");
			System.out.println("2- Nervosa");
			System.out.println("3- Agressiva");
			saude= leia.nextInt();
			

			if(saude==1) {
				contCalm++;
			}if (genero==2 && saude==2 ) {
				contFem ++;
			}if (genero==1 && saude == 3) {
				contMasc++;
			}if(genero==3 && saude==1) {
				contOut++;
			}if(idade>=40 && saude == 2) {
				contQua ++;
			}if (idade<=18 && saude ==1) {
				contDezoi ++;
			}
			
			pessoas++;
			
			
		}
		
		System.out.println("\nO número de pessoas calmas é: "+contCalm);
		System.out.println("\nO número de mulheres nervosas é: "+contFem);
		System.out.println("\nO número de homens agressivos é: "+contMasc);
		System.out.println("\nO número de Outros calmos é: "+contOut);
		System.out.println("\nO número de pessoas nervosas acima de 40 anos é: "+contQua);
		System.out.println("\nO número de pessoas calmas menor de 18 anos é: "+contDezoi);
		
		

	}
}