package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("VERIFICA PAR OU IMPAR");
		System.out.println("Entre com um número: ");
		int numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O número inserido é par");
		} else {
			System.out.println("O número inserido é impar");
		}
		
		sc.close();
	}

}
