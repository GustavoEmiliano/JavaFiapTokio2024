package logica.exercicios.aula06;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.Month;

public class Exercicio06 {
	public static void main(String[]args) {
		
		 int anoAtual = LocalDateTime.now().getYear();
				
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com o seu ano de nascimento:");
		int anoNascimento = s.nextInt();
		int idade = anoAtual - anoNascimento;
	
		
		if(idade < 16 || idade >= 123) {
			System.out.println("Seu voto é proibido este ano");
		} else if(idade >= 18 && idade <= 70) {
			System.out.println("Seu voto é obrigatório este ano");
		}else {
			System.out.println("Seu voto é opcional este ano");
		}
		
	}

}
