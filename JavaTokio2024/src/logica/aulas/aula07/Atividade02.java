package logica.aulas.aula07;

import java.util.Scanner;

// Sem loop
public class Atividade02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.print("Digite um número: ");
		n = scanner.nextInt();
		
		System.out.println(n + " x 1 = " + (n * 1));
		System.out.println(n + " x 2 = " + (n * 2));
		System.out.println(n + " x 3 = " + (n * 3));
		System.out.println(n + " x 4 = " + (n * 4));
		System.out.println(n + " x 5 = " + (n * 5));
	}

}
