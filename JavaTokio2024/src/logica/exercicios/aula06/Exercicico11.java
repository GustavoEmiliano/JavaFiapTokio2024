package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicico11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com o peso do seu caminhão em toneladas: ");
        double pesoToneladas = sc.nextDouble();
        
        double pesoKilogramas = (pesoToneladas * 1000);
        System.out.println(pesoKilogramas);
        
        System.out.println("Entre com o código da carga transportada: ");
        int codigoCargaTransportada = sc.nextInt();
        
        System.out.println("Entre com o código do estado de origem da carga de um caminhão :");
        int codigoOrigemCarga = sc.nextInt();
        
        double valorPagar = 0;
        double valorFinal = 0;
        
        if (codigoCargaTransportada >= 10 && codigoCargaTransportada <= 20) {
        	valorPagar = (pesoKilogramas * 100);
        	System.out.println(valorPagar);
        } else if (codigoCargaTransportada > 20 && codigoCargaTransportada <= 30) {
        	valorPagar = (pesoKilogramas * 250.00);
        } else if (codigoCargaTransportada > 30 && codigoCargaTransportada <= 40) {
        	valorPagar = (pesoKilogramas * 340.00);
        }
        
        System.out.println(valorFinal);
        
        switch(codigoOrigemCarga) {
        case 1:
        	valorFinal = (valorPagar * 1.35);
        	System.out.println("O valor que você deve pagar é de: R$" + valorFinal);
        	break;
        case 2:
        	valorFinal = (valorPagar * 1.25);
        	System.out.println("O valor que você deve pagar é de: R$" + valorFinal);
        	break;
        case 3:
        	valorFinal = (valorPagar * 1.15);
        	System.out.println("O valor que você deve pagar é de: R$" + valorFinal);
        	break;
        case 4:
        	valorFinal = (valorPagar * 1.05);
        	System.out.println("O valor que você deve pagar é de: R$" + valorFinal);
        	break;
        case 5:
        	System.out.println("Você está isento do imposto, deve pagar R$: " + valorFinal);
        	break;
        default:
        	System.out.println("Código de origem de carga inválido!");
        	
        }
        sc.close();
	}

}
