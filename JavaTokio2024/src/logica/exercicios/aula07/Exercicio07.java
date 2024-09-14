package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int mediaTurma;
            int notasAbaixo = 0;
            int notasAcima = 0;
            int notaAluno;
    
            System.out.print("Informe a média da turma: ");
            mediaTurma = scanner.nextInt();
    
            for (int aluno = 1; aluno <= 20; aluno++) {
                System.out.printf("Digite a nota do aluno %d: ", aluno);
                notaAluno = scanner.nextInt();
                
                if (notaAluno > mediaTurma) {
                    notasAcima++;
                } else if (notaAluno < mediaTurma) {
                    notasAbaixo++;
                }
            }
    
            System.out.println("Quantidade de notas acima da média: " + notasAcima);
            System.out.println("Quantidade de notas abaixo da média: " + notasAbaixo);
    
            scanner.close();
        }
    }