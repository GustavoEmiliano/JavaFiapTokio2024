package logica.exercicios.aula04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String nome = scanner.nextLine();
		int idade = scanner.nextInt();
		
		System.out.printf("Olá %s!. Você tem %d anos.", nome, idade);
		
		scanner.close();
	}

}
