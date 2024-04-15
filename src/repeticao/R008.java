package repeticao;

import javax.swing.JOptionPane;

public class R008 {

	public static void main(String[] args) {
		long numero = new Long(JOptionPane.showInputDialog("Número"));

		long fatorial = fatorial(numero);

		JOptionPane.showMessageDialog(null, String.format("O fatorial do número %d é %d!", numero, fatorial));
	}

	private static long fatorial(long numero) {
		int fatorial = 1;

		while (numero > 1) {
			fatorial *= numero;
			numero--;
		}

		return fatorial;
	}
}
