package matriz;

import java.util.Scanner;

/*
 * Faça um algoritmo para ler um vetor de 10 números. Após isto, deverá ser lido mais um
 * número qualquer e verificar se esse número existe no vetor ou não. Se existir, o algoritmo
 * deve gerar um novo vetor sem esse número. (Considere que não haverão números
 * repetidos no vetor).
 *
 * @author giovanebarcelos
 */

public class M018 {
	private static final int QTDENUMEROS = 3;

	public static void main(String[] args) {
		int[] numeros = M018.lerNumeros();

		Scanner ler = new Scanner(System.in);
		System.out.print("Número para pesquisar: ");
		int numero = ler.nextInt();

		if (M018.existe(numero, numeros)) {
			System.out.printf("Número %d existe no vetor!\n", numero);

			int[] novoVetorDeNumeros = M018.vetorMenosNumero(numeros, numero);

			M018.imprimir("Novo Vetor: ", novoVetorDeNumeros);
		} else {
			System.out.printf("Número %d não existe no vetor!\n", numero);
		}

		ler.close();
	}

	private static void imprimir(String mensagem, int[] novoVetorDeNumeros) {
		System.out.println(mensagem);

		for (int posicao = 0; posicao < novoVetorDeNumeros.length; posicao++) {
			System.out.printf("novoVetorDeNumeros[%d] = %d\n", posicao, novoVetorDeNumeros[posicao]);
		}

		System.out.println();
	}

	private static int[] vetorMenosNumero(int[] numeros, int numero) {
		int[] novoVetor = new int[numeros.length - 1];
		boolean eliminado = false;

		int posicao = 0, posicaoNovoVetor = 0;
		while (posicao < numeros.length) {
			if (!eliminado && (numero == numeros[posicao])) {
				// no caso de existir mais de uma vez o mesmo número
				eliminado = true;
			} else {
				novoVetor[posicaoNovoVetor] = numeros[posicao];
				posicaoNovoVetor++;
			}

			posicao++;
		}

		return novoVetor;
	}

	private static boolean existe(int numero, int[] numeros) {
		boolean achei = false;

		int posicao = numeros.length - 1;
		while (!achei && (posicao > -1)) {
			achei = numero == numeros[posicao];
			posicao--;
		}

		return achei;
	}

	private static int[] lerNumeros() {
		Scanner ler = new Scanner(System.in);
		int[] numeros = new int[M018.QTDENUMEROS];

		for (int numero = 0; numero < M018.QTDENUMEROS; numero++) {
			System.out.print("Número " + (numero + 1) + ": ");
			numeros[numero] = ler.nextInt();
		}

		ler.reset();

		return numeros;
	}

}
