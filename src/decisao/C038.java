package decisao;

import java.util.Scanner;

/*
 * Desenvolva um algoritmo onde o usuário digite dois números e eles sejam exibidos em
 * ordem crescente ou decrescente, de acordo com a opção do usuário. (Dica: não esqueça de
 * informar o caso onde os números são iguais).
 * 
 * @author giovanebarcelos
 */

public class C038 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Número 1: ");
		int numero1 = ler.nextInt();

		System.out.print("Número 2: ");
		int numero2 = ler.nextInt();

		ler.nextLine();

		System.out.print("Ordem (C)rescente e (D)ecrescente: ");
		String ordem = ler.nextLine();

		if (("C".equals(ordem) && numero1 > numero2) || ("D".equals(ordem) && numero1 < numero2)) {
			int numeroAuxiliar = numero1;
			numero1 = numero2;
			numero2 = numeroAuxiliar;
		}

		System.out.printf("Números em ordem %s: %d e %d", "C".equals(ordem) ? "Crescente" : "Decrescente", numero1,
				numero2);

		ler.close();
	}
}
