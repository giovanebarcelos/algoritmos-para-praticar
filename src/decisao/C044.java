package decisao;

import javax.swing.JOptionPane;
/*
 * As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se
 * forem compradas pelo menos 12. Escreva um programa que leia o número de maçãs
 * compradas, calcule e escreva o custo total da compra.
 * 
 * @author giovanebarcelos
 */

public class C044 {
	private static final float CUSTOMENOS12MACAS = 1.3f;
	private static final float CUSTOMAISQUE12MACAS = 1f;

	public static void main(String[] args) {
		long qtdeMacas = new Long(JOptionPane.showInputDialog("Quantidade Maçãs"));

		double valorTotal;
		if (qtdeMacas < 12) {
			valorTotal = qtdeMacas * CUSTOMENOS12MACAS;
		} else {
			valorTotal = qtdeMacas * CUSTOMAISQUE12MACAS;
		}

		JOptionPane.showMessageDialog(null, String.format("Valor Total = %.2f", valorTotal));
	}
}