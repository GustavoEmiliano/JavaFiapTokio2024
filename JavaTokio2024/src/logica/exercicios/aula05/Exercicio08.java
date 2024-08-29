package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final double TAXA_DOLAR = 0.18;   
        final double TAXA_EURO = 0.16;    
        final double TAXA_PESO_ARG = 168.99;
        final double TAXA_LIBRA = 0.13;  
        final double TAXA_IENE = 25.75;
        
        System.out.println("Entre com o valor em R$:");
        double valorReal = sc.nextDouble();
        
        System.out.printf("Valor em Real:", valorReal);
        System.out.printf("Valor em Dólar:", (valorReal * TAXA_DOLAR));
        System.out.printf("Valor em Euro:", (valorReal * TAXA_EURO));
        System.out.printf("Valor em Peso Argentino:", (valorReal * TAXA_PESO_ARG));
        System.out.printf("Valor em Libra:", (valorReal * TAXA_LIBRA));
        System.out.printf("Valor em Iene:", (valorReal * TAXA_IENE));




        
	}
}
