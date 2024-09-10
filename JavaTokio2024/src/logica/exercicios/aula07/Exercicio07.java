package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota;
        double somaNotas = 0;
        int qtdAlunosAcimaMedia = 0;

        int quantidadeAlunos = 20;

        System.out.println("Informe a média da turma: ");
        double mediaInformada = scanner.nextDouble();

        double[] notas = new double[quantidadeAlunos];
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("Entre com a nota do aluno " + (i + 1) + ": ");
            nota = scanner.nextDouble();
            notas[i] = nota;
            somaNotas += nota;
        }

        double mediaCalculada = somaNotas / quantidadeAlunos;

        if (mediaCalculada == mediaInformada) {
            for (int i = 0; i < quantidadeAlunos; i++) {
                if (notas[i] >= mediaCalculada) {
                    qtdAlunosAcimaMedia++;
                }
            }

            System.out.println("A quantidade de alunos que estão acima da média calculada é: " + qtdAlunosAcimaMedia);
        } else {
            System.out.println("A média calculada (" + mediaCalculada + ") é diferente da média informada (" + mediaInformada + ").");
        }

        scanner.close();
    }
}
