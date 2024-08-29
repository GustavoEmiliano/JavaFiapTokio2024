package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Entre com as suas 4 notas:");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        double nota4 = scanner.nextDouble();
        
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media >= 5 && media < 7) {
            System.out.println("Em recuperação!");
        } else {
            System.out.println("Reprovado!");
        }
        
        scanner.close();
    }
}
