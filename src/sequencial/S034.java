package sequencial;

import javax.swing.JOptionPane;

/*
 * Faça um algoritmo que efetue a leitura de um número inteiro e apresente o resultado do
 * quadrado deste número.
 * 
 * @author giovanebarcelos
 */

public class S034 {
	public static void main(String[] args) {
		int numero = new Integer(JOptionPane.showInputDialog("Número"));

		long numeroQuadrado = (long) Math.pow(numero, 2);

		JOptionPane.showMessageDialog(null, "O quadro do número " + numero + " é " + numeroQuadrado);

	}
}
