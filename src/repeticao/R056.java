package repeticao;

import java.util.Scanner;

/*
 * Uma determinada fábrica de rádios possui duas linhas de montagem distintas: standard e
 * luxo. A linha de montagem standard comporta um máximo de 24 operários; cada rádio
 * standard dá um lucro de X reais e gasta um homem-dia para sua confecção. A linha de
 * montagem luxo comporta no máximo 32 operários; e cada rádio luxo dá um lucro de Y
 * cruzados e gasta 2 homens- dia para sua confecção. A fábrica possui 40 operários. O
 * mercado é capaz de absorver toda a produção e o fabricante deseja saber qual esquema de
 * produção a adotar de modo a maximizar seu lucro diário.
 * Fazer um algoritmo que leia os valores de X e Y e escreva, para esse esquema de lucro
 * máximo, o número de operários na linha standard e na linha luxo, o número de rádios
 * standard e luxo produzidos e o lucro.
 * 
 * @author giovanebarcelos
 */

public class R056 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Dados linha Standard: ");
		System.out.print("Lucro por rádio Standard: ");
		double lucroRadioStandard = ler.nextDouble();
		System.out.print("Número operários rádio Standard: ");
		long qtdeOperariosRadioStandard = ler.nextLong();
		System.out.print("Quantidade rádios Standard produzidos: ");
		long qtdeRadiosStandardProduzidos = ler.nextLong();

		System.out.println("Dados linha Luxo: ");
		System.out.print("Lucro por rádio Luxo: ");
		double lucroRadioLuxo = ler.nextDouble();
		System.out.print("Número operários rádio Luxo: ");
		long qtdeOperariosRadioLuxo = ler.nextLong();
		System.out.print("Quantidade rádios Luxo produzidos: ");
		long qtdeRadiosLuxoProduzidos = ler.nextLong();

		ler.close();
	}
}