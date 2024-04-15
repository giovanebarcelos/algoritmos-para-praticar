package repeticao;

/*
 * Faca um programa que calcule e mostre a tabuada de todos os números.
 * 
 * @author giovanebarcelos
 */

public class R020 {
	public static void main(String[] args) {
		for (int multiplicando = 1; multiplicando < 11; multiplicando++) {
			for (int multiplicador = 1; multiplicador < 11; multiplicador++) {
				System.out.printf("%d x %d = %d\n", multiplicando, multiplicador, multiplicando * multiplicador);
			}
		}

		System.out.println();
		System.out.print("Tabuada");

		// Versão mais elaborada
		for (int multiplicando = 1; multiplicando < 11; multiplicando++) {
			System.out.printf("%4d", multiplicando);
		}

		for (int multiplicando = 1; multiplicando < 11; multiplicando++) {
			System.out.println();
			System.out.printf("%7d", multiplicando);
			for (int multiplicador = 1; multiplicador < 11; multiplicador++) {
				System.out.printf("%4d", multiplicando * multiplicador);
			}
		}
	}
}