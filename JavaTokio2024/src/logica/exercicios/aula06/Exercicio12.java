package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
	      System.out.println("Digite os três lados do triângulo:");
	        int a = scanner.nextInt();
	        int b = scanner.nextInt();
	        int c = scanner.nextInt();
	        
	        if (a < b) {
	            int temp = a;
	            a = b;
	            b = temp;
	        }
	        if (a < c) {
	            int temp = a;
	            a = c;
	            c = temp;
	        }
	        if (b < c) {
	            int temp = b;
	            b = c;
	            c = temp;
	        }
	        
	        System.out.println("Lados em ordem decrescente: " + a + ", " + b + ", " + c);
	        
	        if (a >= b + c) {
	            System.out.println("NAO FORMA TRIANGULO");
	        } else {
	            if (a * a == b * b + c * c) {
	                System.out.println("TRIANGULO RETANGULO");
	            } else if (a * a > b * b + c * c) {
	                System.out.println("TRIANGULO OBTUSANGULO");
	            } else if (a * a < b * b + c * c) {
	                System.out.println("TRIANGULO ACUTANGULO");
	            }
	            
	            if (a == b && b == c) {
	                System.out.println("TRIANGULO EQUILATERO");
	            } else if (a == b || b == c || a == c) {
	                System.out.println("TRIANGULO ISOSCELES");
	            }
	        }
	        
	        scanner.close();
	    }
	}