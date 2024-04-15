package sequencial;

import java.util.Scanner;

/*
 * Suponha que a sala de sua casa seja retangular. Faça um algoritmo para ler as dimensões
 * da sala e calcular:
 * - quantos metros de rodapé são necessários;
 * - quantos metros quadrados de piso são necessários;  
 * Mostrar na tela os resultados e os dados iniciais lidos.
 * 
 * @author giovanebarcelos  
 */

public class S011 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Largura: ");
		float largura = ler.nextFloat();
		System.out.print("Comprimento: ");
		float comprimento = ler.nextFloat();

		float metrosRodape = (largura + comprimento) * 2;
		System.out.printf("São necessários %.2f metros de rodapé\n", metrosRodape);

		float metrosQuadradosPiso = largura * comprimento;
		System.out.printf("São necessários %.2f metros quadrados de piso\n", metrosQuadradosPiso);

		ler.close();
	}
}
