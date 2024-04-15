package subrotina;

import java.util.Scanner;

/*
 * Faça uma função que retorne a média entre o maior e menor valor dentre três valores reais
 * fornecidos como parâmetros para a função. Escreva também um programa principal que
 * teste esta função com valores fornecidos pelo usuário.
 *
 * @author giovanebarcelos
 */

public class SR014 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Valor 1: ");
		double valor1 = ler.nextDouble();
		System.out.print("Valor 2: ");
		double valor2 = ler.nextDouble();
		System.out.print("Valor 3: ");
		double valor3 = ler.nextDouble();

		System.out.printf("A média entre o maior e menor valores lidos é %.2f",
				SR014.mediaEntreMaiorEMenorValor(valor1, valor2, valor3));

		ler.close();
	}

	private static double mediaEntreMaiorEMenorValor(double valor1, double valor2, double valor3) {
		double maiorValor = SR014.maior(valor1, valor2, valor3);
		double menorValor = SR014.menor(valor1, valor2, valor3);

		return (maiorValor + menorValor) / 2;
	}

	private static double menor(double valor1, double valor2, double valor3) {
		double menor = valor1;

		if (menor > valor2) {
			menor = valor2;
		}

		if (menor > valor3) {
			menor = valor3;
		}

		return menor;
	}

	private static double maior(double valor1, double valor2, double valor3) {
		double maior = valor1;

		if (maior < valor2) {
			maior = valor2;
		}

		if (maior < valor3) {
			maior = valor3;
		}

		return maior;
	}
}