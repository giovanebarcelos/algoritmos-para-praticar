package decisao;

import javax.swing.JOptionPane;

/*
 * Leia um número inteiro e informar se ele é par ou impar.
 * 
 * @author giovanebarcelos
 */

public class C002 {
	public static void main(String[] args) {
		int numero = new Integer(JOptionPane.showInputDialog("Número"));

		JOptionPane.showMessageDialog(null,
				String.format("Número %d é %s", numero, (numero % 2 == 0 ? "Par" : "Impar")));
	}
}
