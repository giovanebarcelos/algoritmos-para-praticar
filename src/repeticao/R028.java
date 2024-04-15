package repeticao;

import javax.swing.JOptionPane;

/*
 * Ler 10 valores e escrever quantos desses valores lidos são NEGATIVOS.
 * 
 * @author giovanebarcelos
 */

public class R028 {
	private static final int NUMEROSLIDOS = 10;

	public static void main(String[] args) {

		long numero, contaNegativos = 0;
		for (int conta = 1; conta <= NUMEROSLIDOS; conta++) {
			numero = new Long(JOptionPane.showInputDialog("Número " + conta));

			if (numero < 0) {
				contaNegativos++;
			}
		}

		JOptionPane.showMessageDialog(null, String.format("Números negativos = %d!", contaNegativos));
	}
}