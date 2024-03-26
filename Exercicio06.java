import java.util.Scanner;

public class Exercicio06 {
    public static void executar() {

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o preço de custo do produto:");
        double precoCusto = leitor.nextDouble();
        
        System.out.println("Digite o percentual de acréscimo (%):");
        double percentualAcrescimo = leitor.nextDouble();
        
        double precoVenda = calcularPrecoVenda(precoCusto, percentualAcrescimo);
        
        System.out.println("O valor de venda do produto é: R$" + precoVenda);
        
        leitor.close();
    }

    static double calcularPrecoVenda(double precoCusto, double percentualAcrescimo) {
        double acrescimo = precoCusto * (percentualAcrescimo / 100);
        return precoCusto + acrescimo;
    }
}
