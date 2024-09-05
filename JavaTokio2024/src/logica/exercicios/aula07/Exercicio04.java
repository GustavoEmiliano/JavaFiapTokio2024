package logica.exercicios.aula07;

import java.util.*;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double soma = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Entre com um número para somar: ");
			double numero = sc.nextDouble();
			
			soma += numero;
		}
		
		System.out.println("A soma de todos os números inseridos foi de: " + soma);
	}

}
