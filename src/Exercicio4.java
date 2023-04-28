import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        //4. Leia a idade de 20 pessoas e exiba a média das idades

        Scanner valorDigitado = new Scanner(System.in);

        List<Integer> idades = new ArrayList<>();
        List<Double> mediaIdade = new ArrayList<>();
        int soma = 0;

        for (int i = 0; i < 20; i++){
            System.out.println("Idade número: " +  + i);
            int idade = valorDigitado.nextInt();
            idades.add(idade);
            soma = soma + idade;
        }

            double mediaId = soma / idades.size();
            System.out.println("Média das idades: " + mediaId);

        }

    }

