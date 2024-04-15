package decisao;

import javax.swing.JOptionPane;

/*
 * Escreva um algoritmo que leia um mês e informe se o mês digitado é válido ou inválido.
 * 
 * @author giovanebarcelos
 */

public class C030 {
	public static void main(String[] args) {
		int mes = new Integer(JOptionPane.showInputDialog("Mês"));

		if (mes > 0 && mes < 13) {
			JOptionPane.showMessageDialog(null, "Mês válido!");
		} else {
			JOptionPane.showMessageDialog(null, "Mês inválido!");
		}
	}
}