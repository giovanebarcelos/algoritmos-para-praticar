package sequencial;

import javax.swing.JOptionPane;

/*
 * Um motorista deseja colocar no tanque de seu veículo X reais de gasolina. Escreva um
 * algoritmo para ler o preço do litro  da gasolina e o valor do combustível, e exibir quantos
 * litros ele conseguiu colocar no tanque.
 *  
 * @author giovanebarcelos  
 */

public class S018 {
	public static void main(String[] args) {
		double valorTotalAbastecimento = new Double(JOptionPane.showInputDialog("Total Abastecido (R$)"));
		double precoLitroGasolina = new Double(JOptionPane.showInputDialog("Preço Litro Gasolina (R$)"));

		double litrosAbastecidos = valorTotalAbastecimento / precoLitroGasolina;

		JOptionPane.showMessageDialog(null,
				"Foram abastecidos " + String.format("%.2f", litrosAbastecidos) + " litros de Gasolina!");

	}
}
