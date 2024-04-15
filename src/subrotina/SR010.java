package subrotina;

import javax.swing.JOptionPane;

/*
 * Faça um programa que utilize uma função recursiva para calcular o fatorial de um número
 * N. O número N deve ser fornecido pelo usuário em programa principal que irá chamar a
 * função do fatorial desenvolvida.
 *
 *  @author giovanebarcelos
 */

public class SR010 {
	public static void main(String[] args) {
		long numero = new Long(JOptionPane.showInputDialog("Número para calcular o fatorial"));

		JOptionPane.showMessageDialog(null,
				String.format("O fatorial do número %d é %d", numero, SR010.fatorial(numero)));

	}

	private static long fatorial(long numero) {
		if (numero == 1) {
			return 1;
		}

		return numero * SR010.fatorial(numero - 1);
	}
}