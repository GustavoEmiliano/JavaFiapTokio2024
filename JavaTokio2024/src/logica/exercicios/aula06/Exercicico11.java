package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicico11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com o peso do seu caminhão em toneladas: ");
        double pesoToneladas = sc.nextDouble();
        
        double pesoKilogramas = (pesoToneladas * 1000);
        
        System.out.println("Entre com o código da carga transportada: ");
        int codigoCargaTransportada = sc.nextInt();
        
        System.out.println("Entre com o código do estado de origem da carga de um caminhão :");
        int codigoOrigemCarga = sc.nextInt();
        
        if (codigoCargaTransportada >= 10 && codigoCargaTransportada <= 20) {
        	double valorPagar = (pesoKilogramas * 100.00);
        } else if (codigoCargaTransportada > 20 && codigoCargaTransportada <= 30) {
        	double valorPagar = (pesoKilogramas * 250.00);
        } else if (codigoCargaTransportada > 30 && codigoCargaTransportada <= 40) {
        	double valorPagar = (pesoKilogramas * 340.00);
        }
	}

}
