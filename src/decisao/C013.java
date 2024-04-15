package decisao;

import javax.swing.JOptionPane;

/*
 * Faça um programa que leia 2 números e imprima uma mensagem dizendo se são iguais ou diferentes.
 * 
 * @author giovanebarcelos
 */

public class C013 {
	public static void main(String[] args) {
		int numero1 = new Integer(JOptionPane.showInputDialog("Número 1"));
		int numero2 = new Integer(JOptionPane.showInputDialog("Número 2"));

		if (numero1 == numero2) {
			System.out.printf("Número %d e %d são iguais!", numero1, numero2);
		} else {
			System.out.printf("Número %d e %d são diferentes!", numero1, numero2);
		}
	}
}