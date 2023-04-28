import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        //2. Faça um algoritmo que leia uma variável e some 5 caso seja par ou
        //some 8 caso seja ímpar, imprimir o resultado desta operação.

        Scanner sc = new Scanner(System.in);

        List<Integer> lista = new ArrayList<Integer>();

        System.out.println("Digite um número: ");

        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            numero = numero + 5;
        } else {
            numero = numero + 8;
        }
        lista.add(numero);
        System.out.println("Resultado: " + lista.get(0));

    }
}
