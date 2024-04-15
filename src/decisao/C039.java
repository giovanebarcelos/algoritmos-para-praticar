package decisao;

import javax.swing.JOptionPane;

/*
 * A prefeitura de uma cidade abriu uma linha de crédito para funcionários estatuários, com a
 * condição de que o valor máximo da prestação não pode ultrapassar 25% do salário bruto
 * do funcionário. Desenvolva uma lógica onde seja informado o valor do salário do
 * funcionário e o valor da prestação e informe se o empréstimo pode ou não ser concedido.
 * 
 * @author giovanebarcelos
 */

public class C039 {
	public static void main(String[] args) {
		double salario = new Double(JOptionPane.showInputDialog("Salário"));
		double valorPrestacao = new Double(JOptionPane.showInputDialog("Valor da Prestação"));

		if (valorPrestacao / salario > 0.25) {
			JOptionPane.showMessageDialog(null, "Não pode ser concedido empréstimo!");
		} else {
			JOptionPane.showMessageDialog(null, "Empréstimo Aprovado!");
		}
	}
}