package sequencial;

import javax.swing.JOptionPane;

/*
 * Cada degrau de uma escada tem X de altura. Elabore um algoritmo que receba essa altura
 * e   a   altura   que   o   usuário   deseja   alcançar   subindo   a   escada.   Calcule   e   mostre   quantos
 * degraus o usuário deverá subir para atingir seu objetivo, sem se preocupar com a altura do
 * usuário.
 * 
 * @author giovanebarcelos   
 */

public class S015 {
	public static void main(String[] args) {
		float alturaDegrau = new Float(JOptionPane.showInputDialog("Altura do Degrau (centímetros)"));
		float alturaDesejada = new Float(JOptionPane.showInputDialog("Altura Deesejada (metros)"));

		int qtdeDegrausParaSubir = (int) ((alturaDesejada * 100) / (alturaDegrau));

		JOptionPane.showMessageDialog(null, "Deverá subir " + qtdeDegrausParaSubir + " degraus para alcancar "
				+ alturaDesejada + " metros considerando degraus de " + alturaDegrau + " centímetros!");
	}
}
