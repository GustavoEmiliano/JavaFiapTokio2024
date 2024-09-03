package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Olá colaborador, entre com seu salário atual: ");
		double salarioAtual = scanner.nextDouble();
		
		if (salarioAtual < 280.00 ) {
			double salarioAtualizado = (salarioAtual + (salarioAtual * 0.20));
			double aumentoSalario = salarioAtualizado - salarioAtual;
			System.out.printf("O seu salário antigo era de: %.2f. Seu percentual de aumento foi de 20%%. Você obteve R$ %.2f de aumento. Seu salário atualizado é de: R$ %.2f", salarioAtual, aumentoSalario, salarioAtualizado);
		} else if (salarioAtual > 280.00 && salarioAtual < 700.00) {
			double salarioAtualizado = (salarioAtual + (salarioAtual * 0.15));
			double aumentoSalario = salarioAtualizado - salarioAtual;
			System.out.printf("O seu salário antigo era de: %.2f. Seu percentual de aumento foi de 15%%. Você obteve R$ %.2f de aumento. Seu salário atualizado é de: R$ %.2f", salarioAtual, aumentoSalario, salarioAtualizado);
		} else if (salarioAtual > 700.00 && salarioAtual < 1500.00) {
			double salarioAtualizado = (salarioAtual + (salarioAtual* 0.10));
			double aumentoSalario = salarioAtualizado - salarioAtual;
			System.out.printf("O seu salário antigo era de: %.2f. Seu percentual de aumento foi de 10%%. Você obteve R$ %.2f de aumento. Seu salário atualizado é de: R$ %f", salarioAtual, aumentoSalario, salarioAtualizado);
		} else {
			double salarioAtualizado = (salarioAtual + (salarioAtual * 0.05));
			double aumentoSalario = salarioAtualizado - salarioAtual;
			System.out.printf("O seu salário antigo era de: %.2f. Seu percentual de aumento foi de 5%%. Você obteve R$ %.2f de aumento. Seu salário atualizado é de: R$ %f", salarioAtual, aumentoSalario, salarioAtualizado);
		}

	}

}
