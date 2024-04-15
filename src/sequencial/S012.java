package sequencial;

import javax.swing.JOptionPane;

/* 
 * A Diagonal de uma caixa retangular com dimensões A, B e C é dada por:
 * (a^2 + b ^ 2 + c ^ 2) ^ 1/2
 * Faça um algoritmo para ler os valores A, B e C e calcular a diagonal da caixa, mostrando
 * o resultado na tela.
 * 
 * @author giovanebarcelos  
 */
public class S012 {
	public static void main(String[] args) {
		float valorA = new Float(JOptionPane.showInputDialog("Valor A"));
		float valorB = new Float(JOptionPane.showInputDialog("Valor B"));
		float valorC = new Float(JOptionPane.showInputDialog("Valor C"));

		float diagonalCaixa = (float) Math.sqrt(Math.pow(valorA, 2) + Math.pow(valorB, 2) + Math.pow(valorC, 2));

		JOptionPane.showMessageDialog(null, "A diagonal da caixa é " + String.format("%.2f", diagonalCaixa));

	}
}
