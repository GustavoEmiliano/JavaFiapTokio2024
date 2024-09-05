package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com o número para calcular sua tabuada de 0 a 25: ");
		int n = s.nextInt();
		
		for(int i = 0; i <=25; i++) {
			int resultado = (i * n);
			System.out.println(resultado);
		}

	}

}
