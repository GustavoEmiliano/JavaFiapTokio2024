package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
				
		final int A = 5;
		final int B = 7;
		final int C = 4;
		final int D = 8;
		
		boolean a = (A <= B) && (B < D);
		boolean b = (A == B) || (C != B);
		boolean c = (D > A) && (C>=B);
		boolean d = (A <= B) || (C <= D);
		boolean e = (B > C) || (C < A) && (D <= B);
		
		System.out.println("Questão 1: " + a);
		System.out.println("Queestão2:" + b);
		System.out.println("Questão 3: " + c);
		System.out.println("Questão 4: " + d);
	}

}
