package sequencial;

import java.util.Scanner;

/*
 * Elabore um algoritmo que leia a quantidade de dinheiro em reais que uma pessoa que vai
 * viajar possui. Essa pessoa vai passar por vários países e precisa converter seu dinheiro em
 * Dólares, Euro e Libra Esterlina. Leia a cotação do dólar, do Euro e da Libra Esterlina, e
 * faça as conversões do que a pessoa possui para cada uma destas moedas. O algoritmo
 * deverá fazer e mostrar os valores das conversões.
 *
 * @author giovanebarcelos  
 */

public class S017 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Dinheiro disponível em R$: ");
		double dinheiroReais = ler.nextDouble();
		System.out.print("Cotação do Dólar: ");
		double cotacaoDolar = ler.nextDouble();
		System.out.print("Cotação do Euro: ");
		double cotacaoEuro = ler.nextDouble();
		System.out.print("Cotação da Libra Esterlina: ");
		double cotacaoLibraEsterlina = ler.nextDouble();

		System.out.printf("%.2f Reais equivalem a %.2f Dólares, %.2f Euros e %.2f Libras Esterlinas", dinheiroReais,
				cotacaoDolar * dinheiroReais, cotacaoEuro * dinheiroReais, cotacaoLibraEsterlina * dinheiroReais);

		ler.close();
	}
}
