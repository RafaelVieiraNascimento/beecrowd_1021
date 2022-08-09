package program;

/*
beecrowd | 1021 - Notas e Moedas

Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário.
A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto.
As notas consideradas são de 100, 50, 20, 10, 5, 2.
As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial,
conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		
		int nota100 = (int) (valor / 100);
		valor = valor % 100;
		int nota50 = (int) (valor / 50);
		valor = valor % 50;
		int nota20 = (int) (valor / 20);
		valor = valor % 20;
		int nota10 = (int) (valor / 10);
		valor = valor % 10;
		int nota5 = (int) (valor / 5);
		valor = valor % 5;
		int nota2 = (int) (valor / 2);
		valor = valor % 2 * 100;
		int moeda1 = (int) (valor / 100);
		valor = valor % 100;
		int moeda50 = (int) (valor / 50);
		valor = valor % 50;
		int moeda25 = (int) (valor / 25);
		valor = valor % 25;
		int moeda10 = (int) (valor / 10);
		valor = valor % 10;
		int moeda5 = (int) (valor / 5);
		valor = valor % 5;
		int moeda01 = (int) (valor / 1);
		
		System.out.printf("NOTAS:\n"
				+ "%d nota(s) de R$ 100.00\n"
				+ "%d nota(s) de R$ 50.00\n"
				+ "%d nota(s) de R$ 20.00\n"
				+ "%d nota(s) de R$ 10.00\n"
				+ "%d nota(s) de R$ 5.00\n"
				+ "%d nota(s) de R$ 2.00\n"
				+ "MOEDAS:\n"
				+ "%d moeda(s) de R$ 1.00\n"
				+ "%d moeda(s) de R$ 0.50\n"
				+ "%d moeda(s) de R$ 0.25\n"
				+ "%d moeda(s) de R$ 0.10\n"
				+ "%d moeda(s) de R$ 0.05\n"
				+ "%d moeda(s) de R$ 0.01\n"
				,nota100, nota50, nota20, nota10, nota5, nota2
				,moeda1, moeda50, moeda25, moeda10, moeda5, moeda01);
		sc.close();
	}
}
