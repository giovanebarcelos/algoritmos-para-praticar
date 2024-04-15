package decisao;

import javax.swing.JOptionPane;

/* 
 * Escrever um algoritmo que leia um número inteiro e informe se o dígito da dezena é par ou impar.
 * 
 * @author giovanebarcelos
 */

public class C008 {
	public static void main(String[] args) {
		long numero = new Long(JOptionPane.showInputDialog("Número"));

		int dezena = (int) (numero % 100);

		if (dezena % 2 == 0) {
			JOptionPane.showMessageDialog(null, "A dezena do número " + numero + " é par!");
		} else {
			JOptionPane.showMessageDialog(null, "A dezena do número " + numero + " é impar!");
		}
	}
}