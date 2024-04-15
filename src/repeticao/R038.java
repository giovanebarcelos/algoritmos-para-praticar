package repeticao;

/*
 * Fazer um algoritmo que calcule e escreva uma tabela de centígrados em função de graus
 * Farenheit, que variam de 50 a 150 de 1 em 1. Use o exercício S010 para resolver esta
 * questão
 * 
 * @author giovanebarcelos
 */

public class R038 {
	private static final int GRAUSINICIAS = 50;
	private static final int GRAUSFINAIS = 150;

	public static void main(String[] args) {
		long grausFarenheit = 0;
		for (long grausCelsius = GRAUSINICIAS; grausCelsius <= GRAUSFINAIS; grausCelsius++) {
			grausFarenheit = converterCelsiusParaFarenheit(grausCelsius);

			System.out.printf("%d graus Célsius é igual a %d graus Farenheit\n", grausCelsius, grausFarenheit);
		}
	}

	private static long converterCelsiusParaFarenheit(long grausCelsius) {
		return ((9 / 5) * grausCelsius) + 32;
	}
}
