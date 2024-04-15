package repeticao;

/*
 * Supondo que a população de um país A seja da ordem de 90.000.000 de habitantes com
 * uma taxa anual de crescimento de 3% e que a população de um país B seja,
 * aproximadamente, de 20.000.000 de habitantes com uma taxa anual de crescimento de
 * 1,5%, fazer um algoritmo que calcule e escreva o número de anos necessários para que a
 * população do país B ultrapasse ou iguale a população do país A, mantidas essas taxas de
 * crescimento.
 * 
 * @author giovanebarcelos
 */

public class R040 {

	private static final long POPULACAOPAISA = 90000000;
	private static final long POPULACAOPAISB = 20000000;
	private static final float FATORCRESCIMENTOPAISA = 1.03f;
	private static final float FATORCRESCIMENTOPAISB = 1.015f;

	public static void main(String[] args) {
		long populacaoPaisA = POPULACAOPAISA, populacaoPaisB = POPULACAOPAISB;

		long anos = 0;
		while (populacaoPaisB < populacaoPaisA) {
			populacaoPaisA *= FATORCRESCIMENTOPAISA;
			populacaoPaisB *= FATORCRESCIMENTOPAISB;

			anos++;
		}

		System.out.printf("Foram necessários %d anos para os País B ultrapassar o País A", anos);
	}
}