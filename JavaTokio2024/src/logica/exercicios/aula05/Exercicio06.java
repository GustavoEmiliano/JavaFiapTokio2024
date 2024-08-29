package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[]args) {
	
	Scanner scanner = new Scanner(System.in);
	
	
	// Peças 1
	System.out.println("Digite o nome da sua peça1:");
	scanner.nextLine();
	String peca1 = scanner.nextLine();
	
	System.out.println("Digite a quantidade de peças 1 que vocÊ tem");
	scanner.nextLine();
	int numPecas1 = scanner.nextInt();
	
	System.out.println("Digite o valor unitário da peça 1");
	scanner.nextLine();
	double valorPecas1 = scanner.nextDouble();
	
	// Peças 2
	
	System.out.println("Digite o nome da sua peça2:");
	scanner.nextLine();
	String peca2 = scanner.nextLine();
	
	System.out.println("Digite a quantidade de peças 2 que vocÊ tem");
	scanner.nextLine();
	int numPecas2 = scanner.nextInt();
	
	System.out.println("Digite o valor unitário da peça 2");
	scanner.nextLine();
	double valorPecas2 = scanner.nextDouble();
	
	double valorTotalPecas1 = (numPecas1 * valorPecas1);
	double valorTotalPecas2 = (numPecas2 * valorPecas2);
	
	double valorTotalPecas = (valorTotalPecas1 + valorPecas2);
	
	System.out.printf("O valor total d epeças1 a ser pago é %d, e o valor total referente as peças2 é de: %d. A soma total da compra das peças 1 e 2 é de: %d", valorTotalPecas1, valorTotalPecas2, valorTotalPecas);
	
	}
}
