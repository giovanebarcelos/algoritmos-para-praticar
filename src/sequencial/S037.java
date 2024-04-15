package sequencial;

import javax.swing.JOptionPane;

/*
 * Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de
 * reajuste. Calcular e escrever o valor do novo salário.
 * 
 * @author giovanebarcelos
 */

public class S037 {
	public static void main(String[] args) {
		double salarioMensal = new Double(JOptionPane.showInputDialog("Salário Mensal"));
		float percentualReajuste = new Float(JOptionPane.showInputDialog("Percentual Reajuste"));

		double novoSalario = salarioMensal * (1 + (percentualReajuste / 100));

		JOptionPane.showMessageDialog(null, "O salário com reajuste é " + String.format("%.2f", novoSalario));
	}
}
