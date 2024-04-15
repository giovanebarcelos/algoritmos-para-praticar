package subrotina;

import javax.swing.JOptionPane;

/*
 * Escreva um algoritmo, utilizando uma função recursiva chamada soma_inteiros, para
 * calcular a soma dos N primeiros números positivos, sendo N um valor fornecido pelo
 * usuário no algoritmo principal.
 *
 * @author giovanebarcelos
 */

public class SR011 {
	public static void main(String[] args) {
		long numero = new Long(JOptionPane.showInputDialog("Número: "));

		JOptionPane.showMessageDialog(null, String.format("A soma dos %d primeiros números positivos é %d", numero,
				SR011.somaPrimeirosPositivos(numero)));
	}

	private static long somaPrimeirosPositivos(long numero) {
		if (numero == 1) {
			return numero;
		}

		return numero + SR011.somaPrimeirosPositivos(numero - 1);
	}
}