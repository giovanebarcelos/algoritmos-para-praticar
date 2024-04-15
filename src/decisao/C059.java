package decisao;

import java.util.Scanner;

/*
 * Faça um algoritmo que leia a velocidade máxima permitida em uma avenida e a
 * velocidade com que o motorista estava dirigindo nela e calcule a multa que uma pessoa
 * vai receber, sabendo que são pagos: a) 50 reais se o motorista estiver ultrapassar em até
 * 10km/h a velocidade permitida (ex.: velocidade máxima: 50km/h; motorista a 60km/h ou
 * a 56km/h); b) 100 reais, se o motorista ultrapassar de 11 a 30 km/h a velocidade permitida.
 * c) 200 reais, se estiver acima de 31km/h da velocidade permitida.
 * 
 * @author giovanebarcelos
 */

public class C059 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Velocidade Máxima Permitida: ");
		double velocidadePermitida = ler.nextDouble();

		System.out.print("Velocidade que estava Dirigindo: ");
		double velocidadeDirigindo = ler.nextDouble();

		double velocidadeExcedida = velocidadeDirigindo - velocidadePermitida;

		double multa;
		if (velocidadeExcedida <= 0) {
			multa = 0;
		} else if (velocidadeExcedida <= 10) {
			multa = 50f;
		} else if (velocidadeExcedida <= 30) {
			multa = 100f;
		} else {
			multa = 200f;
		}

		System.out.printf("Multa a ser paga: %.2f\n", multa);

		ler.close();
	}
}