import java.util.Scanner;

public class Exercicio09 {
    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        int[] numeros = lerNumeros(leitor, 80);

        int quantidadeIntervalo = contarNumerosNoIntervalo(numeros, 10, 150);

        System.out.println("Quantidade de números no intervalo [10, 150]: " + quantidadeIntervalo);

        leitor.close();
    }

    static int[] lerNumeros(Scanner scanner, int quantidade) {
        int[] numeros = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            numeros[i] = scanner.nextInt();
        }
        return numeros;
    }

    static int contarNumerosNoIntervalo(int[] numeros, int limiteInferior, int limiteSuperior) {
        int contador = 0;
        for (int numero : numeros) {
            if (numero >= limiteInferior && numero <= limiteSuperior) {
                contador++;
            }
        }
        return contador;
    }
}
