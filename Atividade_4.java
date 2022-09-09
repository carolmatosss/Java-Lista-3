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

		int idade, op, op1, pessoas=0, calmos=0, mulNerv=0, homAgr=0, outCal=0, nerv40=0, calm18=0;

		Scanner leia = new Scanner (System.in);

		System.out.println("Insira a idade da pessoa: ");
		idade = leia.nextInt();

		System.out.println ("\n1- Feminino");
		System.out.println ("\n2- Masculino");
		System.out.println ("\n3- Outros");
		op = leia.nextInt();

		switch (op) {
		case 1:
			System.out.println("\n1- Feminino");
			break;
		case 2:
			System.out.println("\n2 - Masculino");
			break;
		case 3:
			System.out.println("\n3 - Outros");
			break;

		default: 
			System.out.println("\nOpção inválida");
		}

		System.out.println ("\n1- Calma");
		System.out.println ("\n2- Nervosa");
		System.out.println ("\n3- Agressiva");
		op1 = leia.nextInt();

		switch (op1) {
		case 1:
			System.out.println("\n1- Calma");
			break;
		case 2:
			System.out.println("\n2 - Nervosa");
			break;
		case 3:
			System.out.println("\n3 - Agressiva");
			break;

		default: 
			System.out.println("\nOpção inválida");
		}
		
		if(op1 == 1) {
			calmos ++;
		}
		if(op==1 && op1==2 ) {
			mulNerv ++;
		}
		if (op==2 && op1==3) {;
		homAgr ++;
		}
		if(op==3 && op1==1) {
			outCal ++;
		}
		if (idade>=40 && op1==2) {
			nerv40 ++;
		}
		if(idade<=18 && op1==1) {
			calm18++;
		}

		while(pessoas<=3) {

			if(op1 == 1) {
				calmos ++;
			}
			if(op==1 && op1==2 ) {
				mulNerv ++;
			}
			if (op==2 && op1==3) {;
			homAgr ++;
			}
			if(op==3 && op1==1) {
				outCal ++;
			}
			if (idade>=40 && op1==2) {
				nerv40 ++;
			}
			if(idade<=18 && op1==1) {
				calm18++;
			}

			pessoas ++;
			System.out.println("Insira a idade da pessoa: ");
			idade = leia.nextInt();

			System.out.println ("\n1- Feminino");
			System.out.println ("\n2- Masculino");
			System.out.println ("\n3- Outros");
			op = leia.nextInt();

			switch (op) {
			case 1:
				System.out.println("\n1- Feminino");
				break;
			case 2:
				System.out.println("\n2 - Masculino");
				break;
			case 3:
				System.out.println("\n23 - Outros");
				break;

			default: 
				System.out.println("\nOpção inválida");
			}

			System.out.println ("\n1- Calma");
			System.out.println ("\n2- Nervosa");
			System.out.println ("\n3- Agressiva");
			op1 = leia.nextInt();

			switch (op1) {
			case 1:
				System.out.println("\n1- Calma");
				break;
			case 2:
				System.out.println("\n2 - Nervosa");
				break;
			case 3:
				System.out.println("\n3 - Agressiva");
				break;

			default: 
				System.out.println("\nOpção inválida");
			}

		}

		System.out.println("\nO número de pessoas calmas é: " +calmos+", o de mulheres nervosas é: "+mulNerv+", o de homens agressivos é: "+homAgr+", o de pessoas nervosas com mais de 40 é: "+nerv40+", e o de pessoas calmas com menos de 18 é: "+calm18);
	}

}
