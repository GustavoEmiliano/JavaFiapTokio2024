package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double A = s.nextInt();
		double B = s.nextInt();
		
		double mediaFinal = ( A * 0.4) + (B * 0.6);
		System.out.println(mediaFinal);
	}

}
