package decisao;

import javax.swing.JOptionPane;

/*
 * Entrar com um número e imprimir a raiz quadrada do número caso ele seja positivo e o
 * quadrado do número caso ele seja negativo ou zero.
 * 
 * @author giovanebarcelos
 */

public class C006 {
	public static void main(String[] args) {
		int numero = new Integer(JOptionPane.showInputDialog("Número"));

		double resultado;
		if (numero > 0) {
			resultado = Math.sqrt(numero);
		} else {
			resultado = Math.pow(numero, 2);
		}

		JOptionPane.showMessageDialog(null, String.format("%.2f", resultado));
	}
}