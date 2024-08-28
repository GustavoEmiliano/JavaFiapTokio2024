package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com seu nome:");
		String nome = sc.nextLine();
		char genero = sc.next().charAt(0);
		
		System.out.printf("Olá, %s !Você escolheu a seguinte opção de gênero: %c", nome, genero );
		
	}

}
