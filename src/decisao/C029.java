package decisao;

import java.util.Scanner;

/*
 * Faça um algoritmo que imprima o menu abaixo:
 * MENU ESTADO CIVIL
 * 1 – solteiro(a)
 * 2 – desquitado(a)
 * 3 – casado(a)
 * 4 – divorciado(a)
 * 5 -viúvo(a)
 * OPÇÃO:
 * Ler uma opção e imprimir na tela a descrição equivalente a opção escolhida. Caso seja
 * digitado um valor não existente no menu imprimir “Opção Inexistente!”.
 * 
 * @author giovanebarcelos
 */

public class C029 {
	public static void main(String[] args) {
		System.out.println("MENU ESTADO CIVIL");
		System.out.println("1 – solteiro(a)");
		System.out.println("2 – desquitado(a)");
		System.out.println("3 – casado(a)");
		System.out.println("4 – divorciado(a)");
		System.out.println("5 – viúvo(a)");
		System.out.print("OPÇÃO: ");

		Scanner ler = new Scanner(System.in);
		int opcao = ler.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Escolheu 1 - solteiro(a)");
			break;
		case 2:
			System.out.println("Escolheu 2 - desquitado(a)");
			break;
		case 3:
			System.out.println("Escolheu 3 - casado(a)");
			break;
		case 4:
			System.out.println("Escolheu 4 - divorciado(a)");
			break;
		case 5:
			System.out.println("Escolheu 3 - viúvo(a)");
			break;
		default:
			System.out.println("Opção Inexistente!");
		}

		ler.close();
	}
}