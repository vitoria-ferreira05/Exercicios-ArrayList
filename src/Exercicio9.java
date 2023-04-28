
public class Exercicio9 {
    public static <List> void main(String[] args) {
        //9. Crie um vetor capaz de armazenar 50 números inteiros. Em seguida
        //faça o seu preenchimento automático com os números de 101 a 150,
        //ou seja, na posição número 0 ponha 101, na posição 1 ponha o
        //número 102, e assim sucessivamente. Em seguida exiba os valores
        //deste vetor.

        int[] numeros = new int[50];

        int numeroInicial = 101;

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = numeroInicial;
            numeroInicial++;
        }

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Posição: " + i + ": " + numeros[i]);
        }
    }
}
