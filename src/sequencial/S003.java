package sequencial;

import javax.swing.JOptionPane;

/*
 * Faça um algoritmo que leia o valor unitário de um produto, a quantidade e o percentual de
 * imposto. Calcule e mostre o valor total do produto acrescentando o imposto lido.
 * 
 * @author giovanebarcelos
 */

public class S003 {
	public static void main(String[] args) {
		float valorUnitarioProduto = new Float(JOptionPane.showInputDialog("Valor Unitário"));
		float quantidade = new Float(JOptionPane.showInputDialog("Quantidade"));
		float percentualImposto = new Float(JOptionPane.showInputDialog("Percentual Imposto"));

		double valorTotalProduto = (valorUnitarioProduto * quantidade) * ((percentualImposto / 100) + 1);

		JOptionPane.showMessageDialog(null, "Valor total do produto é " + valorTotalProduto);
	}
}
