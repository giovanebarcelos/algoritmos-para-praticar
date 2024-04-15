package repeticao;

import java.util.Scanner;

/* 
 * Escreva um programa que apresente o seguinte menu de opções:
 * Calculadora Básica
 * 1 - Somar dois números
 * 2 - Subtrair dois números
 * 3 - Multiplicar dois números
 * 4 - Dividir dois números
 * 5 - Sair
 * Digite uma opção:
 * Quando uma opção for escolhida, o programa deve solicitar os dois números, realizar a
 * operação em questão, mostrar o resultado e em seguida voltar ao menu de opções. O
 * programa deve prever uma divisão por 0, informando ao usuário que não é possível
 * realizar tal operação.
 * 
 * @author giovanebarcelos
 */

public class R022 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int opcao = 0;
		do {
			System.out.println("Calculadora Básica");
			System.out.println("1 - Somar dois números");
			System.out.println("2 - Subtrair dois números");
			System.out.println("3 - Multiplicar dois números");
			System.out.println("4 - Dividir dois números");
			System.out.println("5 - Sair");
			System.out.print("Digite uma opção: ");

			opcao = ler.nextInt();

			double numero1 = 0, numero2 = 0, resultado = 0;
			if (opcao != 5) {
				System.out.print("Número 1: ");
				numero1 = ler.nextDouble();
				System.out.print("Número 2: ");
				numero2 = ler.nextDouble();
			}

			switch (opcao) {
			case 1:
				resultado = somar(numero1, numero2);
				System.out.printf("%.2f + %.2f = %.2f\n", numero1, numero2, resultado);
				break;
			case 2:
				resultado = subtrair(numero1, numero2);
				System.out.printf("%.2f - %.2f = %.2f\n", numero1, numero2, resultado);
				break;
			case 3:
				resultado = multiplicar(numero1, numero2);
				System.out.printf("%.2f * %.2f = %.2f\n", numero1, numero2, resultado);
				break;
			case 4:
				resultado = dividir(numero1, numero2);
				System.out.printf("%.2f / %.2f = %.2f\n", numero1, numero2, resultado);
				break;
			case 5:
				break;
			default:
				System.out.println("Opção Inválida!\n");
			}

			System.out.println("Tecle qualquer tecla para continuar ...");
			ler.nextLine();
			ler.nextLine();
		} while (opcao != 5);

		ler.close();
	}

	private static double dividir(double numero1, double numero2) {
		return numero1 / (numero2 == 0 ? 1 : numero2);
	}

	private static double multiplicar(double numero1, double numero2) {
		return numero1 * numero2;
	}

	private static double subtrair(double numero1, double numero2) {
		return numero1 - numero2;
	}

	private static double somar(double numero1, double numero2) {
		return numero1 + numero2;
	}

}
