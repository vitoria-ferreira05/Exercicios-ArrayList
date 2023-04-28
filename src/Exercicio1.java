import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner numeroDigitado = new Scanner(System.in);

        List<Integer> lista = new ArrayList<Integer>();

        System.out.println("Digite o valor de A: ");
        int a = numeroDigitado.nextInt();
        System.out.println("Digite o valor de B: ");
        int b = numeroDigitado.nextInt();

        int c;

        if (a == b) {
            c = a + b;
            System.out.println(a + " + " + b + " = " + c);
        } else {
            c = a * b;
            System.out.println(a + " * " + b + " = " + c);
        }

        lista.add(c);

        System.out.println("Resultado = " + lista.get(0));
    }
}
