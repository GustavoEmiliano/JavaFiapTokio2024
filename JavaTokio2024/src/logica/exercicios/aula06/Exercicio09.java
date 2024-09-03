package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("=================================");
        System.out.println("           MENU PRINCIPAL         ");
        System.out.println("=================================");
        System.out.println("|         1 - Clientes          |");
        System.out.println("|         2 - Comércio          |");                
        System.out.println("|         3 - Indústria         |"); 
        System.out.println("=================================");
        System.out.print("Digite o número da opção desejada: ");
        int opcao = scanner.nextInt();
        
        System.out.println("Digite o consumo em KwH: ");
        double consumoKwh = scanner.nextDouble();
        
        double valorKwH = 0;
        
        switch(opcao) {
        
        case 1:
        	valorKwH = 0.60;
        	break;
        case 2:
        	valorKwH = 0.48;
        	break;
        case 3:
        	valorKwH = 1.29;
        	break;
        default:
        	System.out.println("Tipo de cliente inválido");
        	break;
        	 
        }
        
        double conta = valorKwH * consumoKwh;
        System.out.printf("O valor da conta é de: R$ %.2f",  conta);
        
	}

}
