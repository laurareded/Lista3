import java.util.Scanner;

public class Exercicio19 {
    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite os três lados do triângulo:");
        int lado1 = leitor.nextInt();
        int lado2 = leitor.nextInt();
        int lado3 = leitor.nextInt();

        if (verificarTriangulo(lado1, lado2, lado3)) {
            System.out.println("Os valores informados podem ser os lados de um triângulo.");

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("É um triângulo Equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("É um triângulo Isósceles.");
            } else {
                System.out.println("É um triângulo Escaleno.");
            }
        } else {
            System.out.println("Os valores informados não formam um triângulo.");
        }

        leitor.close();
    }

    public static boolean verificarTriangulo(int lado1, int lado2, int lado3) {
        return (lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2);
    }
}
