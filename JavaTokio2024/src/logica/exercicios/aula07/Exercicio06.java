package logica.exercicios.aula07;
import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);

			System.out.println("Entre com um número:");
			int numero = scanner.nextInt();
			
			for (int i = 2; i <= numero; i+=2) {
				System.out.println(i);
			}
			
		}
	}