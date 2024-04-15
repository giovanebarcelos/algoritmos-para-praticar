package sequencial;

import javax.swing.JOptionPane;

/*
 * Escreva um programa que leia a idade de uma pessoa e mostre na tela quantos segundos
 * esta pessoa já viveu sem considerar ano bissexto.
 * 
 * @author giovanebarcelos 
 */
public class S008 {
	private static final int DIASNOANO = 365;
	private static final int HORASPORDIA = 24;
	private static final int MINUTOSPORHORA = 24;
	private static final int SEGUNDOSPORMINUTO = 60;

	public static void main(String[] args) {
		int idade = new Integer(JOptionPane.showInputDialog("Idade"));

		long segundosVida = idade * DIASNOANO * HORASPORDIA * MINUTOSPORHORA * SEGUNDOSPORMINUTO;

		JOptionPane.showMessageDialog(null, "Uma pessoa com " + idade + " viveu " + segundosVida + " segundos!");
	}
}
