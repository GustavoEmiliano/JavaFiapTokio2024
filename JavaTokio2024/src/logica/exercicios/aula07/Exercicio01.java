package logica.exercicios.aula07;

import java.util.*;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String saida;
		
		do {
			System.out.println("Olá, Mundo");
			System.out.println("Você deseja exibir a mensagen novamente?");
			saida = scanner.nextLine().toLowerCase();

		} while (saida.equals("sim"));
		
		System.out.println("Fim");
		
		scanner.close();

	}
}