import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        //6. Escreva um algoritmo que leia uma sequência de números do
        //usuário e realize a soma desses números. Encerre a execução
        //quando um número negativo for digitado.

        List<Integer> numeros = new ArrayList<>();
        int soma= 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            System.out.println("DIGITE OS NÚMEROS: ");
            numeros.add(sc.nextInt());
        }
        System.out.println(numeros);

        for (int i = 0; i < numeros.size(); i++){
            soma = soma + numeros.get(i);
        }
        System.out.println("A soma dos números é: " + soma);
    }
}
