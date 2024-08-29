package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro valor: ");
		double numero1 = s.nextInt();
		System.out.println("Entre com o segundo valor: ");
		double numero2 = s.nextInt(); 
		s.nextLine();
		
	
		System.out.println("Qual operação você deseja realizar:");
		String caracter = s.nextLine();
		
		switch (caracter) {
			case "+":
				double resultadoSub = numero1 + numero2;
				System.out.println(resultadoSub);
				break;
			case "-":
				double resultadoSoma = numero1 - numero2;
				System.out.println(resultadoSoma);
				break;
			case "*":
				double resultadoMulti = numero1 * numero2;
				System.out.println(resultadoMulti);
				break;
			case "/":
				double resultadoDiv = numero1 / numero2;
				System.out.println(resultadoDiv);
				break;
			default:
				System.out.println("Error");
		}
	}
}
