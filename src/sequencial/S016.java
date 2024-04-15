package sequencial;

import java.util.Scanner;

/*
 * Sabe-se que para iluminar de maneira correta os cômodos de uma casa para cada m2 deve-
 * se usar 18 W de potência. Faça um algoritmo para ler as duas dimensões de um cômodo
 * (em metros), calcule e imprima a sua área (em m2) e a potência de iluminação que deverá
 * ser utilizada.
 * 
 * @author giovanebarcelos  
 */

public class S016 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Comprimento: ");
		double comprimento = ler.nextDouble();
		System.out.print("Largura: ");
		double largura = ler.nextDouble();

		double metrosQuadrados = comprimento * largura;
		double potenciaIluminacao = metrosQuadrados * 18.0;

		System.out.printf(
				"Num cômodo de %.2f x %.2f que corresponde a %.2f m2 é necessário uma iluminação de aproximadamente %.0f watts",
				comprimento, largura, metrosQuadrados, potenciaIluminacao);

		ler.close();
	}
}
