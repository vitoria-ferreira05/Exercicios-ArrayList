import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        //8. Leia um conjunto de salários, sendo que para terminar a entrada será
        //fornecido o valor -1. Após toda a entrada ter sido realizada, leia o valor
        //de um reajuste. Em seguida exiba todos os salários já reajustados.

        Scanner valorDigitado = new Scanner(System.in);

        //lista de salários
        List<Double> salarios = new ArrayList<>();

        //informando o salário ou o -1
        System.out.println("---INFORME O SALÁRIO--");
        double salario = 0;
        while (salario != -1) {
            System.out.println("Digite o salário ou o -1 para sair: ");
            salario = valorDigitado.nextDouble();

            if (salario != -1) {
                salarios.add(salario);
            }
        }

        //informando valor de um reajuste
        System.out.println("---INFORME O REAJUSTE---");
        System.out.println("Digite o reajuste (%): ");
        double reajuste = valorDigitado.nextDouble() / 100.0;

        //salario digitado com o resjuste
        for (int i = 0; i < salarios.size(); i++) {
            System.out.println("---VALOR DO SALÁRIO ATUALIZADO---");
            double salarioReajustado = salarios.get(i) * reajuste;
            System.out.println("O valor que será somado com o salário de R$ " + salarios.get(i) + " será R$ " + salarioReajustado);
            double valorTotalDoSalario = salarios.get(i) + salarioReajustado;
            System.out.println("Valor total do salário com reajuste: R$ " + valorTotalDoSalario);
        }
    }
}
