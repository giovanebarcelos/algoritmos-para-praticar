package decisao;

import javax.swing.JOptionPane;

/*
 * Faça um algoritmo que leia um número e informe se ele é divisível por 3 e por 5.
 * 
 * @author giovanebarcelos
 */

public class C004 {
	public static void main(String[] args) {
		int numero = new Integer(JOptionPane.showInputDialog("Número"));

		if ((numero % 3 == 0) && (numero % 5 == 0)) {
			JOptionPane.showMessageDialog(null, String.format("Número %d é divisível por 3 e por 5", numero));
		} else {
			JOptionPane.showMessageDialog(null, String.format("Número %d não é divisível por 3 e por 5", numero));
		}
	}
}