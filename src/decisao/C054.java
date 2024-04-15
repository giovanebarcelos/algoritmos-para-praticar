package decisao;

import javax.swing.JOptionPane;

/*
 * Uma fruteira está vendendo frutas com a seguinte tabela de preços:
 *           Até 5kg          Acima de 5kg
 * Morango   R$ 2,50 por Kg   R$ 2,20 por Kg
 * Maçã      R$ 1,80 por Kg   R$ 1,50 por Kg
 * Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$
 * 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler
 * a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva
 * o valor a ser pago pelo cliente.
 * 
 * @author giovanebarcelos
 */

public class C054 {
	public static void main(String[] args) {
		double qtdeMorangos = new Double(JOptionPane.showInputDialog("Qtde Morangos (kg)"));
		double qtdeMacas = new Double(JOptionPane.showInputDialog("Qtde Maças (kg)"));

		double valorMorangos = qtdeMorangos * (qtdeMorangos <= 5 ? 2.5f : 2.2f);
		double valorMacas = qtdeMacas * (qtdeMacas <= 5 ? 1.8f : 1.5f);

		double valorTotal = valorMorangos + valorMacas;

		if ((qtdeMorangos + qtdeMacas) > 8 || valorTotal > 25) {
			// Desconto 10%
			valorTotal *= 0.9f;
		}

		JOptionPane.showMessageDialog(null, String.format("Valor Total = %.2f", valorTotal));
	}
}