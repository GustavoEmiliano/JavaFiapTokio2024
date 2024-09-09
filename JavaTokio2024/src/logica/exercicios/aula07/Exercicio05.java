package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double numeroAtualizado = 0;
		
		for(int i = 1; i <= 12; i++) {
			System.out.println("Entre com 12 números e após exibiremos o maior: ");
			double numero = sc.nextDouble();
			if(numero > numeroAtualizado) {
				numeroAtualizado = numero;
			}
			
			System.out.println("O maior número inserido foi de: " + numeroAtualizado);

		}		
	}
}
