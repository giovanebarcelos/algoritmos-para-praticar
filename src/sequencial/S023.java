package sequencial;

import javax.swing.JOptionPane;

/*
 * Escreva um algoritmo que leia um número e mostre seu inteiro.
 * 
 * @author giovanebarcelos
 */

public class S023 {
	public static void main(String[] args) {
		float numero = new Float(JOptionPane.showInputDialog("Número"));

		long numeroInteiro = (long) numero;

		System.out.printf("O inteiro de %.2f é %d", numero, numeroInteiro);
	}
}
