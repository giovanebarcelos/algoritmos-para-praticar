package subrotina;

import javax.swing.JOptionPane;

/*
 * Criar uma função que verifique se um número é primo.
 *
 * @author giovanebarcelos
 */

public class SR017 {
	public static void main(String[] args) {
		long numero = new Long(JOptionPane.showInputDialog("Número"));

		JOptionPane.showMessageDialog(null,
				String.format("Número %d %sé primo!", numero, SR017.ehPrimo(numero) ? "" : "não "));
	}

	private static boolean ehPrimo(long numero) {
		boolean ehPrimo = true;

		long divisor = 2;
		while (ehPrimo && (divisor < numero)) {
			ehPrimo = ((numero % divisor) != 0);
			divisor++;
		}

		return ehPrimo;
	}
}