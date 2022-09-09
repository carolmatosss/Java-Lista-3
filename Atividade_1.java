package Lista3;

import java.util.Scanner;

public class Atividade_1 {

	public static void main(String[] args) {

		  

		float min=1000, max=1999, numero;
		

		for (numero=min;numero<=max; numero++ ) {

			if (numero%11==5) {
				System.out.println("O número é: "+numero);
			}

		}
	}

}
