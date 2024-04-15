package sequencial;

import javax.swing.JOptionPane;

/*
 * Faça um algoritmo que leia uma temperatura dada na escala Celsius (C),
 * depois calcule e mostre temperatura equivalente em Fahrenheit (F):
 * 
 * @author giovanebarcelos  
 */

public class S010 {
	public static void main(String[] args) {
		long grausCelsius = new Long(JOptionPane.showInputDialog("Graus Célsius"));

		long grausFahrenheits = ((9 / 5) * grausCelsius) + 32;

		JOptionPane.showMessageDialog(null,
				grausCelsius + " Graus Célsius equivale a " + grausFahrenheits + " Graus Fahrenheits");
	}
}