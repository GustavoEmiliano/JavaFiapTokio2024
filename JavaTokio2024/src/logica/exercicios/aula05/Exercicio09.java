package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		int numero = s.nextInt();
		
		int numeroCentena = (numero / 100) * 100;
		int numeroDezena = (numero % 100) * 10;
		int numeroUnidade = (numero % 10);
		
		if(numero < 999 || numero > 0) {
		
		System.out.println("Centena = " + numeroCentena);
		System.out.println("Dezena = " + numeroDezena);
		System.out.println("Unidade = " + numeroUnidade);
		
		}
	}

}
