package sequencial;

import javax.swing.JOptionPane;

/*
 * Faça um algoritmo que leia valores para as variáveis A, B e C e mostre o resultado da
 * seguinte expressão: (A–B)*C
 * 
 * @author giovanebarcelos
 */

public class S026 {
	public static void main(String[] args) {
		double valorA = new Double(JOptionPane.showInputDialog("Valor A:"));
		double valorB = new Double(JOptionPane.showInputDialog("Valor B:"));
		double valorC = new Double(JOptionPane.showInputDialog("Valor C:"));

		double resultado = (valorA - valorB) * valorC;

		JOptionPane.showMessageDialog(null, "(" + valorA + " - " + valorB + ") * " + valorC + " = " + resultado);
	}
}
