package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Entre com o segundo número: ");
		int numero2 = sc.nextInt();
		
		if(numero1 == numero2) {
			System.out.println("Os números são iguais");
		} else if (numero1 > numero2) {
			System.out.printf("O número %d é maior entre os dois!", numero1);
		}  else {
			System.out.printf("O número %d é maior entre os dois!", numero2);
		}
		
		sc.close();
	}

}
