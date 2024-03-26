import java.util.Scanner;

public class Exercicio05 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor da compra:");
        double valorCompra = leitor.nextDouble();
        
        double[] prestacoes = calcularPrestacoes(valorCompra);
        
        System.out.println("Valor das prestações:");
        for (int i = 0; i < prestacoes.length; i++) {
            System.out.println("Prestação " + (i + 1) + ": R$" + prestacoes[i]);
        }
        
        leitor.close();
    }

    static double[] calcularPrestacoes(double valorCompra) {
        double[] prestacoes = new double[5];
        double valorPrestacao = valorCompra / 5;
        for (int i = 0; i < prestacoes.length; i++) {
            prestacoes[i] = valorPrestacao;
        }
        return prestacoes;
    }
}
