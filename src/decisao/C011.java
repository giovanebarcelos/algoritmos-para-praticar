package decisao;

import java.util.Scanner;

/*
 * Faça um algoritmo que leia uma Unidade da Federação (UF) do Brasil e informe se sigla
 * digitada esta certa ou errada.
 * 
 * UFs: "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", 
 * 		"PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", 
 * 		"TO"
 * 
 * @author giovanebarcelos
 */

public class C011 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("UF: ");
		String uf = ler.nextLine();

		boolean estaCorretaUf = "AC".equals(uf) || "AL".equals(uf) || "AP".equals(uf) || "AM".equals(uf)
				|| "BA".equals(uf) || "CE".equals(uf) || "DF".equals(uf) || "ES".equals(uf) || "GO".equals(uf)
				|| "MA".equals(uf) || "MT".equals(uf) || "MS".equals(uf) || "MG".equals(uf) || "PA".equals(uf)
				|| "PB".equals(uf) || "PR".equals(uf) || "PE".equals(uf) || "PI".equals(uf) || "RJ".equals(uf)
				|| "RN".equals(uf) || "RS".equals(uf) || "RO".equals(uf) || "RR".equals(uf) || "SC".equals(uf)
				|| "SP".equals(uf) || "SE".equals(uf) || "TO".equals(uf);

		if (estaCorretaUf) {
			System.out.println("UF esta correta!");
		} else {
			System.out.println("UF não esta correta!");
		}

		ler.close();
	}
}
