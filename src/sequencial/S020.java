package sequencial;

import java.util.Scanner;

/*
 * Uma lanchonete vende apenas um tipo de sanduíche, cujo recheio inclui duas fatias de
 * queijo, uma fatia de presunto e uma rodela de hambúrguer. Sabendo que cada fatia de
 * queijo ou presunto pesa 50 gramas, e que a rodela de hambúrguer pesa 100 gramas, faça
 * um algoritmo em que o dono forneça a quantidade de sanduíches a fazer, e a máquina
 * informe as quantidades (em quilos) de queijo, presunto e carne necessários para compra.
 * 
 * @author giovanebarcelos  
 */

public class S020 {
	private static final int GRAMASPORKILO = 1000;
	private static final int QTDEQUEIJOSPORSANDUICHE = 2;
	private static final int QTDEGRAMASFATIAQUEIJO = 50;
	private static final int QTDEGRAMASFATIAPRESUNTO = 50;
	private static final int QTDEGRAMASFATIAHAMBURGUER = 100;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Quantidade de Sanduíches: ");
		int qtdeDeSanduiches = ler.nextInt();

		float kilosQueijo = qtdeDeSanduiches * QTDEQUEIJOSPORSANDUICHE * QTDEGRAMASFATIAQUEIJO / GRAMASPORKILO;
		float kilosPresunto = qtdeDeSanduiches * QTDEGRAMASFATIAPRESUNTO / GRAMASPORKILO;
		float kilosHamburguer = qtdeDeSanduiches * QTDEGRAMASFATIAHAMBURGUER / GRAMASPORKILO;

		System.out.printf("Para produzir %d sanduiches são necessários:\n" + "%.2fkg de Queijo\n"
				+ "%.2fkg de Presunto\n" + "%.2fkg de Hamburguer\n", qtdeDeSanduiches, kilosQueijo, kilosPresunto,
				kilosHamburguer);

		ler.close();
	}
}
