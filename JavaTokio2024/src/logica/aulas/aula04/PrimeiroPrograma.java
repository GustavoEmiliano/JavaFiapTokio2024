package logica.aulas.aula04;
import java.util.Scanner;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com o seu nome:");
		String nome = s.nextLine();
		System.out.println("Olá," + nome + "!");
		System.out.printf("Olá %s!\n", nome);
		
		int idade;
		idade = 25;
		System.out.println("Sua idade é" + idade);
		
		idade = 42;
		System.out.println(idade);
		
		double salario = 1530.24;
		System.out.println(salario);
	
		s.close();
		
	}

}
