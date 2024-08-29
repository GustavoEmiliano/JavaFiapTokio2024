package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual o número de anos que você tem?");
		int idadeAnos = scanner.nextInt();
		
		System.out.println("Qual o número de meses que você tem?");
		int idadeMeses = scanner.nextInt();
		
		System.out.println("Qual o número de dias que você tem?");
		int idadeDias = scanner.nextInt();
		
		int idadeAnosEmDias = idadeAnos * 365;
		int idadeMesesEmDias = idadeMeses * 30; 
				
	}

}
