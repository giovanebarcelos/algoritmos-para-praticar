package repeticao;

/*
 * Faça um algoritmo que imprima os 20 primeiros termos da série de Fibonacci. Obs.: os
 * dois primeiros termos desta série são 0 e 1. Os demais são gerados a partir da soma dos
 * anteriores.
 * Ex.: 0+1 = 1 → terceiro termo; 1+1 = 2 → quarto termo; 1+2=3→ quinto termo; ...
 * 
 * @author giovanebarcelos
 */

public class R059 {
	public static void main(String[] args) {
		System.out.println("Método Tradicional: ");
		imprimirFibonaccis();

		System.out.println("\n\nMétodo Recursivo: ");
		imprimirFibonaccisRecursivo();
	}

	private static void imprimirFibonaccisRecursivo() {
		System.out.print("Fibonaccis: 0 ");
		imprimirFibonaccisRecursivo(1, 0, 1);
	}

	private static void imprimirFibonaccisRecursivo(long conta, long fiboAnterior, long fibo) {
		if (conta > 19) {
			return;
		}

		System.out.printf("%d ", fibo);

		imprimirFibonaccisRecursivo(conta + 1, fibo, fiboAnterior + fibo);
	}

	private static void imprimirFibonaccis() {
		System.out.print("Fibonaccis: 0 ");

		for (long fibo = 1, fiboAnterior = 0, conta = 2, fiboAux = 0; conta <= 20; conta++) {
			System.out.printf("%d ", fibo);

			fiboAux = fiboAnterior;
			fiboAnterior = fibo;
			fibo += fiboAux;
		}
	}
}