package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor do produto: ");
		double valorProduto = sc.nextDouble();
		System.out.println("Qual valor foi pago?");
		double valorPago = sc.nextDouble();
		
		double valorTroco = valorPago - valorProduto;
		
		if (valorPago <= valorProduto) {
			double valorPagar = (valorTroco * (-1)); 
			System.out.printf("O valor pago não foi o suficiente. Falta R$ %.2f", valorPagar);
		}else {
			System.out.println("O troco a ser recebido é de: " + valorTroco);
		}
		sc.close();
	}

}
