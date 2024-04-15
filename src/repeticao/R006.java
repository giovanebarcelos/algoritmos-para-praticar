package repeticao;

import javax.swing.JOptionPane;

/*
 * Escreva um programa para calcular a média aritmética de todos os números ímpares entre
 * N e Y, onde N e Y devem ser números inteiros digitados pelo usuário.
 * 
 * @author giovanebarcelos
 */

public class R006 {
	public static void main(String[] args) {
		long numeroInicial = new Long(JOptionPane.showInputDialog("Número Inicial"));
		long numeroFinal = new Long(JOptionPane.showInputDialog("Número Final"));

		float media = mediaDoIntervalo(numeroInicial, numeroFinal);

		JOptionPane.showMessageDialog(null,
				String.format("A média entre %d e %d é %.2f", numeroInicial, numeroFinal, media));
	}

	private static float mediaDoIntervalo(long numeroInicial, long numeroFinal) {
		long media = 0, qtdeNumeros = 0;

		for (long numero = numeroInicial; numero <= numeroFinal; numero++) {
			media += numero;
			qtdeNumeros++;
		}

		return media / (float) qtdeNumeros;
	}
}