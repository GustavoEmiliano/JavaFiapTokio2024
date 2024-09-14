package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int valor = scanner.nextInt();

        System.out.println("\nNúmeros pares entre 2 e " + valor + ":");
        for (int num = 2; num < valor; num++) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        scanner.close();
    }
}
