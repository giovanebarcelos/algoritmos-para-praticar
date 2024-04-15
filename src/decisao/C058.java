package decisao;

import javax.swing.JOptionPane;

/*
 * Ler um nome do teclado e ver se é igual ao seu nome. Imprimir conforme o caso: “NOME
 * CORRETO” ou “NOME INCORRETO”.
 * 
 * @author giovanebarcelos
 */

public class C058 {
	private static final String NOMEREGISTRADO = "Beltrano";

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Nome");

		if (NOMEREGISTRADO.equals(nome)) {
			JOptionPane.showMessageDialog(null, "NOME CORRETO");
		} else {
			JOptionPane.showMessageDialog(null, "NOME INCORRETO");
		}

	}
}