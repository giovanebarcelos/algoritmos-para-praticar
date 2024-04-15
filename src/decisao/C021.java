package decisao;

import java.util.Scanner;

/*
 * Ler três números e imprimir se eles podem ou não ser lados de um triângulo.
 * NÃO É TRIÂNGULO → (A > B + C) OU (B > A + C) OU (C > A + B)
 * 
 * @author giovanebarcelos
 */

public class C021 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Lado A: ");
		long ladoA = ler.nextLong();

		System.out.print("Lado B: ");
		long ladoB = ler.nextLong();

		System.out.print("Lado C: ");
		long ladoC = ler.nextLong();

		if ((ladoA > ladoB + ladoC) || (ladoB > ladoA + ladoC) || (ladoC > ladoA + ladoB)) {
			System.out.println("Não pode ser um triângulo!");
		} else {
			System.out.println("Pode ser um triângulo!");
		}
		
		ler.close();
	}
}
