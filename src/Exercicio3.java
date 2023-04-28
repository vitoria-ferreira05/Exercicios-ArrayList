import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio3 {
    public static void main(String[] args) {
//        3. Escreva um algoritmo que leia o número de identificação, as 3 notas
//        obtidas por um aluno nas 3 verificações e a média dos exercícios que
//        fazem parte da avaliação, e calcule a média de aproveitamento,
//                usando a fórmula: MA := (nota1 + nota 2 * 2 + nota 3 * 3 + ME)/7

        Scanner valorDigitado = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Integer> numeroAluno = new ArrayList<Integer>();
        List<Double> notas = new ArrayList<Double>();
        List<Double> mediaNotasAlunos = new ArrayList<>();
        List<Double> mediaAprovitamentoAlunos = new ArrayList<>();

        System.out.println("---IDENTIFICAÇÃO DO ALUNO---");

        System.out.println("Digite o número de identificação do aluno: ");
        int numeroIdentif = valorDigitado.nextInt();

        System.out.println("---NOTAS DO ALUNO---");
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite as notas do aluno: ");
            double notasAluno = valorDigitado.nextInt();
            notas.add(notasAluno);
        }
        System.out.println("---MÉDIA DOS EXERCICIOS---");
        double mediaNotas = notas.get(0) + notas.get(1) + notas.get(2) / 3;
        mediaNotasAlunos.add(mediaNotas);
        System.out.println(mediaNotas);

        System.out.println("---MÉDIA DE APROVEITAMENTO--");
        double mediaAproveitamento = (notas.get(0) + +(notas.get(1) * 2) + (notas.get(2) * 3) + mediaNotas)
                / 7;
        mediaAprovitamentoAlunos.add(mediaAproveitamento);
        System.out.println(mediaAproveitamento);

        System.out.println("---MÉDIA DE APROVEITAMENTO CONCEITO---");

        if (mediaAproveitamento >= 90) {
            System.out.println("CONCEITO A");
            System.out.println("APROVADO!");
        } else if (mediaAproveitamento >= 75 && mediaAproveitamento < 90) {
            System.out.println("CONCEITO B");
            System.out.println("APROVADO!");
        } else if (mediaAproveitamento >= 60 && mediaAproveitamento < 75) {
            System.out.println("CONCEITO C");
            System.out.println("APROVADO!");
        } else if (mediaAproveitamento >= 40 && mediaAproveitamento < 60) {
            System.out.println("CONCEITO D");
            System.out.println("REPROVADO!");
        } else {
            System.out.println("CONCEITO E");
            System.out.println("REPROVADO!");
        }
    }

}
