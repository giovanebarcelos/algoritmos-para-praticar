package decisao;

import java.util.Scanner;

/*
 * Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque
 * e quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média
 * ((quantidade média = quantidade máxima + quantidade mínima)/2). Se a quantidade em
 * estoque for maior ou igual a quantidade média escrever a mensagem 'Não efetuar compra',
 * senão escrever a mensagem 'Efetuar compra'.
 * 
 * @author giovanebarcelos
 */

public class C048 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Quantidade atual em estoque: ");
		float qtdeAtualEstoque = ler.nextFloat();

		System.out.print("Quantidade máxima em estoque: ");
		float qtdeMaxEstoque = ler.nextFloat();

		System.out.print("Quantidade mínima em estoque: ");
		float qtdeMinEstoque = ler.nextFloat();

		float qtdeMedia = (qtdeMinEstoque + qtdeMaxEstoque) / 2;

		if (qtdeAtualEstoque >= qtdeMedia) {
			System.out.println("Não efetuar compra!");
		} else {
			System.out.println("Efetuar compra!");
		}

		ler.close();
	}
}