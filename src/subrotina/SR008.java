package subrotina;

import java.util.Scanner;

/*
 * Faça um algoritmo calculadora com as operações básicas: soma, subtração, multiplicação
 * e divisão. Este algoritmo deve apresentar um menu que possibilite escolher a operação
 * desejada. Ao escolher a operação deve-se ler dois números reais e efetuar a operação. A
 * operação deve ser implementada com o uso de funções. Por fim o programa principal deve
 * mostrar o resultado do calculo das respectivas funções.
 *
 * @author giovanebarcelos
 */

public class SR008 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int opcao = 0;
		do {
			System.out.println("Calculadora: ");
			System.out.println("1. Somar");
			System.out.println("2. Subtrair");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("9. Sair");
			System.out.print("Opção: ");
			opcao = ler.nextInt();

			if ((opcao > 0) && (opcao < 5)) {
				System.out.print("\nNúmero 1: ");
				double numero1 = ler.nextDouble();
				System.out.print("Número 2: ");
				double numero2 = ler.nextDouble();

				double resultado = 0;
				String tipoOperacao = "";
				switch (opcao) {
				case 1:
					resultado = SR008.somar(numero1, numero2);
					tipoOperacao = "soma";
					break;
				case 2:
					resultado = SR008.subtrair(numero1, numero2);
					tipoOperacao = "subtração";
					break;
				case 3:
					resultado = SR008.multiplicar(numero1, numero2);
					tipoOperacao = "multiplicação";
					break;
				case 4:
					resultado = SR008.dividir(numero1, numero2);
					tipoOperacao = "divisão";
					break;
				}

				System.out.printf("\nA %s entre %.2f e %.2f é %.2f!\n", tipoOperacao, numero1, numero2, resultado);
			} else if (opcao != 9) {
				System.out.println("Opção Inválida!");
			}
		} while (opcao != 9);

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