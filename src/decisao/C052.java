package decisao;

import java.util.Scanner;

/*
 * Um posto está vendendo combustíveis com a seguinte tabela de descontos:
 * Álcool   Até 20 litros, desconto de 3% por litro
 *          Acima de 20 litros, desconto de 5% por litro
 * Gasolina Até 20 litros, desconto de 4% por litro
 *          Acima de 20 litros, desconto de 6% por litro
 * Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível
 * (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago
 * pelo cliente sabendo-se que o preço do litro da gasolina é R$ 3,30 e o preço do litro do
 * álcool é R$ 2,90.
 * 
 * @author giovanebarcelos
 */

public class C052 {
	private static final double PRECOLITROGASOLINA = 3.3f;
	private static final double PRECOLITROALCOOL = 2.9f;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Número de Litros Vendidos: ");
		float litrosVendidos = ler.nextFloat();

		System.out.print("Tipo de Combustível (A)lcool ou (G)asolina: ");
		String tipoCombustivel = ler.next();

		double precoLitroCombustivel = "A".equals(tipoCombustivel) ? PRECOLITROALCOOL : PRECOLITROGASOLINA;
		double fatorDesconto;
		if ("A".equals(tipoCombustivel)) {
			fatorDesconto = litrosVendidos <= 20 ? 0.97 : 0.95;
		} else {
			fatorDesconto = litrosVendidos <= 20 ? 0.96 : 0.94;
		}

		double valorTotal = litrosVendidos * precoLitroCombustivel * fatorDesconto;

		System.out.printf("Valor Total com Desconto = %.2f", valorTotal);

		ler.close();
	}
}