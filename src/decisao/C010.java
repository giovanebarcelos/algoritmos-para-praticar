package decisao;

import javax.swing.JOptionPane;

/*
 * Faça um algoritmo que entre com a Nota do Grau 1 e do Grau 2 e, faça a média aritmética
 * dos valores digitados e informe: Aprovado se média for maior ou igual a 7 e Reprovado se
 * for menor que 7.
 * 
 * @author giovanebarcelos
 */

public class C010 {
	public static void main(String[] args) {
		float notaG1 = new Float(JOptionPane.showInputDialog("Nota G1: "));
		float notaG2 = new Float(JOptionPane.showInputDialog("Nota G2: "));

		float media = (notaG1 + notaG2) / 2;

		JOptionPane.showMessageDialog(null,
				String.format("Aluno esta %s com a média %.2f", (media < 7 ? "Reprovado" : "Aprovado"), media));
	}
}