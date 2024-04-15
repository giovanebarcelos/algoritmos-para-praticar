package repeticao;

/*
 * Um companhia de teatro planeja dar uma série de espetáculos. A direção calcula que, a R$
 * 5,00 o ingresso, serão vendidos 120 ingressos, e as despesas montarão em R$ 200,00. A
 * diminuição de R$ 0,50 no preço dos ingressos espera-se que haja um aumento de 26
 * ingressos vendidos.
 * Fazer um algoritmo que escreva uma tabela de valores do lucro esperado em função do
 * preço do ingresso, fazendo-se varias este preço de R$ 5,00 a R$ 1,00 de R$ 0,50 em R$ 0,50.
 * Escreva, ainda, o lucro máximo esperado, o preço e o número de ingressos correspondentes.
 * 
 * @author giovanebarcelos
 */

public class R052 {
	private static final double PRECOINGRESSOINICIAL = 5f;
	private static final long QTDEINGRESSOSPARAOPRECOINICIAL = 120;
	private static final double DESPESASDOESPETACULO = 200f;
	private static final float ESCALADEPRECOSDOINGRESSO = 0.5f;
	private static final int AUMENTODEINGRESSOSCONFORMEAESCALADEFINIDA = 26;

	public static void main(String[] args) {
		double precoIngresso = PRECOINGRESSOINICIAL;
		long qtdeIngressos = QTDEINGRESSOSPARAOPRECOINICIAL;

		System.out.println("TABELA DE VALORES");
		while (precoIngresso >= 1.0) {
			double lucroEsperado = (precoIngresso * qtdeIngressos) - DESPESASDOESPETACULO;
			System.out.printf("Para o preço de %.2f espera-se %d ingressos e se terá um lucro de %.2f\n", precoIngresso,
					qtdeIngressos, lucroEsperado);

			precoIngresso -= ESCALADEPRECOSDOINGRESSO;
			qtdeIngressos += AUMENTODEINGRESSOSCONFORMEAESCALADEFINIDA;
		}
	}
}