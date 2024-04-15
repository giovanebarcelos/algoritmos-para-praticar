package repeticao;

import javax.swing.JOptionPane;

/*
 * Elabore um algoritmo para calcular e imprimir a média aritmética dos números inteiros
 * positivos ímpares inferiores ou iguais a um número N lido inicialmente.
 * 
 * @author giovanebarcelos
 */

public class R012 {
	public static void main(String[] args) {
		long numero = new Long(JOptionPane.showInputDialog("Número"));

		float media = mediaDosImparesMenoresOuIguaisA(numero);

		JOptionPane.showMessageDialog(null,
				String.format("A média dos números impares menores ou iguais a %d é %.2f", numero, media));
	}

	private static float mediaDosImparesMenoresOuIguaisA(long numero) {
		float soma = 0;
		float qtdeImpares = 0;

		while (numero > 0) {
			if (ehImpar(numero)) {
				soma += numero;
				qtdeImpares++;
			}
			numero--;
		}

		return soma / qtdeImpares;
	}

	private static boolean ehImpar(long numero) {
		return numero % 2 != 0;
	}
}
