package matriz;

import java.util.Scanner;

/*
 * Faça um algoritmo para ler 10 números e armazenar em um vetor. Após isto, o algoritmo
 * deve ordenar os números no vetor em ordem crescente. Escrever o vetor ordenado.
 *
 * @author giovanebarcelos
 */

public class M016 {
	private static final int QTDENUMEROS = 10;

	public static void main(String[] args) {
		int[] numeros = M016.lerNumeros();

		M016.ordernar(numeros);

		M016.imprimir(numeros);

	}

	private static void imprimir(int[] numeros) {
		for (int numero = 0; numero < numeros.length; numero++) {
			System.out.printf("numeros[%d] = %d\n", numero, numeros[numero]);
		}
	}

	private static void ordernar(int[] numeros) {
		for (int fim = numeros.length - 1; fim > 0; fim--) {
			for (int inicio = 0; inicio < fim; inicio++) {
				if (numeros[inicio] > numeros[inicio + 1]) {
					int auxiliar = numeros[inicio];
					numeros[inicio] = numeros[inicio + 1];
					numeros[inicio + 1] = auxiliar;
				}

			}
		}
	}

	private static int[] lerNumeros() {
		Scanner ler = new Scanner(System.in);
		int numeros[] = new int[M016.QTDENUMEROS];

		for (int numero = 0; numero < M016.QTDENUMEROS; numero++) {
			System.out.print("Número " + (numero + 1) + ": ");
			numeros[numero] = ler.nextInt();
		}

		ler.close();

		return numeros;
	}
}