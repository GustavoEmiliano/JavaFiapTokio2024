package logica.exercicios.aula06;


import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scanner = new  Scanner(System.in);
		
		System.out.println("Entre com a distância total percorrida(em km): ");
		double distanciaPercorrida = scanner.nextDouble();
		
		System.out.println("Entre com o consumo gasto total(em litros): ");
		double consumoTotal = scanner.nextDouble();
		
		double consumoMedio = (distanciaPercorrida / consumoTotal);
		
		
		
		if(consumoMedio < 8 ) {
			System.out.println("Esse carro bebe hein!");
		} else {
			System.out.println("Autonomia legal!");
		}
		
	}

}
