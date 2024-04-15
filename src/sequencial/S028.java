package sequencial;

import javax.swing.JOptionPane;

/*
 * Fazer um algoritmo para ler duas notas, os pesos de cada nota e mostrar a média ponderada.
 * Calculo da Média Ponderada = ((nota 1 * peso da nota 1) + (nota 2 * peso da nota 2) ) /
 * soma dos pesos
 * 
 * @author giovanebarcelos
 */

public class S028 {
	public static void main(String[] args) {
		float nota1 = new Float(JOptionPane.showInputDialog("Nota 1"));
		float pesoNota1 = new Float(JOptionPane.showInputDialog("Peso da Nota 1"));
		float nota2 = new Float(JOptionPane.showInputDialog("Nota 2"));
		float pesoNota2 = new Float(JOptionPane.showInputDialog("Peso da Nota 2"));

		float mediaPonderada = ((nota1 * pesoNota1) + (nota2 * pesoNota2)) / (pesoNota1 + pesoNota2);

		JOptionPane.showMessageDialog(null, "A média ponderada das notas é " + String.format("%.2f", mediaPonderada));
	}
}