package repeticao;

import java.util.Scanner;

/*
 * Escreva um programa e mostre os valores utilizados para calcular o quadrado de um
 * número positivo através do seguinte método: “O quadrado de um número positivo N é
 * igual à soma dos N primeiros números ímpares”. o quadrado de 3 é 9 = 1+3+5, e o de 7 é
 * 49 = 1+3+5+7+9+11+13.
 * Exemplo: Digite o número a ser elevado ao quadrado: 6
 * O quadrado de 6 é 36 = 1+3+5+7+9+11.
 * 
 * @author giovanebarcelos
 */

public class R009 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Número: ");
		long numero = ler.nextLong();

		long quadrado = quadrado(numero);

		System.out.printf("O quadrado do número %d é %d", numero, quadrado);

		ler.close();
	}

	private static long quadrado(long numero) {
		long somaImpares = 0, impar = 1;

		while (numero > 0) {
			somaImpares += impar;
			impar += 2;
			numero--;
		}

		return somaImpares;
	}
}