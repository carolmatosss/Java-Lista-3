/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/


package Lista3;

import java.util.Scanner;

public class Ativdade_3 {

	public static void main(String[] args) {
	 int idade, min=21, max=50, contMin=0, contMax=0;
	 
	Scanner leia = new Scanner (System.in);
	
	System.out.println("Insira a idade: ");
	idade = leia.nextInt();
	
	while(idade != -99) {
		
		if (idade>=0 && idade<min ) {
			contMin++;
		}else if(idade>=max) {
			contMax++;
		}
		System.out.println("Insira a idade: ");
		idade = leia.nextInt();
	
	}
	
	System.out.println("O total de pessoas com menos de 21 anos é: "+contMin+" e de pessoas com maior de 50 anos é: "+contMax);
	
	

	}

}
