package decisao;

import javax.swing.JOptionPane;

/*
 * Ler dois valores e imprimir uma das três mensagens a seguir:
 * ‘Números iguais’, caso os números sejam iguais
 * ‘Primeiro é maior’, caso o primeiro seja maior que o segundo;
 * ‘Segundo maior’, caso o segundo seja maior que o primeiro.
 * 
 * @author giovanebarcelos
 */

public class C051 {
	public static void main(String[] args) {
		double valor1 = new Double(JOptionPane.showInputDialog("Valor 1"));
		double valor2 = new Double(JOptionPane.showInputDialog("Valor 2"));

		String mensagem;
		if (valor1 == valor2) {
			mensagem = "Números iguais";
		} else if (valor1 > valor2) {
			mensagem = "Primeiro é maior";
		} else {
			mensagem = "Segundo maior";
		}

		JOptionPane.showMessageDialog(null, mensagem);
	}
}
