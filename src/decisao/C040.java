package decisao;

import java.util.Scanner;

/* 
 * Desenvolva um algoritmo que calcule o consumo de combustível de um automóvel em
 * uma determinada viagem. O programa deve solicitar as seguintes informações ao usuário:
 * a) Quantos quilômetros tem a viagem?
 * b) Quantos quilômetros o carro faz por litro?
 * c) Qual o preço do litro do combustível?
 * 
 * O processamento do algoritmo deve responder as seguintes questões:
 * d) Quantos litros de combustível serão gastos com a viagem?
 * e) Quanto será gasto, em dinheiro, para realizar esta viagem?
 * 
 * @author giovanebarcelos
 */

public class C040 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Quantos quilômetros tem a viagem? ");
		float kmViagem = ler.nextFloat();

		System.out.print("Quantos quilômetros o carro faz por litro? ");
		float kmCarroPorLitro = ler.nextFloat();

		System.out.print("Qual o preço do litro do combustível? ");
		float precoLitroCombustivel = ler.nextFloat();

		float litrosCombustivel = kmViagem / kmCarroPorLitro;
		double custoViagem = litrosCombustivel * precoLitroCombustivel;

		System.out.println("Informações da Viagem");
		System.out.printf("Litros de combustível gastos na vigem: %.2f\n", litrosCombustivel);
		System.out.printf("Custo da Viagem: %.2f", custoViagem);

		ler.close();
	}
}