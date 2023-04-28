import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        //5. Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100.
        Scanner sc = new Scanner(System.in);
        int qtde = 0;
        List<Integer> numeros = new ArrayList<Integer>();

        System.out.println("Digite 20 números: ");

        for (int i = 0; i < 20; i++) {
            numeros.add(sc.nextInt());
        }

        for (int num : numeros){
            if (num >= 0 && num <= 100){
                qtde++;
            }
        }
        System.out.println("Tem " + qtde + " números entre 0 e 100!");
    }
}
