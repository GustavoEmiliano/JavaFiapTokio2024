package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com o valor A: ");
		int A = s.nextInt();
		
		System.out.println("Entre com o valor B: ");
		int B = s.nextInt();
		
		if(B == 0) {
			System.out.println("Divisão por 0 não é possível!");
		} else if (A % B == 0) {
			System.out.println("São multiplos!");
		} else {
			System.out.println("Não são múltiplos!");
		}
		
		s.close();
	}
}
