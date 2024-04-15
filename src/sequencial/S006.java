package sequencial;

import javax.swing.JOptionPane;

/*
 * Faça um algoritmo que leia um valor inteiro e apresente no final o resultado do quadrado
 * deste número.
 * 
 * @author giovanebarcelos
 */
public class S006 {
	public static void main(String[] args) {
		int numero = new Integer(JOptionPane.showInputDialog("Número"));

		double quadradoNumero = Math.pow(numero, 2);

		JOptionPane.showMessageDialog(null, "O quadrado de " + numero + " é " + quadradoNumero);
	}
}
