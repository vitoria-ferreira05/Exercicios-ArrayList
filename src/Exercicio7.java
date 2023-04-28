import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        //7. Leia o nome um número do usuário um número N e escreva o nome
        //dele na tela N vezes

        Scanner sc = new Scanner(System.in);

        List<String> nomeDoUsuário = new ArrayList<>();
        List<Integer> numeroDoUsuário = new ArrayList<>();

        System.out.println("Digite o número do usuário: ");
        numeroDoUsuário.add(sc.nextInt());

        System.out.println("Digite o nome do usuário: ");
            nomeDoUsuário.add(sc.next());

        }


    }

