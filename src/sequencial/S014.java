package sequencial;

import java.util.Scanner;

/*
 * Sabe-se que: 1 pé = 12 polegadas, 1 jarda = 3 pés e 1 milha = 1760 jardas.
 * Elabore um algoritmo que receba uma medida em pés, faça as conversões para: polegadas,
 * jardas e milhas e mostre os resultados.
 * 
 * @author giovanebarcelos   
 */

public class S014 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Pés: ");
		long pes = ler.nextLong();

		float polegadas = pes * 12;
		System.out.printf("%.4f polegadas\n", polegadas);

		float jardas = pes / 3;
		System.out.printf("%.4f jardas\n", jardas);

		float milhas = jardas / 1760;
		System.out.printf("%.4f milhas\n", milhas);

		ler.close();
	}
}
