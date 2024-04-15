package decisao;

import javax.swing.JOptionPane;

/*
 * Escreva uma algoritmo que leia a idade de uma pessoa e informe se a pessoa esta apta ou
 * não para tirar carteira de motorista.
 * 
 * @author giovanebarcelos
 */

public class C026 {
	public static void main(String[] args) {
		int idade = new Integer(JOptionPane.showInputDialog("Idade"));

		if (idade < 18) {
			JOptionPane.showMessageDialog(null, "Não esta apto para tirar carteira de motorista!");
		} else {
			JOptionPane.showMessageDialog(null, "Esta apto para tirar carteira de motorista!");
		}
	}
}