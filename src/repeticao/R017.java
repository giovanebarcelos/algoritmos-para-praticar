package repeticao;

/*
 * Elabore um algoritmo que imprima todos os números pares compreendidos entre 13 e 133.
 * O algoritmo deve também calcular e imprimir a soma destes valores.
 * 
 * @author giovanebarcelos
 */

public class R017 {
	private static final int NUMEROINICIAL = 13;
	private static final int NUMEROFINAL = 133;

	public static void main(String[] args) {
		int soma = 0;
		for (int numero = NUMEROINICIAL; numero <= NUMEROFINAL; numero++) {
			soma += numero;
		}

		System.out.printf("A soma de todos os números entre %d e %d é %d", NUMEROINICIAL, NUMEROFINAL, soma);
	}
}