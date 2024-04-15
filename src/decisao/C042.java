package decisao;

import javax.swing.JOptionPane;

/*
 * Fazer um algoritmo que leia a capacidade de um elevador e o peso de 5 pessoas. Informar
 * se o elevador está liberado para subir ou se excedeu a carga máxima.
 */

public class C042 {

	public static void main(String[] args) {
		double capacidadeDoElevador = new Double(JOptionPane.showInputDialog("Capacidade do Elevador"));
		double pesoDasPessoas = new Double(JOptionPane.showInputDialog("Peso das Pessoas"));

		if (pesoDasPessoas > capacidadeDoElevador) {
			JOptionPane.showMessageDialog(null, "Peso do Elevador foi Excedido!");
		} else {
			JOptionPane.showMessageDialog(null, "Elevador esta Liberado!");
		}
	}
}