package matriz;

import java.util.Scanner;

/*
 * O mesmo exercício anterior (M016), mas depois de ordenar os elementos do vetor em
 * ordem crescente, deve ser lido mais um número qualquer e inserir esse novo número na
 * posição correta, ou seja, mantendo a ordem crescente do vetor.
 *
 * @author giovanebarcelos
 */

public class M017 {
	private static final int QTDENUMEROS = 10;

	public static void main(String[] args) {
		int[] numeros = M017.lerNumeros();

		M017.ordernar(numeros);

		M017.imprimir(numeros);

		Scanner ler = new Scanner(System.in);
		System.out.print("\nDigite um número: ");
		int numero = ler.nextInt();

		numeros = M017.inserirNumeroDeFormaOrdenada(numero, numeros);
		M017.imprimir(numeros);

		ler.close();

	}

	private static int[] inserirNumeroDeFormaOrdenada(int numero, int[] numeros) {
		int[] numerosNovos = new int[numeros.length + 1];

		// Localiza a posicação e armazena os dados no Novo Array
		int posicao = 0;
		while ((posicao < numeros.length) && (numero > numeros[posicao])) {
			numerosNovos[posicao] = numeros[posicao];
			posicao++;
		}

		// Empurra para o fim para liberar a posicao
		for (int ultimo = numerosNovos.length - 1; ultimo > posicao; ultimo--) {
			numerosNovos[ultimo] = numeros[ultimo - 1];
		}

		// Armazena na posicao inserida
		numerosNovos[posicao] = numero;

		return numerosNovos;
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
		int numeros[] = new int[M017.QTDENUMEROS];

		for (int numero = 0; numero < M017.QTDENUMEROS; numero++) {
			System.out.print("Número " + (numero + 1) + ": ");
			numeros[numero] = ler.nextInt();
		}

		ler.reset();

		return numeros;
	}

}
