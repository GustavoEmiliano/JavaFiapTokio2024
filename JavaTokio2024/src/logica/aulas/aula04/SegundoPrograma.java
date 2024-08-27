package logica.aulas.aula04;

import java.util.Scanner;

public class SegundoPrograma {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nome = scanner.nextLine();
		System.out.println("Olá, " + nome);
		
		scanner.close();
		int idade = scanner.nextInt();	}

}
